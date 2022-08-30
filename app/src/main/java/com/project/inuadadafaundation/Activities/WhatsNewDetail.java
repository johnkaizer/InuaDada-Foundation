package com.project.inuadadafaundation.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.inuadadafaundation.R;

public class WhatsNewDetail extends AppCompatActivity {
    TextView date,description,heading;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_new_detail);


        date= findViewById(R.id.text_date);
        description= findViewById(R.id.text_desc);
        image = findViewById(R.id.image_whatsNew);
        heading = findViewById(R.id.heading_txt);


        date.setText(getIntent().getExtras().getString("date"));
        heading.setText(getIntent().getExtras().getString("heading"));
        Integer desc = getIntent().getIntExtra("description",0);
        description.setText(desc);
        Integer ImageUrl = getIntent().getIntExtra("image",0);
        image.setImageResource(ImageUrl);
    }
}