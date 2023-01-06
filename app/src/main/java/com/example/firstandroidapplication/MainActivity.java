package com.example.firstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtGreeting;
    EditText txtPersonName;
    Button btnSubmit;

    EditText txtHowAmI;
    Button btnSubmitHowAm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGreeting = findViewById(R.id.txtGreeting);
        txtPersonName = findViewById(R.id.txtPersonName);
        btnSubmit = findViewById(R.id.btnSubmit);

        txtHowAmI = findViewById(R.id.txtHowAmI);
        btnSubmitHowAm = findViewById(R.id.btnSubmitHowAm);


        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtGreeting.setText("How are you, " + txtPersonName.getText().toString() + "?");
                txtPersonName.setText("");
            }
        });

        btnSubmitHowAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHowAmI.setText("");
            }
        });

    }
}