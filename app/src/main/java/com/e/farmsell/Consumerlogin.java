package com.e.farmsell;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Consumerlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumerlogin);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar) ;



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.consumermenu,menu);
        return true;
    }
}
