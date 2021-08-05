package com.example.hola20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hola20.AboutApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void aboutapp(View v){
        Toast.makeText(this, "WELCOME TO ABOUT APP", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, AboutApp.class);
        startActivity(intent);
    }
    public void otherapps(View v){
        Toast.makeText(this, "WELCOME TO OTHER APPS", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,OtherApps.class);
        startActivity(intent);
    }
    public void songslist(View v){
        Toast.makeText(this, "WELCOME TO SONGS LIST", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,SongsList.class);
        startActivity(intent);
    }
    public void videoslist(View v){
        Toast.makeText(this, "WELCOME TO VIDEOS LIST", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,VideosList.class);
        startActivity(intent);
    }
    public void developers(View v){
        Toast.makeText(this, "WELCOME TO DEVELOPERS", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Developers.class);
        startActivity(intent);
    }
    public void feedback(View v){
        Toast.makeText(this, "WELCOME TO FEEDBACK", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Feedback.class);
        startActivity(intent);
    }
}