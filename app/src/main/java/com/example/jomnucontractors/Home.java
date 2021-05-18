package com.example.jomnucontractors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Intent Enginner,Architec,robot,webDesign,and,serv,Home1,Contact_us,About;
    Button homePage,cont,about_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Enginner=new Intent(Home.this, civil.class);
        Architec=new Intent(Home.this, archi.class);
        robot=new Intent(Home.this, robotics.class);
        webDesign=new Intent(Home.this, webdesign.class);
        and=new Intent(Home.this, Android.class);
        serv=new Intent(Home.this, Server.class);

        Home1=new Intent(Home.this, Home.class);
        Contact_us=new Intent(Home.this, Contact.class);
        About=new Intent(Home.this, About_us.class);

        homePage=(Button)findViewById(R.id.HOME);
        cont=(Button)findViewById(R.id.US);
        about_us=(Button)findViewById(R.id.ABOUT);
        button();
    }

    public void civil2(View view) {
        startActivity(Enginner);
    }

    public void architech(View view) {
        startActivity(Architec);
    }
    public void robotic(View view){
        startActivity(robot);
    }
    public void web(View view){
        startActivity(webDesign);
    }
    public void android(View view){
        startActivity(and);
    }
    public void server(View view){
        startActivity(serv);
    }

    public void button(){
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Home1);
            }
        });
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Contact_us);
            }
        });
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(About);
            }
        });
    }
    }