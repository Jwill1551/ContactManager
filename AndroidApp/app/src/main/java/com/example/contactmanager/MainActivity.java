package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button createBtn;
    Button searchBtn;
    Button removeBtn;
    Button displayBtn;
    Button fileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createBtn = (Button) findViewById(R.id.createBtn);
        searchBtn = (Button) findViewById(R.id.searchBtn);
        removeBtn = (Button) findViewById(R.id.removeBtn);
        displayBtn = (Button) findViewById(R.id.displayBtn);
        fileBtn = (Button) findViewById(R.id.displayBtn);

        //Opens the Create Contact Activity
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createContact = new Intent(MainActivity.this, create_contact_layout.class);
                startActivity(createContact);
            }
        });

        //Opens the Search Contact Activity
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchContact = new Intent(MainActivity.this, search_contacts.class);
                startActivity(searchContact);
            }
        });

        //Opens the Remove Contact Activity
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent removeContact = new Intent(MainActivity.this, remove_contact_layout.class);
                startActivity(removeContact);
            }
        });

        //Opens the Display Contact Activity
        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displayContact = new Intent(MainActivity.this, display_all_contacts_layout.class);
                startActivity(displayContact);
            }
        });

        //Opens the File Contact Activity
        fileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fileContact = new Intent(MainActivity.this, file_contact_manager_layout.class);
                startActivity(fileContact);
            }
        });
    }
}