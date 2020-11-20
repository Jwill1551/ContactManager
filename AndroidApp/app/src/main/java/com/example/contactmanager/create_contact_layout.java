package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class create_contact_layout extends AppCompatActivity {

    Button cancelBtn;
    Button createContactButton;
    EditText name_TextBox;
    EditText age_TextBox;
    EditText dob_TextBox;
    EditText relatives_TextBox;
    EditText job_TextBox;
    EditText position_TextBox;
    EditText salary_TextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact_layout);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelActivity = new Intent(create_contact_layout.this, MainActivity.class);
                startActivity(cancelActivity);
            }
        });

        createContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}