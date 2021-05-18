package com.example.jomnucontractors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity {
    Button homePage,cont,about_us;
    Intent Home1,Contact_us,About;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        homePage=(Button)findViewById(R.id.HOME);
        cont=(Button)findViewById(R.id.US);
        about_us=(Button)findViewById(R.id.ABOUT);
        button();

        Home1=new Intent(Contact.this, Home.class);
        Contact_us=new Intent(Contact.this, Contact.class);
        About=new Intent(Contact.this, About_us.class);
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