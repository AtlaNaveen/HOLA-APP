package com.example.hola20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OtherApps extends AppCompatActivity implements Adapter.OnAppListener {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_apps);

        initData();
        initRecyclerView();


    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.insta,"INSTAGRAM"));
        userList.add(new ModelClass(R.drawable.fb,"FACEBOOK"));
        userList.add(new ModelClass(R.drawable.twitter,"TWITTER"));
        userList.add(new ModelClass(R.drawable.youtube,"YOUTUBE"));
        userList.add(new ModelClass(R.drawable.gmail,"GMAIL"));
        userList.add(new ModelClass(R.drawable.srm,"SRM ACADEMIA"));
        userList.add(new ModelClass(R.drawable.no,"DON'T CLICK"));
        userList.add(new ModelClass(R.drawable.home,"GO HOME"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    public void onAppClick(int position) {

        if(position==0){
            Toast.makeText(this,"OPENING INSTAGRAM",Toast.LENGTH_SHORT).show();
            Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent1 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }

        if(position==1){
            Toast.makeText(this,"OPENING FACEBOOK ",Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==2){
            Toast.makeText(this,"OPENING TWITER ",Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }

        if(position==3){
            Toast.makeText(this,"OPENING YOUTUBE ",Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==4){
            Toast.makeText(this,"OPENING GMAIL ",Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==5){
            Toast.makeText(this,"OPENING SRM ACADEMIA ",Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://academia.srmist.edu.in/#View:Academic_Planner_2020_21_EVEN"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==6){

            Toast.makeText(this, "I SAID NO", Toast.LENGTH_SHORT).show();

            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://images.squarespace-cdn.com/content/v1/55b8ecb6e4b083fd0d23d93f/1450176945599-6LTY5GREKAPK5CCY8JHL/ke17ZwdGBToddI8pDm48kBY-qbJWPsJyl0YWCpcFDbUUqsxRUqqbr1mOJYKfIPR7LoDQ9mXPOjoJoqy81S2I8N_N4V1vUb5AoIIIbLZhVYy7Mythp_T-mtop-vrsUOmeInPi9iDjx9w8K4ZfjXt2dtpiMAtR4kZNhqC87Kai_7eqPC5xDA4RuAfsTyVeslMUZDqXZYzu2fuaodM4POSZ4w/Monkey+Butt.001.jpg"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==7){
            Toast.makeText(this,"OPENING HOME ",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }

    }
  
}

