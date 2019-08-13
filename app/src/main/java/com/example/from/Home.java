package com.example.from;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    String get_nama, get_nim, get_passwd;
    TextView nama, nim, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nama=findViewById(R.id.nama1);
        nim=findViewById(R.id.nama2);
        password=findViewById(R.id.nama3);

        Bundle a= getIntent().getExtras();
        get_nama=a.getString("1");
        get_nim=a.getString("2");
        get_passwd=a.getString("3");

        nama.setText("Nama ="+get_nama);
        nim.setText("Nim ="+get_nim);
        password.setText("Password ="+get_passwd);

    }
}
