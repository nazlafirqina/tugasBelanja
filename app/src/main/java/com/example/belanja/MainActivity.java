package com.example.belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity   {
    public EditText minyak, mieInstan, deterjen;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minyak = findViewById(R.id.idMinyak);
        mieInstan = findViewById(R.id.idMieInstan);
        deterjen = findViewById(R.id.idDeterjen);
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("minyak",Integer.parseInt(minyak.getText().toString()));
        bundle.putInt("mieInstan",Integer.parseInt(mieInstan.getText().toString()));
        bundle.putInt("deterjen",Integer.parseInt(deterjen.getText().toString()));

        Intent intent = new Intent(this, hasil.class);
        intent.putExtra("minyak",Integer.parseInt(minyak.getText().toString()));
        intent.putExtra("mieInstan",Integer.parseInt(mieInstan.getText().toString()));
        intent.putExtra("deterjen",Integer.parseInt(deterjen.getText().toString()));

        intent.putExtras(bundle);
        startActivity(intent);

    }
}