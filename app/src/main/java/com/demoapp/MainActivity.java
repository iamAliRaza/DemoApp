package com.demoapp;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

// Demo APP
// Created By Ali Raza ( 25 - 6 - 19 )
// Here I am binding views manually. Later i will use ButterKnife API.



public class MainActivity extends AppCompatActivity {

    private ImageView yellow;
    private ImageView green1;
    private ImageView green2;

    private ImageView favImage;

    private ImageView roundOne;
    private ImageView roundTwo;
    private ImageView roundThree;

    private ImageView whiteImage;

    private ImageView boxOne;
    private ImageView boxTwo;

    private ImageView ofBox;

    private ImageView [] images = new ImageView[4];

    private RelativeLayout relativeLayout;

    private ImageView sliderImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yellow = findViewById(R.id.yellow);
        green1 = findViewById(R.id.green1);
        green2 = findViewById(R.id.green2);

        favImage = findViewById(R.id.favText);

        roundOne = findViewById(R.id.roundO);
        roundTwo = findViewById(R.id.roundT);
        roundThree = findViewById(R.id.round3);

        whiteImage = findViewById(R.id.whiteImage);

        boxOne = findViewById(R.id.box1);
        boxTwo = findViewById(R.id.box2);

        sliderImage = findViewById(R.id.slider);

        images[0] = findViewById(R.id.image1);
        images[1] = findViewById(R.id.image2);
        images[2] = findViewById(R.id.image3);
        images[3] = findViewById(R.id.image4);

        ofBox = findViewById(R.id.of_box);

        relativeLayout = findViewById(R.id.mainLayout);

        initImages();
    }



    private void initImages (){

        Glide.with(this).load(R.drawable.yellowbuttonn).override(262,166).dontAnimate().into(yellow);
        Glide.with(this).load(R.drawable.greenbutton11).override(262,166).dontAnimate().into(green1);
        Glide.with(this).load(R.drawable.greenbutton22).override(262,166).dontAnimate() .into(green2);

        Glide.with(this).load(R.drawable.youroffavorites).override(350,81).dontAnimate().into(favImage);

        Glide.with(this).load(R.drawable.ofbestsellers).override(383,77).dontAnimate().into(whiteImage);

        Glide.with(this).load(R.drawable.onee).override(170,170).dontAnimate() .into(roundOne);

        Glide.with(this).load(R.drawable.two).override(170,170).dontAnimate() .into(roundTwo);

        Glide.with(this).load(R.drawable.three).override(170,170).dontAnimate() .into(roundThree);


        Glide.with(this).load(R.drawable.lastone).override(259,158).dontAnimate().into(boxOne);

        Glide.with(this).load(R.drawable.balance).override(259,158).dontAnimate().into(boxTwo);

        Glide.with(this).load(R.drawable.ofboxes).override(192,69).dontAnimate() .into(ofBox);

        Glide.with(this).load(R.drawable.sliderimage).override(487,530).dontAnimate() .into(sliderImage);


        // Here i am using deprecated class
        // I can also do it with others ways
        Glide.with(this).load(R.drawable.background).override(301,552).into(new SimpleTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {

                relativeLayout.setBackground(resource);
            }
        });

        for ( ImageView imageView : images ){

            Glide.with(this).load(R.drawable.pizza).override(180,120).dontAnimate() .into(imageView);

        }

    }

}
