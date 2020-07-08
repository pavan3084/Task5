package com.example.task;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class HomePage extends AppCompatActivity {
    ImageView image1, image2, image3, image4, image5,image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);

        Picasso.with(this).load("https://images.unsplash.com/photo-1594008037836-5f96d75c00f3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80").into(image1);
        Picasso.with(this).load("https://images.unsplash.com/photo-1593481580857-e4eb53b6d8bf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80").into(image2);
        Picasso.with(this).load("https://images.unsplash.com/photo-1593776804558-8dc141d5be27?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80").into(image3);
        Picasso.with(this).load("https://images.unsplash.com/photo-1593381008273-5874bf72c908?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80").into(image4);
        Picasso.with(this).load("https://images.unsplash.com/photo-1565555334087-ef43c7c0a90e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80").into(image5);
        Picasso.with(this).load("https://images.unsplash.com/photo-1592500003030-7694cddc463d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80").into(image6);
    }
}
