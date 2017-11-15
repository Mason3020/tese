package com.example.mason.tese.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mason.tese.R;

public class SignUpActivity extends AppCompatActivity {

    private EditText mUserName;
    private EditText mSurname;
    private EditText mPhoneNumber;
    private EditText mProgram;
    private EditText mRegistrationNumber;
    private EditText mUniversity;
    private Button mSaveProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mUserName =(EditText) findViewById(R.id.name);
        mSurname = (EditText) findViewById(R.id.surname);
        mPhoneNumber = (EditText)findViewById(R.id.phoneNumber);
        mProgram = (EditText) findViewById(R.id.programme);
        mRegistrationNumber = (EditText) findViewById(R.id.registrationNumber);
        mUniversity = (EditText) findViewById(R.id.university);
        mSaveProfile = (Button) findViewById(R.id.saveProfile);

        mSaveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
