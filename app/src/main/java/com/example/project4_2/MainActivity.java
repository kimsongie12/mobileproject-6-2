package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button plus, minus, multi, divi, rema;
    TextView result;
    String box1, box2;
    Float cal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divi = (Button) findViewById(R.id.division);
        result = (TextView) findViewById(R.id.cal_result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box1 = num1.getText().toString();
                box2 = num2.getText().toString();
                if (box1.trim().equals("") || box2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    cal = Float.parseFloat(box1) + Float.parseFloat(box2);
                    result.setText("계산결과 : " + cal.toString());
                }
            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box1 = num1.getText().toString();
                box2 = num2.getText().toString();
                if (box1.trim().equals("") || box2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    cal = Float.parseFloat(box1) - Float.parseFloat(box2);
                    result.setText("계산 결과: " + cal.toString());
                }
            }

        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box1 = num1.getText().toString();
                box2 = num2.getText().toString();
                if (box1.trim().equals("") || box2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else if (box2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                } else {
                    cal = Float.parseFloat(box1) / Float.parseFloat(box2);
                    result.setText("계산 결과 : " + cal.toString());
                }

            }

        });
        rema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box1 = num1.getText().toString();
                box2 = num2.getText().toString();

                if (box1.trim().equals("") || box2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else if (box2.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                } else {
                    cal = Float.parseFloat(box1) % Float.parseFloat(box2);
                    result.setText("계산결과:" + cal.toString());
                }


            }

        });
    }
}







