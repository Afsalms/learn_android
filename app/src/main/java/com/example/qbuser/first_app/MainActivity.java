package com.example.qbuser.first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_one, button_two, button_three, button_four,
        button_five, button_six, button_seven, button_eight,
        button_nine, button_zero, button_dot, button_c,
        button_plus, button_minus, button_multiply, button_divide,
        button_equals;
    TextView result_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.);
        button_one = (Button) findViewById(R.id.button_first);
        result_text_view = (TextView) findViewById(R.id.result);
        result_text_view.setText("0");

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_text_view.setText("1");
            }
        });
    }

}
