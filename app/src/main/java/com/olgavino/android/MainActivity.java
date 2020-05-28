package com.olgavino.android;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public TextView display;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button delete;
    private Button equal;
    private Button dot;

    public double number1;
    public double number2;
    public double result;
    public String operand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                }
                display.setText(display.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                display.setText("");
                operand = "plus";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                display.setText("");
                operand = "minus";
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                display.setText("");
                operand = "multiply";
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                display.setText("");
                operand = "divide";
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Double.parseDouble(String.valueOf(display.getText()));
                if (operand.equals("plus")){
                    result = number1 + number2;
                    display.setText(String.valueOf(result));
                }
                else if (operand.equals("minus")){
                    result = number1 - number2;
                    display.setText(String.valueOf(result));
                }
                else if (operand.equals("multiply")){
                    result = number1 * number2;

                    display.setText(String.valueOf(result));
                }
                else if (operand.equals("divide")){

                    result = number1 / number2;
                   if (number2 == 0) {
                       display.setText("Cannot divide by zero!");

                    }
                   else display.setText(String.valueOf(result));

                }


            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText("0");

            }
        });
    }
    public void setUpViews(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        plus = (Button)findViewById(R.id.btnPlus);
        minus = (Button)findViewById(R.id.btnMinus);
        multiply = (Button)findViewById(R.id.btnMult);
        divide = (Button)findViewById(R.id.btnDiv);
        delete = (Button)findViewById(R.id.btnAC);
        equal = (Button)findViewById(R.id.btnEqual);
        display = (TextView) findViewById(R.id.txtViewDisplay);
        dot = (Button)findViewById(R.id.btnDot);
    }

}
