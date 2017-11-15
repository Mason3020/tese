package com.example.mason.tese.UI;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mason.tese.R;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton mProfileIcon;
    private TextView mUserName;
    private TextView mEmailAddress;
    private TextView mPhoneNumber;
    private TextView mRegistrationNumber;
    private TextView mDegreeProgram;
    private TextView mUniversity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfileIcon = (ImageButton) findViewById(R.id.imageButton3);
        mUserName = (TextView) findViewById(R.id.userName);
        mEmailAddress = (TextView)findViewById(R.id.emailAddress);
        mPhoneNumber = (TextView) findViewById(R.id.textView4);
        mRegistrationNumber = (TextView)findViewById(R.id.registrationNum);
        mDegreeProgram = (TextView)findViewById(R.id.program);
        mUniversity = (TextView)findViewById(R.id.textView6);



    }
}
