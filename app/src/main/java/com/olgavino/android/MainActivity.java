package com.olgavino.android;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static TextView display;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button plus, minus, multiply, divide;
    private Button delete, dot;
    private Button equal;

    public double number1, number2;

    public String operand = "";
    public String sign;
    public String request;

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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
                }
                display.setText(display.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                    operand="";
                }
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                operand.equals("equal")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
                }
                display.setText(display.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")){
                    display.setText("");
                    operand="";
                }
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                }
                display.setText(display.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length()==1 && display.getText().equals("0")||
                        operand.equals("equal")){
                    display.setText("");
                }
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
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
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
                }
                display.setText(display.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand.equals("plus")||operand.equals("minus")||
                        operand.equals("multiply")||operand.equals("divide")||
                        operand.equals("equal")){
                    display.setText("");
                    operand="";
                }
                display.setText(display.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                //display.setText("");
                operand = "plus";
                sign = operand;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                //display.setText("");
                operand = "minus";
                sign = operand;
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                //display.setText("");
                operand = "multiply";
                sign = operand;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(String.valueOf(display.getText()));
                //display.setText("");
                operand = "divide";
                sign = operand;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Character.isDigit(display.getText().charAt(0)) ){
                    number2 = Double.parseDouble(String.valueOf(display.getText()));
                    operand = "equal";
                }

               String URL ="http://10.0.2.2:8080/calculate"; //to access local machine from emulator,
               request = URL+"?number1="+number1+"&number2="+number2+"&sign="+sign;

                CallingServlet myTask = new CallingServlet(MainActivity.this, request);
                Thread t1 = new Thread(myTask, "Get connection");
                t1.start();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText("0");
                number1 = 0;
                number2 = 0;

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
