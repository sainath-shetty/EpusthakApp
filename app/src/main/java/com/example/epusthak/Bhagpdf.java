package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bhagpdf extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhagpdf);
        Bundle b=getIntent().getExtras();
        String book=b.getString("bookid");
        pdfView=findViewById(R.id.pdf_view);
    if(book.equals("Ram"))
    {
        pdfView.fromAsset("ram.pdf").load();
    }
    else if(book.equals("Bhag")) pdfView.fromAsset("Bhag.pdf").load();
    else if(book.equals("RamC")) pdfView.fromAsset("ramC.pdf").load();
    else if(book.equals("maha")) pdfView.fromAsset("maha.pdf").load();
    else if(book.equals("atharv")) pdfView.fromAsset("arthved.pdf").load();
    }
}