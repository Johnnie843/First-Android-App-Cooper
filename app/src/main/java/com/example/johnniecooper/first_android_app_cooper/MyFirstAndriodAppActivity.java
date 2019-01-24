package com.example.johnniecooper.first_android_app_cooper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.johnniecooper.first_android_app_cooper.R;

public class MyFirstAndriodAppActivity extends AppCompatActivity {

    public  static final String DEBUG_TAG = "MyFirstAppLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_andriod_app);
        Log.i(DEBUG_TAG,"In the onCreate method of the MyFirstAndriodAppActivity Class" );
        //forceError();
    }


    public void forceError(){
        if(true){
            throw new Error("Whoops");
        }
    }
}
