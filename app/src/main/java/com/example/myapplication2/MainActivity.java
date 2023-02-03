 package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

//мы создаём обексты которые ссылаються на xml обекты


     private TextView result;

     private EditText num1_input, num2_input;

     private Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.textProggram);

        num1_input=findViewById(R.id.input_num1);
        num2_input=findViewById(R.id.input_num2);

        buttonResult=findViewById(R.id.button1);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float num1=Float.parseFloat(num1_input.getText().toString());
                float num2=Float.parseFloat(num2_input.getText().toString());
                float res=num1+num2;

                result.setText(String.valueOf(res));

            }
        });



    }



}