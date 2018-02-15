package br.com.leogsouza.firstlook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton =  findViewById(R.id.mButton);
        mTextView = findViewById(R.id.mTextView);
        mEditText = findViewById(R.id.mEditText);

        mButton.setText(R.string.button_name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredText;
                enteredText = mEditText.getText().toString();
                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(enteredText);
            }
        });
    }

//    public void ShowMe(View view) {
//        mTextView.setVisibility(View.VISIBLE);
//        mTextView.setText(R.string.show_text);
//    }
}
