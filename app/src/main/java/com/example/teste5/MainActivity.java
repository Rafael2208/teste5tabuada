package com.example.teste5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private Button calculateButton;
    private TextView resultTextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.input_number);
        calculateButton = findViewById(R.id.calculate_button);
        resultTextView = findViewById(R.id.result_text_view);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputNumber.getText().toString().trim();

                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    String result = calculateTabuada(number);
                    resultTextView.setText(result);
                }
            }
        });
    }

    private String calculateTabuada(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            stringBuilder.append(number).append(" x ").append(i).append(" = ").append(product).append("\n");
        }

        return stringBuilder.toString();
    }
}