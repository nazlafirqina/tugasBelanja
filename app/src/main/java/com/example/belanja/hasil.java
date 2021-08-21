package com.example.belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    public static final String KEY_MINYAK = "MINYAK";
    public static final String KEY_MIEINSTAN = "MIEINSTAN";
    public static final String KEY_DETERJEN = "DETERJEN";



    private TextView tvTotalBelanja, tvTotalMinyak, tvTotalMie, tvTotalDeterjen, tvQtyMinyak, tvQtyMie, tvQtyDeterjen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvTotalBelanja = findViewById(R.id.totalBelanja);
        tvTotalMinyak = findViewById(R.id.totalMinyak);
        tvTotalMie = findViewById(R.id.totalMie);
        tvTotalDeterjen = findViewById(R.id.totalDeterjen);
        tvQtyMinyak = findViewById(R.id.qtyMinyak);
        tvQtyMie = findViewById(R.id.qtyMie);
        tvQtyDeterjen = findViewById(R.id.qtyDeterjen);


//        Bundle bundle = getIntent().getExtras().getBundle("bundle");
//
        Integer qtyMinyak = getIntent().getIntExtra(KEY_MINYAK, 0);
        Integer qtyMie = getIntent().getIntExtra(KEY_MIEINSTAN, 0);
        Integer qtyDeterjen = getIntent().getIntExtra(KEY_DETERJEN, 0);
        Log.e("IntentCatch", qtyMinyak.toString() + " " + qtyMie.toString() + " " + qtyDeterjen.toString());
//
//
        Integer totalMinyak = qtyMinyak * 29000;
        Integer totalIndomie = qtyMie * 2500;
        Integer totalDeterjen = qtyDeterjen * 30000;
//
        Integer totalHarga = totalMinyak + totalIndomie + totalDeterjen;
//
        tvTotalBelanja.setText(totalHarga.toString());

        tvTotalMinyak.setText(totalMinyak.toString());

        tvTotalMie.setText(totalIndomie.toString());

        tvTotalDeterjen.setText(totalDeterjen.toString());

        tvQtyMinyak.setText(qtyMinyak.toString());

        tvQtyMie.setText(qtyMie.toString());

        tvQtyDeterjen.setText(qtyDeterjen.toString());
    }
}