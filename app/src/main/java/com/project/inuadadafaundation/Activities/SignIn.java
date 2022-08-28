package com.project.inuadadafaundation.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.inuadadafaundation.MainActivity;
import com.project.inuadadafaundation.R;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void login(View view) {
        startActivity(new Intent(SignIn.this, MainActivity.class));
        finish();
    }

    public void sigup(View view) {
        startActivity(new Intent(SignIn.this, SignUp.class));
        finish();
    }
}