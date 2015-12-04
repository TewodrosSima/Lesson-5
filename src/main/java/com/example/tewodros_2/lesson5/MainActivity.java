package com.example.tewodros_2.lesson5;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        ll.setOrientation(LinearLayout.VERTICAL);

        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.CENTER_HORIZONTAL);
        ll.setBackgroundColor(Color.GRAY);

        TextView banner = (TextView) findViewById(R.id.banner);

        banner.setWidth(300);
        banner.setGravity(Gravity.CENTER_HORIZONTAL);
        banner.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        banner.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        banner.setText("Teddy Currency Converter");
        banner.setTextColor(Color.YELLOW);
        banner.setPadding(0, 0, 0, 10);



        Button myButton = (Button) findViewById(R.id.my_button);
        EditText myText = (EditText) findViewById(R.id.edit_message);
        TextView myView = (TextView) findViewById(R.id.edit_message1);

        myView.setGravity(Gravity.CENTER_HORIZONTAL);
        myView.setTextColor(Color.WHITE);

        myButton.setOnClickListener(myListener);

        LinearLayout.LayoutParams lparams = new RadioGroup.LayoutParams(300,100);

        banner.setLayoutParams(lparams);
        myText.setLayoutParams(lparams);
        myView.setLayoutParams(lparams);
        myButton.setLayoutParams(lparams);

        setContentView(ll);

        myText.setLayoutParams(new LinearLayout.LayoutParams(225, 50));
        myView.setLayoutParams(new LinearLayout.LayoutParams(170, 50));
    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText myText = (EditText) findViewById(R.id.edit_message);
            TextView myView = (TextView) findViewById(R.id.edit_message1);

            String firstString = myText.getText().toString();
            double firstNumber = Double.parseDouble(firstString);

            double result = firstNumber * 1.06;
            String resultString = String.valueOf(result);
            myView.setText(resultString);
        }
     };
    }
