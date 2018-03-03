package br.com.leogsouza.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private Button showDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = findViewById(R.id.showDialogID);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // set things up - setup title
                //alertDialog.setTitle(R.string.title);
                alertDialog.setTitle(getResources().getString(R.string.title));

                // Set Icon
                alertDialog.setIcon(android.R.drawable.btn_star_big_on);

                // Set Message
                alertDialog.setMessage(getResources().getString(R.string.message));

                // Set Camcelable
                alertDialog.setCancelable(false);

                // Set Positive Button
                alertDialog.setPositiveButton(getResources().getString(R.string.yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Exit our window activity
                                MainActivity.this.finish();
                            }
                        });

                // Set Negative button
                alertDialog.setNegativeButton(getResources().getString(R.string.no),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                // create actual dialog;
                AlertDialog dialog = alertDialog.create();
                dialog.show();

            }
        });

    }
}
