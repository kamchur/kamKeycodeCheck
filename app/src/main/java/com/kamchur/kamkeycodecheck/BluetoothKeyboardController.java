package com.kamchur.kamkeycodecheck;

import android.widget.EditText;

public class BluetoothKeyboardController {
    private EditText currentInputConnection;
    private BluetoothKeyboardKor bluetoothKeyboardKor;
    private BluetoothKeyboardEng bluetoothKeyboardEng;
    private BluetoothKeyboardNum bluetoothKeyboardNum;

    public BluetoothKeyboardController(EditText currentInputConnection)
    {
        //onCreate
        this.currentInputConnection = currentInputConnection;
        bluetoothKeyboardKor = new BluetoothKeyboardKor(currentInputConnection);
        bluetoothKeyboardEng = new BluetoothKeyboardEng(currentInputConnection);
        bluetoothKeyboardNum = new BluetoothKeyboardNum(currentInputConnection);
    }

    //registerController
    public void setCurrentInputConnection(EditText currentInputConnection) { this.currentInputConnection = currentInputConnection; }

    private INPUT_STATE input_state = INPUT_STATE.HAN;
    public enum INPUT_STATE {HAN, ENG, NUM}
    public void setKeyState(INPUT_STATE state) {
        this.input_state = state;
        finishComposingText();
        TJLog.d("kam -- state : " + state);
    }


    public void setKeySignal(int signal)
    {
        TJLog.d("kam -- signal : " + signal);

        if (signal == -1) return;

        switch (input_state)
        {
            case HAN:
                // setHangleMaker( signal );
                break;

            case ENG:
                bluetoothKeyboardEng.setEnglishMaker(signal);
                break;

            case NUM:
                bluetoothKeyboardNum.setNumberMaker(signal);
                break;
        }
    }

    private boolean DPAD = false;

    public void setDPAD(boolean DPAD) {
        TJLog.e("kam -- DPAD : " + DPAD);
        this.DPAD = DPAD;
    }

    public void finishComposingText()
    {
        currentInputConnection.setSelection(currentInputConnection.getText().length());
        currentInputConnection.requestFocus();
    }
}
