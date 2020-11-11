package com.kamchur.kamkeycodecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "KamKeycodeTest";
    TextView textView;
    ToggleButton toggleButton;
    EditText testEdit;
    BluetoothKeyboardController bluetoothKeyboardController;

    InputMethodManager imm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        testEdit = (EditText) findViewById(R.id.testEdit);

        testEdit.setImeOptions(EditorInfo.IME_FLAG_NO_EXTRACT_UI);
        imm.hideSoftInputFromWindow(testEdit.getWindowToken(), 0);


        textView = (TextView)findViewById(R.id.textMessage);
        toggleButton = (ToggleButton)findViewById(R.id.testToggle);

        Button pickBtn = (Button)findViewById(R.id.pick);
        pickBtn.setOnClickListener(bt -> pickme());

        Button outBtn = (Button)findViewById(R.id.testBtn);
        outBtn.setOnClickListener(bt -> finish());

        bluetoothKeyboardController = new BluetoothKeyboardController(testEdit);
    }//End of 'onCreate'

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        TJLog.i(String.format(Locale.KOREA,"[keyCode'Down'] : %d ,\n [event] : %s", keyCode, event));
        textView.setText(String.format(Locale.KOREA,"[keyCode] : %d , [event] : %s", keyCode, event));

        int input = -1;
        switch(keyCode)
        {
            case KeyEvent.KEYCODE_KANA:
                bluetoothKeyboardController.setKeyState(BluetoothKeyboardController.INPUT_STATE.HAN);
                return true;
            case KeyEvent.KEYCODE_YEN:
                bluetoothKeyboardController.setKeyState(BluetoothKeyboardController.INPUT_STATE.ENG);
                return true;
            case KeyEvent.KEYCODE_TV_TIMER_PROGRAMMING:
                bluetoothKeyboardController.setKeyState(BluetoothKeyboardController.INPUT_STATE.NUM);
                return true;

            case KeyEvent.KEYCODE_DPAD_LEFT:
            case KeyEvent.KEYCODE_DPAD_RIGHT:
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_DPAD_DOWN:
                bluetoothKeyboardController.setDPAD(true);
                return true;

            case KeyEvent.KEYCODE_NUMPAD_0:
                input = 0;
                break;
            case KeyEvent.KEYCODE_NUMPAD_1:
                input = 1;
                break;
            case KeyEvent.KEYCODE_NUMPAD_2:
                input = 2;
                break;
            case KeyEvent.KEYCODE_NUMPAD_3:
                input = 3;
                break;
            case KeyEvent.KEYCODE_NUMPAD_4:
                input = 4;
                break;
            case KeyEvent.KEYCODE_NUMPAD_5:
                input = 5;
                break;
            case KeyEvent.KEYCODE_NUMPAD_6:
                input = 6;
                break;
            case KeyEvent.KEYCODE_NUMPAD_7:
                input = 7;
                break;
            case KeyEvent.KEYCODE_NUMPAD_8:
                input = 8;
                break;
            case KeyEvent.KEYCODE_NUMPAD_9:
                input = 9;
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_2:     //STU
                input = 10;
                break;
            case KeyEvent.KEYCODE_TV_MEDIA_CONTEXT_MENU:    //XYZ
                input = 11;
                break;
            case KeyEvent.KEYCODE_TV_INPUT_COMPONENT_1:     //.,!'
                input = 12;
                break;
        }
        bluetoothKeyboardController.setKeySignal(input);

        TJLog.e("kam -- start : " + testEdit.getSelectionStart());
        TJLog.e("kam -- end : " + testEdit.getSelectionEnd());

        return true;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return true;
    }

        private void pickme()
    {
        imm.showInputMethodPicker();
    }

}