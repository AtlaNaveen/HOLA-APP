package com.example.hola20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void openGmail(View v) {
        Toast.makeText(this, "Opening Gmail", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String[] array= {"pk4981@srmist.edu.in","naveenatla9866@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL,array);
        startActivity(intent);
    }
    public void openCall(View v){
        Toast.makeText(this, "Opening Call", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String num="9347459286";
        intent.setData(Uri.parse("tel:"+num));
        startActivity(intent);
    }
}