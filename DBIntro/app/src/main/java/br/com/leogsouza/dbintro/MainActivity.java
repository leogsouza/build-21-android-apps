package br.com.leogsouza.dbintro;

import Data.DatabaseHandler;
import Model.Contact;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        // Insert contacts
        Log.d("Insert: ", "Inserting....");
        db.addContact(new Contact("Leonardo", "1122334455"));
        db.addContact(new Contact("Fabiana", "3322554455"));
        db.addContact(new Contact("Miguel", "615252244"));
        db.addContact(new Contact("Tim", "7354585542"));
        db.addContact(new Contact("Martin", "863254878"));

        // Read them back
        Log.d("Reading: ", "Reading all contacts");
        List<Contact> contactList = db.getAllContacts();

        for(Contact c : contactList) {
            String log = String.format(Locale.getDefault(),"ID: %d, Name: %s, Phone Number: %s", c.getId(), c.getName(), c.getPhoneNumber());
            Log.d("Name: ", log);
        }

    }
}
