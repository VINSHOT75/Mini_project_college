package com.example.currency_converter2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v)
    {
        LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
        TextView result=(TextView)findViewById(R.id.result);
        EditText et1=(EditText)findViewById(R.id.editText1);
        double a=Double.parseDouble(String.valueOf(et1.getText()));
        RadioButton cb=(RadioButton)findViewById(R.id.cb);
        RadioButton fb=(RadioButton)findViewById(R.id.fb);


        if(cb.isChecked())
        {

            ll.setBackgroundColor(Color.WHITE);

            result.setText(rtod(a)+" Dollars ");
            fb.setChecked(true);
        }
        else
        {
            ll.setBackgroundColor(Color.WHITE);
            result.setText(dtor(a)+" Rupees");

            cb.setChecked(true);
        }
    }
    private double dtor(double c)
    {
        return (c*73.97);
    }
    private double rtod(double f)
    {
        return (f*0.014);
    }
}