package com.example.ptsgenap10rpl15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_Username;
    EditText et_Password;
    Button bt_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Username = (EditText)findViewById(R.id.et_Username);
        et_Password = (EditText)findViewById(R.id.et_Password);
        bt_submit = (Button)findViewById(R.id.bt_submit);
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_Username.getText().toString();
                String password = et_Password.getText().toString();
                if (email.equalsIgnoreCase("AriefStwn")
                        && password.equalsIgnoreCase("182005")){
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}