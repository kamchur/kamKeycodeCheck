package com.kamchur.kamkeycodecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "KamKeycodeTest";
    TextView textView;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textMessage);
        toggleButton = (ToggleButton)findViewById(R.id.testToggle);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i(TAG, String.format(Locale.KOREA,"[keyCode] : %d ,\n [event] : %s", keyCode, event));
        textView.setText(String.format(Locale.KOREA,"[keyCode] : %d , [event] : %s", keyCode, event));

        if (keyCode == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE)
        {
            toggleButton();
        }

        return true;
    }

    private void toggleButton()
    {
        if (toggleButton.isChecked()) toggleButton.setChecked(false);
        else toggleButton.setChecked(true);
    }
}