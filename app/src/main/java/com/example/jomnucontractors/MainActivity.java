package com.example.jomnucontractors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button next;
    String Username,Password;
    String john="john mwangi nuthu";
    String mihango="mihango5075";
    Intent home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        next=(Button)findViewById(R.id.enter);
        home=new Intent(MainActivity.this,Home.class);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Username=name.getText().toString();
                Password=password.getText().toString();
                info();
            }
        });
    }
    public void info(){
        if (Username.equals(john) && Password.equals(mihango)){
            Toast.makeText(MainActivity.this,"WELCOME BACK JOHN",Toast.LENGTH_LONG).show();
            startActivity(home);
        }
        else {
            Toast.makeText(MainActivity.this,"WRONG USER ........!",Toast.LENGTH_LONG).show();
        }
    }
}