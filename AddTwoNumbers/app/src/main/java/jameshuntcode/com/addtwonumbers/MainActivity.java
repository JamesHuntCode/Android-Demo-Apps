package jameshuntcode.com.addtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare widgets used
    private EditText num1;
    private EditText num2;
    private Button btnAdd;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign variables
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.btnAdd);
        result = findViewById(R.id.tvTotal);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int total = number1 + number2;

                result.setText("Answer: " + String.valueOf(total));
            }
        });
    }
}
