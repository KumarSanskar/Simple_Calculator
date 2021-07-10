package sanskar.kumar.kumarsanskar.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    }
}