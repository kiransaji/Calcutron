package com.example.calcutron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAnswer;
    Button btnAdd, btnSub, btnMul, btnDiv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAnswer= findViewById(R.id.tvAnswer);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          int first, second, ans;
                                          first = Integer.parseInt(etFirstValue.getText().toString());
                                          second = Integer.parseInt(etSecondValue.getText().toString());
                                          ans = first + second;

                                          tvAnswer.setText("Answer is " + ans);
                                      }
                                  });

                btnSub.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                int first, second, ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first - second;

                tvAnswer.setText("Answer is " + ans);
            }
            });


                        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                int first, second, ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first * second;

                tvAnswer.setText("Answer is " + ans);
            }
        });

                      btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                int first, second, ans;
                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first / second;

                tvAnswer.setText("Answer is " + ans);

            }
        });
    }
}