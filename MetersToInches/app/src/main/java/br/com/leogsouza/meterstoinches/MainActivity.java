package br.com.leogsouza.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
        1m = 39.3701in
     */

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = findViewById(R.id.metersEditText);
        convertButton = findViewById(R.id.convertButtonID);
        resultTextView = findViewById(R.id.resultId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 39.37;
                double result;

                double meterValue = Double.parseDouble(enterMeters.getText().toString());
                result = meterValue * multiplier;

                resultTextView.setText(Double.toString(result));
            }
        });
    }
}
