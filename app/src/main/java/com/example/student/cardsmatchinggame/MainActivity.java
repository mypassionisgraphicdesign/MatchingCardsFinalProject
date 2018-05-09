package com.example.student.cardsmatchinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int[] cardsArray = {R.drawable.ace, R.drawable.two, R.drawable.three};

    public void begintorandomize(View view) {
        Log.i("Random", "Randomy");
    }

    /////jaccccccccccccc is thiccccc

    }
