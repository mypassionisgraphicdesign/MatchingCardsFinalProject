package com.example.student.cardsmatchinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{


    int[] cardsArray = {R.drawable.ace, R.drawable.two, R.drawable.three};

    public void begintorandomize(View view)
    {
        Log.i("Random", "Randomy");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//https://social.msdn.microsoft.com/Forums/vstudio/en-US/77ed73c3-fb56-414a-bacf-0cdcd41afff4/remove-element-from-an-array-of-string?forum=csharpgeneral
//https://stackoverflow.com/questions/13739785/removing-an-element-from-string-array-in-android
//https://www.geeksforgeeks.org/remove-element-arraylist-java/


}