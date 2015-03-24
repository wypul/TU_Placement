package com.example.vipul.tu_placement;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Splash extends ActionBarActivity {

    private static final int SPALSH_SHOW_TIME = 50000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    Intent startMain = new Intent("android.intent.action.MAIN");
                    startActivity(startMain);
                }
            }
        };
        timer.start();
    }
}
