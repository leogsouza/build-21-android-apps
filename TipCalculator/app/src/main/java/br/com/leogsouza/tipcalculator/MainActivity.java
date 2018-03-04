package br.com.leogsouza.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private EditText enteredAmount;
    private SeekBar seekBar;
    private Button calculateButton;
    private TextView totalResultTextView;
    private TextView percentageTextView;
    private TextView totalBillTextView;
    private int seekBarPercentage;
    private float enteredBillFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enteredAmount = findViewById(R.id.billAmountID);
        seekBar = findViewById(R.id.percentageSeekBar);
        calculateButton = findViewById(R.id.calculateButton);
        totalResultTextView = findViewById(R.id.resultID);
        percentageTextView = findViewById(R.id.percentageTextView);
        totalBillTextView = findViewById(R.id.totalBillTextView);

        calculateButton.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                percentageTextView.setText(String.valueOf(seekBar.getProgress()) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarPercentage = seekBar.getProgress();
            }
        });
    }

    @Override
    public void onClick(View view) {
        calculate();
    }

    public void calculate() {
        float result = 0.0f;

        if(!enteredAmount.getText().toString().equals("")) {
            enteredBillFloat = Float.parseFloat(enteredAmount.getText().toString());
            result = enteredBillFloat * seekBarPercentage / 100;
            totalResultTextView.setText("Your tip will be $"+ String.valueOf(result));
            totalBillTextView.setText("Total bill: " + String.valueOf(enteredBillFloat + result));

        } else {
            Toast.makeText(MainActivity.this, "Please enter a bill amount.", Toast.LENGTH_LONG).show();
        }

    }
}
