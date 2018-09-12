package com.dophin.mondaypracticecomputer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    double result=0;
    int caculationbutton = 0;
    boolean hasfirst = true;
    StringBuilder equ = new StringBuilder();
    StringBuilder number = new StringBuilder();
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        textView =(TextView)findViewById(R.id.resultshow);
        int id = view.getId();
        switch (id) {
            case R.id.button_0:
                if( zerofirst() ){
                }else {
                    equ.append(0);
                    number.append(0);
                    hasfirst = false;
                    textView.setText(equ.toString());
                }
                break;
            case R.id.button_one:
                equ.append(1);
                number.append(1);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,equ.toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_two:
                equ.append(2);
                number.append(2);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_three:
                equ.append(3);
                number.append(3);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                equ.append(4);
                number.append(4);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                equ.append(5);
                number.append(5);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                equ.append(6);
                number.append(6);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                equ.append(7);
                number.append(7);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                equ.append(8);
                number.append(8);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                equ.append(9);
                number.append(9);
                hasfirst = false;
                textView.setText(equ.toString());
                Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_add:
                if(!hasfirst && equ.charAt( equ.length() -1 )!='+' && equ.charAt( equ.length() -1 )!='-'
                        && equ.charAt( equ.length() -1 )!='*' && equ.charAt( equ.length() -1 )!='/'){
                    count++;
                    if(count >= 2) {
                        //將暫存字串轉成double存入result後清空number(暫存字串)
                        Caculation();
                        caculationbutton = 1;
                        equ.delete(0,equ.length());
                        equ.append(result);
                        equ.append("+");
                        textView.setText(equ.toString());
                        count--;
                    }else  {
                        //將計算編號設成1，將number存到result裡面!~
                        caculationbutton = 1;
                        result += Double.parseDouble(equ.toString());
                        number.delete(0,number.length());
                        //更新TextView
                        equ.append("+");
                        textView.setText(equ.toString());
                    }
                }
                //Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_reduce:
                if(!hasfirst && equ.charAt( equ.length() -1 )!='+' && equ.charAt( equ.length() -1 )!='-'
                        && equ.charAt( equ.length() -1 )!='*' && equ.charAt( equ.length() -1 )!='/') {
                    count++;
                    if(count >= 2) {
                        //將暫存字串轉成double存入result後清空number(暫存字串)
                        Caculation();
                        caculationbutton = 2;
                        equ.delete(0,equ.length());
                        equ.append(result);
                        equ.append("-");
                        textView.setText(equ.toString());
                        count--;
                    }else  {
                        caculationbutton = 2;
                        result += Double.parseDouble(equ.toString());
                        number.delete(0,number.length());
                        equ.append("-");
                        textView.setText(equ.toString());
                    }
                }
                //Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_result:
                if(!hasfirst && equ.charAt( equ.length() -1 )!='+' && equ.charAt( equ.length() -1 )!='-'
                        && equ.charAt( equ.length() -1 )!='*' && equ.charAt( equ.length() -1 )!='/' && count >= 1) {
                    Caculation();
                    count = 0;
                    number.append(0);
                    equ.delete(0,equ.length());
                    equ.append(result);
                    result = 0;
                    textView.setText(equ.toString());
                }
                //Toast.makeText(this,"Button",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_multply:
                if(!hasfirst && equ.charAt( equ.length() -1 )!='+' && equ.charAt( equ.length() -1 )!='-'
                        && equ.charAt( equ.length() -1 )!='*' && equ.charAt( equ.length() -1 )!='/') {
                    count++;
                    if(count >= 2) {
                        //將暫存字串轉成double存入result後清空number(暫存字串)
                        Caculation();
                        caculationbutton = 3;
                        equ.delete(0,equ.length());
                        equ.append(result);
                        equ.append("*");
                        textView.setText(equ.toString());
                        count--;
                    }else  {
                        caculationbutton = 3;
                        result += Double.parseDouble(equ.toString());
                        number.delete(0,number.length());
                        equ.append("*");
                        textView.setText(equ.toString());
                    }
                }
                break;
            case R.id.button_divided:
                if(!hasfirst && equ.charAt( equ.length() -1 )!='+' && equ.charAt( equ.length() -1 )!='-'
                        && equ.charAt( equ.length() -1 )!='*' && equ.charAt( equ.length() -1 )!='/') {
                    count++;
                    if(count >= 2) {
                        //將暫存字串轉成double存入result後清空number(暫存字串)
                        Caculation();
                        caculationbutton = 4;
                        equ.delete(0,equ.length());
                        equ.append(result);
                        equ.append("/");
                        textView.setText(equ.toString());
                        count--;
                    }else  {
                        caculationbutton = 4;
                        result += Double.parseDouble(equ.toString());
                        number.delete(0,number.length());
                        equ.append("/");
                        textView.setText(equ.toString());
                    }
                }
                break;
            case R.id.button_clear:
                clear();
                break;
        }

    }

    private void Caculation() {
        switch (caculationbutton) {
            case 1:
                result += Double.parseDouble(number.toString());
                number.delete(0,number.length());
                caculationbutton = 0;
                break;
            case 2:
                result -= Double.parseDouble(number.toString());
                number.delete(0,number.length());
                caculationbutton = 0;
                break;
            case 3:
                result *= Double.parseDouble(number.toString());
                number.delete(0,number.length());
                caculationbutton = 0;
                break;
            case 4:
                result /= Double.parseDouble(number.toString());
                number.delete(0,number.length());
                caculationbutton = 0;
                break;
        }

    }

    private void clear() {
        textView = (TextView)findViewById(R.id.resultshow);
        result = 0;
        textView.setText("0");
        equ.delete(0,equ.length());
        number.delete(0,number.length());
        caculationbutton = 0;
        hasfirst = true;
        count = 0;
    }
    private boolean zerofirst() {
        if(equ.length() != 0) {
            if(equ.charAt(0) == '0') {
                return true;
            }
        }
        return false;
    }
}
