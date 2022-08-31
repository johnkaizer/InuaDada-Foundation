package com.project.inuadadafaundation.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.inuadadafaundation.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void sigin(View view) {
        startActivity(new Intent(SignUp.this, SignIn.class));
        finish();

    }

    public void home(View view) {
        startActivity(new Intent(SignUp.this, MainActivity.class));
        finish();
    }
}