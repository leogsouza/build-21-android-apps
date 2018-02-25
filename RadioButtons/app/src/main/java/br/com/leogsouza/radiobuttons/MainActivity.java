package br.com.leogsouza.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup choicesGroup;
    private RadioButton choiceRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choicesGroup = findViewById(R.id.choicesGroup);
        choicesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                choiceRadio = findViewById(i);
                switch (choiceRadio.getId()) {
                    case R.id.yesRadio: {
                        if(choiceRadio.isChecked()) {
                            Log.d("RD", "YES!!");
                        }

                    }
                    break;
                    case R.id.noRadio: {
                        if(choiceRadio.isChecked()) {
                            Log.d("RD", "NO!!");
                        }
                    }
                    break;
                    case R.id.maybeRadio: {
                        if(choiceRadio.isChecked()) {
                            Log.d("RD", "MAYBE!!");
                        }
                    }
                    break;
                }
            }
        });
    }
}
