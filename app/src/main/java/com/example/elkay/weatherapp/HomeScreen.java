package com.example.elkay.weatherapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home_screen);

        getSupportActionBar().hide();

        LogoLauncher logo = new LogoLauncher();
        logo.start();
    }
    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(HomeScreen.this, MainActivity.class);

            startActivity(intent);



            HomeScreen.this.finish();
        }
    }
}
