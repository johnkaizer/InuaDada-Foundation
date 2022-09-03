package com.project.inuadadafaundation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramsDetailsActivity extends AppCompatActivity {
    TextView description,heading;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_details);


        description= findViewById(R.id.text_program);
        image = findViewById(R.id.image_program);
        heading = findViewById(R.id.text_heading);

        heading.setText(getIntent().getExtras().getString("heading"));
        Integer desc = getIntent().getIntExtra("description",0);
        description.setText(desc);
        Integer ImageUrl = getIntent().getIntExtra("image",0);
        image.setImageResource(ImageUrl);
    }
}