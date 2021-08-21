package com.example.belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    private Integer hasil1;
    private Integer hasil2;
    private Integer hasil3;

    private TextView totalBelanja, totalMinyak, totalMie, totalDeterjen;
    private  TextView qtyMinyak, qtyMie, qtyDeterjen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        totalBelanja = findViewById(R.id.totalBelanja);
        totalMinyak = findViewById(R.id.totalMinyak);
        totalMie= findViewById(R.id.totalMie);
        totalDeterjen = findViewById(R.id.totalDeterjen);
        qtyMinyak = findViewById(R.id.qtyMinyak);
        qtyMie = findViewById(R.id.qtyMie);
        qtyDeterjen = findViewById(R.id.qtyDeterjen);


        Bundle bundle = getIntent().getExtras().getBundle("bundle");

        hasil1 = getIntent().getExtras().getInt("minyak");
        hasil2 = getIntent().getExtras().getInt("mieInstan");
        hasil3 = getIntent().getExtras().getInt("deterjen");


        Integer totalMinyak1 = hasil1 * 29000;
        Integer totalIndomie1 = hasil2 * 2500;
        Integer totalDeterjen1 = hasil3 * 30000;

        Integer totalHarga = totalMinyak1 + totalIndomie1 + totalDeterjen1;

        totalBelanja.setText(totalHarga);

        totalMinyak.setText(totalMinyak1);

        totalMie.setText(totalIndomie1);

        totalMinyak.setText(totalDeterjen1);

        qtyMinyak.setText(hasil1);

        qtyMie.setText(hasil2);

        qtyMinyak.setText(hasil3);
    }
}