package br.com.leogsouza.checkboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox grandpaCheckBox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = findViewById(R.id.momCheckBoxID);
        dadCheckBox = findViewById(R.id.dadCheckBoxID);
        grandpaCheckBox = findViewById(R.id.grandpaCheckBoxID);

        resultTextView = findViewById(R.id.resultViewID);

        showButton = findViewById(R.id.showButtonID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + " status is " +
                momCheckBox.isChecked() + "\n");
                stringBuilder.append(dadCheckBox.getText().toString() + " status is " +
                        dadCheckBox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckBox.getText().toString() + " status is " +
                        grandpaCheckBox.isChecked() + "\n");

                resultTextView.setText(stringBuilder);
            }
        });

    }
}
