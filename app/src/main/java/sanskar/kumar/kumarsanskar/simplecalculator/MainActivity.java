package sanskar.kumar.kumarsanskar.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    TextView resultDisplay;
    Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        resultDisplay = (TextView) findViewById(R.id.textView);
        addButton = (Button) findViewById(R.id.button);
        subtractButton = (Button) findViewById(R.id.button2);
        multiplyButton = (Button) findViewById(R.id.button3);
        divideButton = (Button) findViewById(R.id.button4);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstNumber.getText().toString();
                String secondInput = secondNumber.getText().toString();
                float firstValue = Float.parseFloat(firstInput);
                float secondValue = Float.parseFloat(secondInput);
                float resultantValue = firstValue + secondValue;
                String resultValue = Float.toString(resultantValue);
                resultDisplay.setText(resultValue);
                Toast.makeText(MainActivity.this, "The answer is: " + resultValue, Toast.LENGTH_SHORT).show();
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstNumber.getText().toString();
                String secondInput = secondNumber.getText().toString();
                float firstValue = Float.parseFloat(firstInput);
                float secondValue = Float.parseFloat(secondInput);
                float resultantValue = firstValue - secondValue;
                String resultValue = Float.toString(resultantValue);
                resultDisplay.setText(resultValue);
                Toast.makeText(MainActivity.this, "The answer is: " + resultValue, Toast.LENGTH_SHORT).show();
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstNumber.getText().toString();
                String secondInput = secondNumber.getText().toString();
                float firstValue = Float.parseFloat(firstInput);
                float secondValue = Float.parseFloat(secondInput);
                float resultantValue = firstValue * secondValue;
                String resultValue = Float.toString(resultantValue);
                resultDisplay.setText(resultValue);
                Toast.makeText(MainActivity.this, "The answer is: " + resultValue, Toast.LENGTH_SHORT).show();
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstNumber.getText().toString();
                String secondInput = secondNumber.getText().toString();
                float firstValue = Float.parseFloat(firstInput);
                float secondValue = Float.parseFloat(secondInput);
                float resultantValue = firstValue / secondValue;
                String resultValue = Float.toString(resultantValue);
                resultDisplay.setText(resultValue);
                Toast.makeText(MainActivity.this, "The answer is: " + resultValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}