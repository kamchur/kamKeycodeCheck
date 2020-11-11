package com.kamchur.kamkeycodecheck;

import android.widget.EditText;

public class BluetoothKeyboardEng {
    private EditText currentinputTextConnection;

    public BluetoothKeyboardEng(EditText currentinputTextConnection) {
        this.currentinputTextConnection = currentinputTextConnection;
    }

    char inputText = '\u0000';

    private short order_vw   = 0;   //0 자리가 헛갈릴것 같구나.
    private short order_op   = 0;
    private short order_ab   = 0;
    private short order_cd   = 0;
    private short order_ef   = 0;
    private short order_gh   = 0;
    private short order_ij   = 0;
    private short order_kl   = 0;
    private short order_mn   = 0;
    private short order_qr   = 0;
    private short order_stu  = 0;
    private short order_xyz  = 0;
    private short order_feel = 0;  //.,!'

    private final short btn_vw   = 0x00;
    private final short btn_ab   = 0x01;
    private final short btn_cd   = 0x02;
    private final short btn_ef   = 0x03;
    private final short btn_gh   = 0x04;
    private final short btn_ij   = 0x05;
    private final short btn_kl   = 0x06;
    private final short btn_mn   = 0x07;
    private final short btn_op   = 0x08;
    private final short btn_qr   = 0x09;
    private final short btn_stu  = 0x10;
    private final short btn_xyz  = 0x11;
    private final short btn_feel = 0x12;

    private short btn_state = -1;
    private boolean finishComposing = false;

    public void setEnglishMaker(int signal)
    {
        switch(signal)
        {
            case 0:
                if (btn_state != btn_vw)
                {
                    finishComposing = true;
                    order_vw = 0;
                }
                btn_state = btn_vw;
                switch(order_vw)
                {
                    case 0:
                        inputText = 'V';
                        order_vw = 1;
                        break;
                    case 1:
                        inputText = 'W';
                        order_vw = 0;
                        break;
                }
                break;
            case 1:
                if (btn_state != btn_ab)
                {
                    finishComposing = true;
                    order_ab = 0;
                }
                btn_state = btn_ab;
                switch(order_ab)
                {
                    case 0:
                        inputText = 'A';
                        order_ab = 1;
                        break;
                    case 1:
                        inputText = 'B';
                        order_ab = 0;
                        break;
                }
                break;
            case 2:
                if (btn_state != btn_cd)
                {
                    finishComposing = true;
                    order_cd = 0;
                }
                btn_state = btn_cd;
                switch(order_cd)
                {
                    case 0:
                        inputText = 'C';
                        order_cd = 1;
                        break;
                    case 1:
                        inputText = 'D';
                        order_cd = 0;
                        break;
                }
                break;
            case 3:
                if (btn_state != btn_ef)
                {
                    finishComposing = true;
                    order_ef = 0;
                }
                btn_state = btn_ef;
                switch(order_ef)
                {
                    case 0:
                        inputText = 'E';
                        order_ef = 1;
                        break;
                    case 1:
                        inputText = 'F';
                        order_ef = 0;
                        break;
                }
                break;
            case 4:
                if (btn_state != btn_gh)
                {
                    finishComposing = true;
                    order_gh = 0;
                }
                btn_state = btn_gh;
                switch(order_gh)
                {
                    case 0:
                        inputText = 'G';
                        order_gh = 1;
                        break;
                    case 1:
                        inputText = 'H';
                        order_gh = 0;
                        break;
                }
                break;
            case 5:
                if (btn_state != btn_ij)
                {
                    finishComposing = true;
                    order_ij = 0;
                }
                btn_state = btn_ij;
                switch(order_ij)
                {
                    case 0:
                        inputText = 'I';
                        order_ij = 1;
                        break;
                    case 1:
                        inputText = 'J';
                        order_ij = 0;
                        break;
                }
                break;
            case 6:
                if (btn_state != btn_kl)
                {
                    finishComposing = true;
                    order_kl = 0;
                }
                btn_state = btn_kl;
                switch(order_kl)
                {
                    case 0:
                        inputText = 'K';
                        order_kl = 1;
                        break;
                    case 1:
                        inputText = 'L';
                        order_kl = 0;
                        break;
                }
                break;
            case 7:
                if (btn_state != btn_mn)
                {
                    finishComposing = true;
                    order_mn = 0;
                }
                btn_state = btn_mn;
                switch(order_mn)
                {
                    case 0:
                        inputText = 'M';
                        order_mn = 1;
                        break;
                    case 1:
                        inputText = 'N';
                        order_mn = 0;
                        break;
                }
                break;
            case 8:
                if (btn_state != btn_op)
                {
                    finishComposing = true;
                    order_op = 0;
                }
                btn_state = btn_op;
                switch(order_op)
                {
                    case 0:
                        inputText = 'O';
                        order_op = 1;
                        break;
                    case 1:
                        inputText = 'P';
                        order_op = 0;
                        break;
                }
                break;
            case 9:
                if (btn_state != btn_qr)
                {
                    finishComposing = true;
                    order_qr = 0;
                }
                btn_state = btn_qr;
                switch(order_qr)
                {
                    case 0:
                        inputText = 'Q';
                        order_qr = 1;
                        break;
                    case 1:
                        inputText = 'R';
                        order_qr = 0;
                        break;
                }
                break;
            case 10:    //STU
                if (btn_state != btn_stu)
                {
                    finishComposing = true;
                    order_stu = 0;
                }
                btn_state = btn_stu;
                switch(order_stu)
                {
                    case 0:
                        inputText = 'S';
                        order_stu = 1;
                        break;
                    case 1:
                        inputText = 'T';
                        order_stu = 2;
                        break;
                    case 2:
                        inputText = 'U';
                        order_stu = 0;
                        break;
                }
                break;
            case 11:    //XYZ
                if (btn_state != btn_xyz)
                {
                    finishComposing = true;
                    order_xyz = 0;
                }
                btn_state = btn_xyz;
                switch(order_xyz)
                {
                    case 0:
                        inputText = 'X';
                        order_xyz = 1;
                        break;
                    case 1:
                        inputText = 'Y';
                        order_xyz = 2;
                        break;
                    case 2:
                        inputText = 'Z';
                        order_xyz = 0;
                        break;
                }
                break;
            case 12:    //.,!'
                if (btn_state != btn_feel)
                {
                    finishComposing = true;
                    order_feel = 0;
                }
                btn_state = btn_feel;
                switch(order_feel)
                {
                    case 0:
                        inputText = '.';
                        order_feel = 1;
                        break;
                    case 1:
                        inputText = ',';
                        order_feel = 2;
                        break;
                    case 2:
                        inputText = '!';
                        order_feel = 3;
                        break;
                    case 3:
                        inputText = '\'';
                        order_feel = 0;
                        break;
                }
                break;
        }
//        currentinputTextConnection.getText().insert(currentinputTextConnection.getSelectionEnd(), put(inputText));
        setComposingText(inputText, finishComposing);
        finishComposing = false;
    }


    private void finishComposingText()
    {
//        currentinputTextConnection.setSelection(currentinputTextConnection.getText().length());
//        currentinputTextConnection.requestFocus();
        currentinputTextConnection.getText().insert(currentinputTextConnection.getText().length()+1, "");
    }

    private void setComposingText(char input, boolean composing)
    {
        int len = currentinputTextConnection.getText().length();
        TJLog.d("kam -- len : " + len);
        if (composing)
        {
            currentinputTextConnection.append(put(input));
        }
        else
        {
            if (len == 0) currentinputTextConnection.append(put(input));
            else currentinputTextConnection.getText().replace(len-1, len, put(input));
        }
    }

    private String put(char currentText) { return Character.toString(currentText); }
}
