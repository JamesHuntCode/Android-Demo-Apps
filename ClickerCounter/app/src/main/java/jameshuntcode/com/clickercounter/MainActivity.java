package jameshuntcode.com.clickercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare widgets
    Button btnClick;
    Button btnReset;

    TextView txtCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets
        btnClick = findViewById(R.id.btnClick);
        btnReset = findViewById(R.id.btnReset);

        txtCounter = findViewById(R.id.txtCounter);

        // Button on-click events

        // Click button
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentCounterValue = txtCounter.getText().toString();

                int counterValue = Integer.parseInt(currentCounterValue);
                counterValue++;

                txtCounter.setText(String.valueOf(counterValue));
            }
        });

        // Reset button
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCounter.setText(String.valueOf(0));
            }
        });
    }
}
