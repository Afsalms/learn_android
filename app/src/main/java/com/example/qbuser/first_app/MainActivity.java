package com.example.qbuser.first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_one, button_two, button_three, button_four,
        button_five, button_six, button_seven, button_eight,
        button_nine, button_zero, button_dot, button_c,
        button_plus, button_minus, button_multiply, button_divide,
        button_equals;
    EditText result_text_view;
    String operator;
    Float operant1, operant2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.);
        button_one = (Button) findViewById(R.id.button_first);
        button_two = (Button) findViewById(R.id.button_two);
        button_three = (Button) findViewById(R.id.button_three);
        button_four = (Button) findViewById(R.id.button_four);
        button_five = (Button) findViewById(R.id.button_five);
        button_six = (Button) findViewById(R.id.button_six);
        button_seven = (Button) findViewById(R.id.button_seven);
        button_eight = (Button) findViewById(R.id.button_eight);
        button_nine = (Button) findViewById(R.id.button_nine);
        button_zero = (Button) findViewById(R.id.button_zero);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_c = (Button) findViewById(R.id.button_clear);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_divide = (Button) findViewById(R.id.button_division);
        button_equals = (Button) findViewById(R.id.button_result);
        result_text_view = (EditText) findViewById(R.id.result);
        result_text_view.setText("");

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"1");
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"2");
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"3");
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"4");
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"5");
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"6");
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"7");
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"8");
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(result_text_view.getText()+"9");
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String text;
                String string = result_text_view.getText().toString();
                if (string.isEmpty()){
                    result_text_view.setText("0.");
                }
                else if(!string.contains(".")){
                    result_text_view.setText(result_text_view.getText()+".");
//
                }
            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result_text_view.getText().toString();
                if (!string.isEmpty()){
                    result_text_view.setText(result_text_view.getText()+"0");
                }
            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText(null);
                operant1 = Float.NaN;
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!(result_text_view.getText().toString().isEmpty())) {
                    operant1 = Float.parseFloat(result_text_view.getText().toString());
                    operator = "+";
                    result_text_view.setText(null);
                }

            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(result_text_view.getText().toString().isEmpty())) {
                    operant1 = Float.parseFloat(result_text_view.getText().toString());
                    operator = "-";
                    result_text_view.setText(null);
                }

            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(result_text_view.getText().toString().isEmpty())) {
                    operant1 = Float.parseFloat(result_text_view.getText().toString());
                    operator = "*";
                    result_text_view.setText(null);
                }

            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(result_text_view.getText().toString().isEmpty())) {
                    operant1 = Float.parseFloat(result_text_view.getText().toString());
                    operator = "/";
                    result_text_view.setText(null);
                }

            }
        });
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!operant1.isNaN()) & !(operator.isEmpty())){
                    operant2 = Float.parseFloat(result_text_view.getText().toString());
                    if (operant2.isNaN()){
                        operant2 = Float.parseFloat("0.0");
                    }
                    Float result;
                    if (operator == "+"){
                        result = operant1 + operant2;
                    }
                    else if(operator == "-"){
                        result = operant1 - operant2;
                    }
                    else if (operator == "*"){
                        result = operant1 * operant2;
                    }
                    else{
                        result = operant1/ operant2;
                    }
                    result_text_view.setText(result+"");
                }

            }
        });
    }

}
