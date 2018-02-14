package br.com.leogsouza.firstlook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton =  findViewById(R.id.mButton);
        mTextView = findViewById(R.id.mTextView);

        mButton.setText(R.string.button_name);
    }

    public void ShowMe(View view) {
        mTextView.setVisibility(View.VISIBLE);
        mTextView.setText(R.string.show_text);
    }
}
