package br.com.leogsouza.petbio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private TextView petName;
    private TextView petBio;
    private ImageView petImageView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petName = findViewById(R.id.nameID);
        petBio = findViewById(R.id.bioTextID);
        petImageView = findViewById(R.id.petImageViewID);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio) {

        if (name.equals("Thor")) {
            // We show the dog stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petBio.setText(bio);
            petName.setText(name);

        } else if (name.equals("Tom")) {
            // We show the cat stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petBio.setText(bio);
            petName.setText(name);
        }
    }
}
