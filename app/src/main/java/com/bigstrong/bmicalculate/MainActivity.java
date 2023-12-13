package com.bigstrong.bmicalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText buy,sell,howMuch;
    Button calculate;
    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buy = findViewById(R.id.editTextText);
        sell = findViewById(R.id.editTextText2);
        howMuch = findViewById(R.id.editTextText3);
        calculate = findViewById(R.id.button);
        result = findViewById(R.id.textView);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float buying,selling,prifit,how,howMuchFinal;
                String buyB = buy.getText().toString();
                String sellS = sell.getText().toString();
                buying = Float.parseFloat(buyB);
                selling = Float.parseFloat(sellS);
                prifit = selling-buying;
                String howM = howMuch.getText().toString();
                how = Float.parseFloat(howM);
                howMuchFinal = buying/100*how+buying;
                result.setText("Your prifit is : "+prifit+"\nJodi "+" "+how+"taka prifit korta chau tahole"+howMuchFinal+"taka sell krte hobe ");

            }
        });
    }
}