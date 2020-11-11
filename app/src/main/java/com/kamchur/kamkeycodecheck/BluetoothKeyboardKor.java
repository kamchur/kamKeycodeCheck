package com.kamchur.kamkeycodecheck;

import android.widget.EditText;

public class BluetoothKeyboardKor {
    private EditText currentInputConnection;

    public void setCurrentInputConnection(EditText currentInputConnection) {
        this.currentInputConnection = currentInputConnection;
    }

    public BluetoothKeyboardKor(EditText currentInputConnection) {
        this.currentInputConnection = currentInputConnection;
    }
}
