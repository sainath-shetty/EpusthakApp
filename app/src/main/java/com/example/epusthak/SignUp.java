package com.example.epusthak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    EditText username,passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username=findViewById(R.id.name);
        passwd=findViewById(R.id.pass);
    }
    public void Save(View v)
    {
        if(passwd.getText().toString().length()>=8 && validatepassword(passwd.getText().toString()))
        {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,SignIn.class);
            Bundle b = new Bundle();
            b.putString("uid",username.getText().toString());
            b.putString("password",passwd.getText().toString());
            i.putExtras(b);
            startActivity(i);
        }
        else
        {

            Toast.makeText(this, "Password not meeting constraints", Toast.LENGTH_LONG).show();
        }
    }
    public boolean validatepassword(String password)
    {
        Pattern ptrn;
        Matcher mat;
        String passwordptrn="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[<>/+-@#$])(?=\\S+$).{8,}$";
        ptrn=Pattern.compile(passwordptrn);
        mat=ptrn.matcher(password);
        return mat.matches();
    }

}