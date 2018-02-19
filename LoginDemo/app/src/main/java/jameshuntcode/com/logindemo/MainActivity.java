package jameshuntcode.com.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button login;
    private TextView attempts;
    private int attemptCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        attempts = findViewById(R.id.tvAttemps);
        attemptCounter = 5;

        // Login button on click
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    // Method to validate login credentials
    private void validate(String userName, String userPassword) {
        if ((userName.equals("admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {
            attemptCounter--;

            attempts.setText("Attempts Remaining: " + String.valueOf(attemptCounter));

            if (attemptCounter == 0) {
                login.setEnabled(false);
            }
        }
    }
}
