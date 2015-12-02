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
//package com.example.convertor.convertcuptotblspn;
//
//        import android.graphics.Color;
//        import android.os.Bundle;
//        import android.support.v7.app.ActionBarActivity;
//        import android.view.View;
//        import android.widget.EditText;
//        import android.widget.LinearLayout;
//        import android.widget.RadioButton;
//        import android.widget.TextView;
//
//public class MainActivity extends ActionBarActivity
//{
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//    public void add(View v) {
//        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
//
//        TextView result = (TextView) findViewById(R.id.result);
//
//        EditText ed1 =  (EditText) findViewById(R.id.editText1);
//
//        double a = Double.parseDouble(String.valueOf(ed1.getText()));
//
//        RadioButton TablespntoCup = (RadioButton) findViewById(R.id.TablespntoCup);
//        RadioButton CuptoTbleSpoon =(RadioButton) findViewById(R.id.CuptoTbleSpoon);
//        RadioButton CuptoTeaSpoon = (RadioButton) findViewById(R.id.CuptoTeaSpoon);
//
//        // CuptoTbleSpoon.setChecked(true);
//
//        if (CuptoTbleSpoon.isChecked())
//        {
//            result.setText(CuptoTbleSpoon(a) + "  Tablespoon");
//            CuptoTbleSpoon.setChecked(true);
//        } else if(CuptoTeaSpoon.isChecked())
//        {
//            result.setText(CupstoTeaSpoon(a) + "TeaSpoon");
//            CuptoTeaSpoon.setChecked(true);
//        }
//        else
//        {
//            result.setText(TablespntoCup(a) + "  Cups");
//            TablespntoCup.setChecked(true);
//        }
//
//    }
//
//    private double TablespntoCup(double spoon)
//    {
//        return spoon / 16;
//    }
//
//    private double CuptoTbleSpoon(double cups)
//    {
//        return cups * 16;
//    }
//    private double CupstoTeaSpoon(Double cups)
//    {
//
//        return cups*48;
//    }
//}
//
