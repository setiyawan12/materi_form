package com.example.from;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BebasActivity extends AppCompatActivity {
    EditText usr, nim, pass;
    Button login;
    String var_nama, var_nim, var_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebas);
        usr = findViewById(R.id.tv1);
        nim = findViewById(R.id.tv2 );
        pass = findViewById(R.id.tv3);

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usr.getText().toString().length()==0){
                    usr.setError("Masukan Username");
                }
                else if (nim.getText().toString().length()==0){
                    nim.setError("Masukan Nim");
                }
                else if (pass.getText().toString().length()==0){
                    pass.setError("Masukan Password");
                }
                else {


             var_nama =usr.getText().toString();
             var_nim =nim.getText().toString();
             var_pass =pass.getText().toString();

                Intent intent= new Intent(BebasActivity.this, Home.class);
                Bundle a= new Bundle();
                a.putString("1", var_nama);
                a.putString("2", var_nim);
                a.putString("3", var_pass);
                intent.putExtras(a);
                startActivity(intent);


            }
            }
        });


    }
}
