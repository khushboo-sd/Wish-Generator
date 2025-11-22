package com.example.birthday_wish;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class wish_method extends AppCompatActivity {
    TextView t1;

    ArrayList<String> nameList ;
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wish_method);

        t1=findViewById(R.id.tv1);
        nameList= new ArrayList<>();
        random=new Random();

        Intent i=getIntent();
        String na=i.getStringExtra("name");

        nameList.add("Happiest birthay  %s  . \n You are the best person in the world. \n You are the most prettiest person in the world. Thank you for being there. You are the most valuable person , Who comes first in my life.. ");
        nameList.add("Dear Baccha Enjoy your day %s . \n Wishing you a day full of love, laughter, and magic. You’re a brilliant soul who lights up every room. May this year bring you closer to the dreams you’ve whispered in your heart. You deserve all the happiness in the universe. Go celebrate yourself—you’re worth it!  ");
        nameList.add("Happiest Birthday to %s truly one-of-a-kind! \n Your resilience, warmth, and infectious energy make the world better just by being in it. Let every moment today feel like a hug from the universe. Keep shining like you always do. The future is lucky to have you.");
        nameList.add("\uD83D\uDC96 Here’s to another chapter of your incredible journey mrs/mr %s. Every year you grow wiser, kinder, and even more inspiring. May the people around you reflect the love you so freely give. This is your time—embrace every twist and turn. The best is yet to come.");
        nameList.add("\uD83C\uDF81 Your birthday isn’t just about the past—it’s a promise to your future dear %s .\n You’ve got untapped potential and an unstoppable spirit. Keep chasing what sets your soul on fire. You were born to leave your mark. And today, we celebrate every part of that.");
        nameList.add("\uD83C\uDF08 Celebrating the masterpiece that is %s today. \n Life gets better because of people like you—kind, thoughtful, and genuinely unforgettable. I hope your heart feels full and your smile stretches wide. Let joy be your soundtrack today. Happiest birthday vibes coming your way!");
        nameList.add("Happiest birthday to my amazing person %s! Today marks a special day, a celebration of life, love, and all the joy you bring to those around you. May this year be filled with laughter, adventure, and unforgettable moments. You deserve to be pampered, spoiled, and showered with love on your special day. Here's to another year of growth, happiness, and making memories that will last a lifetime! ");

        
        String rt=nameList.get(random.nextInt(nameList.size()));

        String fm=String.format(rt,na);

        t1.setText(fm);
    }
}