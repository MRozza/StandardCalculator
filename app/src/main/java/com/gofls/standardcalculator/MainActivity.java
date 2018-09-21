package com.gofls.standardcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtCalculator,tvNumber1;
    double number1 = 0, number2 = 0;
    String calcTxt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCalculator = findViewById(R.id.txtCalculator);
    }

    public void btnClick(View v) {
        Button b = (Button) v;
        String btnTxt = b.getText() + "";
        calcTxt = txtCalculator.getText() + "";
        if (calcTxt.length() < 10) {
            if (btnTxt.equals("·")) {
                if (!calcTxt.contains("."))
                    txtCalculator.setText(calcTxt + ".");
            } else {
                if (calcTxt.equals("0")) {
                    txtCalculator.setText("" + b.getText());
                } else {
                    txtCalculator.setText("" + txtCalculator.getText() + b.getText());
                }
            }
        }
    }

    public void btnOperateClick(View v){
        Button b=(Button) v;
        String operator= b.getText()+"";
        if(operator.equals("+")){

        }
    }
}
