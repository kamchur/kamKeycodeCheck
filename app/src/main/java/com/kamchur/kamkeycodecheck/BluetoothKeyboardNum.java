package com.kamchur.kamkeycodecheck;

import android.widget.EditText;

public class BluetoothKeyboardNum {
    private EditText currentInputConnection;

    public void setCurrentInputConnection(EditText currentInputConnection) {
        this.currentInputConnection = currentInputConnection;
    }

    public BluetoothKeyboardNum(EditText currentInputConnection) {
        this.currentInputConnection = currentInputConnection;
    }

    char input = '\u0000';

    public void setNumberMaker(int signal)
    {
        switch(signal)
        {
            case 0:
                input = '0';
                break;
            case 1:
                input = '1';
                break;
            case 2:
                input = '2';
                break;
            case 3:
                input = '3';
                break;
            case 4:
                input = '4';
                break;
            case 5:
                input = '5';
                break;
            case 6:
                input = '6';
                break;
            case 7:
                input = '7';
                break;
            case 8:
                input = '8';
                break;
            case 9:
                input = '9';
                break;
        }
        currentInputConnection.getText().insert(currentInputConnection.getText().length() ,put(input));
    }

    public String put(char currentText) { return Character.toString(currentText); }

}
