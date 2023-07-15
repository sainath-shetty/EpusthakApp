package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    TextView Bhag, Ramc, Ramayan, Maha, Atharv;
    Button Bhagb, Ramcb, Ramayanb, Mahab, Athb;
    Button Dbhag,Dram,Dramc,Dmaha,Dath;
    String book;
    Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bhag = findViewById(R.id.Bhag);
        Ramc = findViewById(R.id.RamC);
        Ramayan = findViewById(R.id.Ram);
        Maha = findViewById(R.id.Maha);
        Atharv = findViewById(R.id.Atharv);
        Athb = findViewById(R.id.Athb);
        Dbhag = findViewById(R.id.Dbhag);
        Dramc = findViewById(R.id.Dramc);
        Dram = findViewById(R.id.Dram);
        Dmaha = findViewById(R.id.Dmaha);
        Dath=findViewById(R.id.Dath);
//        Add=findViewById(R.id.Add);


        Bundle b = getIntent().getExtras();
        book = b.getString("booknames");
        System.out.println(book);
        if (book.contains("Bhagvath Geetha")) {
            Bhag.setText("Bhagvath Geetha");
            Bhag.setVisibility(View.VISIBLE);
            Bhagb = findViewById(R.id.Bhagb);
            Bhagb.setVisibility(View.VISIBLE);


            Dbhag.setVisibility(View.VISIBLE);
//            Add.setVisibility(View.GONE);
            Bhagb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Cart.this, Bhag.class);
                    startActivity(i);
                }
            });

        }
        if (book.contains("Ram Charithra Manas")) {
            Ramc.setText("Ram Charithra Manas");
            Ramc.setVisibility(View.VISIBLE);
            Ramcb = findViewById(R.id.Ramcb);
            Ramcb.setVisibility(View.VISIBLE);
            Dramc.setVisibility(View.VISIBLE);
//           Add.setVisibility(View.GONE);
            Ramcb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Cart.this, ramC.class);
                    startActivity(i);

                }
            });

        }
        if (book.contains("Ramayan")) {
            Ramayan.setText("Ramayan");
            Ramayan.setVisibility(View.VISIBLE);
            Ramayanb = findViewById(R.id.Ramb);
            Ramayanb.setVisibility(View.VISIBLE);
            Dram.setVisibility(View.VISIBLE);
//            Add.setVisibility(View.GONE);

            Ramayanb.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Cart.this, ram.class);
                    startActivity(i);
                }
            });

        }
        if (book.contains("Mahabharath")) {
            Maha.setText("Mahabharath");
            Maha.setVisibility(View.VISIBLE);
            Mahab = findViewById(R.id.Mahab);

            Mahab.setVisibility(View.VISIBLE);
            Dmaha.setVisibility(View.VISIBLE);
//             Add.setVisibility(View.GONE);
            Mahab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Cart.this, maha.class);
                    startActivity(i);
                }
            });
        }

        if (book.contains("Atharved")) {
            Atharv.setText("Atharved");

            Athb = findViewById(R.id.Athb);

            Athb.setVisibility(View.VISIBLE);
            Dath.setVisibility(View.VISIBLE);
//             Add.setVisibility(View.GONE);
            Athb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(Cart.this, Atharv.class);
                    startActivity(i);
                }
            });

        }
    }

    public void Dbhag(View v)
    {
        Bhag.setVisibility(View.GONE);
        Bhagb.setVisibility(View.GONE);

        Dbhag.setVisibility(View.GONE);
        book=book.replace("Bhagvath Geetha","");
        System.out.println(book);
        Intent i=new Intent(Cart.this,Success.class);
        Bundle b = new Bundle();
        b.putString("books",book);
        i.putExtras(b);
    }
    public void Dramc(View v)
    {
        Ramc.setVisibility(View.GONE);
        Ramcb.setVisibility(View.GONE);

        Dramc.setVisibility(View.GONE);
        book=book.replace("Ram Charithra Manas","");
        System.out.println(book);
        Intent i=new Intent(Cart.this,Success.class);
        Bundle b = new Bundle();
        b.putString("books",book);
        i.putExtras(b);
    }
    public void Dram(View v)
    {
        Ramayan.setVisibility(View.GONE);
        Ramayanb.setVisibility(View.GONE);

        Dram.setVisibility(View.GONE);
        book=book.replace("Ramayan","");
        System.out.println(book);
        Intent i=new Intent(Cart.this,Success.class);
        Bundle b = new Bundle();
        b.putString("books",book);
        i.putExtras(b);

    }
    public void Dmaha(View v)
    {
        Maha.setVisibility(View.GONE);
        Mahab.setVisibility(View.GONE);

        Dmaha.setVisibility(View.GONE);
        book=book.replace("Mahabharath","");
        Intent i=new Intent(Cart.this,Success.class);
        Bundle b = new Bundle();
        b.putString("books",book);
        i.putExtras(b);

    }
    public void Dath(View v)
    {
        Atharv.setVisibility(View.GONE);
        Athb.setVisibility(View.GONE);

        Dath.setVisibility(View.GONE);
        book=book.replace("Atharved","");
        Intent i=new Intent(Cart.this,Success.class);
        Bundle b = new Bundle();
        b.putString("books",book);
        i.putExtras(b);

    }




}
