package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Success extends AppCompatActivity {
  public String BookNames=" Sainath";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Button cart1=findViewById(R.id.cart1);


        cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BookNames=  BookNames.concat(" ,Bhagvath Geetha");

                Toast.makeText(Success.this,"Bhagavath Geetha added to the cart",Toast.LENGTH_LONG).show();
            }
        });
        Button cart2=findViewById(R.id.cart2);
        cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BookNames=BookNames.concat(" ,Ram Charithra Manas");





                Toast.makeText(Success.this," ,Ram Charitra Manas added to the cart",Toast.LENGTH_LONG).show();
            }
        });
        Button cart3=findViewById(R.id.cart3);
        cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BookNames=  BookNames.concat(" ,Ramayan");






                Toast.makeText(Success.this,"Ramayan added to the cart",Toast.LENGTH_LONG).show();
            }
        });
        Button cart4=findViewById(R.id.cart4);
        cart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BookNames=BookNames.concat(" ,Mahabharath");




                Toast.makeText(Success.this,"Mahabharath added to the cart",Toast.LENGTH_LONG).show();
            }
        });

        Button cart5=findViewById(R.id.cart5);
        cart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BookNames=BookNames.concat(" ,Atharved");




                Toast.makeText(Success.this,"Atharved added to the cart",Toast.LENGTH_LONG).show();
            }
        });
        Button viewCart=findViewById(R.id.viewCart);
        viewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i =new Intent(Success.this,Cart.class);
                Bundle b = new Bundle();
               b.putString("booknames",BookNames);
                i.putExtras(b);
                startActivity(i);

            }
        });
    }
    public void BhagG(View v)
    {
        Intent i=new Intent(this,Bhag.class);
        startActivity(i);
    }
    public void maha(View v){
        Intent i=new Intent(this,maha.class);
        startActivity(i);
    }
    public void ram(View v){
        Intent i=new Intent(this,ram.class);
        startActivity(i);
    }
    public void ramC(View v){
        Intent i=new Intent(this,ramC.class);
        startActivity(i);
    }
    public void atharv(View v)
    {
        Intent i=new Intent(this,Atharv.class);
        startActivity(i);
    }
    }
