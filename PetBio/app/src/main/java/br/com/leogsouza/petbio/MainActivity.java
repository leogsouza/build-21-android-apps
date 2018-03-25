package br.com.leogsouza.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.catID);
        dogView = findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.catID:
                // go to second activity
                Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_LONG).show();
                break;
            case R.id.dogID:
                // go to second activity
                Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
