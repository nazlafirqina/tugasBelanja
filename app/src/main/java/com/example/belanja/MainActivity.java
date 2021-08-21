package com.example.belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText minyak, mieInstan, deterjen;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minyak = (EditText) findViewById(R.id.idMinyak);
        mieInstan = (EditText) findViewById(R.id.idMieInstan);
        deterjen = (EditText) findViewById(R.id.idDeterjen);

        button = (Button) findViewById(R.id.button6);

        button.setOnClickListener(this);
    }

    public boolean validate() {
        boolean returnal = true;
        if (minyak.getText().toString().isEmpty()) {
            returnal = false;
        }

        if (mieInstan.getText().toString().isEmpty()) {
            returnal = false;
        }

        if (deterjen.getText().toString().isEmpty()) {
            returnal = false;
        }

        return returnal;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button6:
                Log.e("CATCH", "minyak " + minyak.getText().toString());
                Log.e("CATCH", "mie " + mieInstan.getText().toString());
                Log.e("CATCH", "deterjen " + deterjen.getText().toString());
                if (validate()) {
                    Intent intent = new Intent(this, hasil.class);
                    intent.putExtra(hasil.KEY_MINYAK, Integer.parseInt(minyak.getText().toString()));
                    intent.putExtra(hasil.KEY_MIEINSTAN, Integer.parseInt(mieInstan.getText().toString()));
                    intent.putExtra(hasil.KEY_DETERJEN, Integer.parseInt(deterjen.getText().toString()));
                    Log.d("ACT", "Sending data to hasilActivity");
                    startActivity(intent);
                }

                break;
        }
//        Bundle bundle = new Bundle();
//        bundle.putInt("minyak",Integer.parseInt(minyak.getText().toString()));
//        bundle.putInt("mieInstan",Integer.parseInt(mieInstan.getText().toString()));
//        bundle.putInt("deterjen",Integer.parseInt(deterjen.getText().toString()));
//
//        Intent intent = new Intent(this, hasil.class);
//        intent.putExtra("minyak",Integer.parseInt(minyak.getText().toString()));
//        intent.putExtra("mieInstan",Integer.parseInt(mieInstan.getText().toString()));
//        intent.putExtra("deterjen",Integer.parseInt(deterjen.getText().toString()));
//
//        intent.putExtras(bundle);
//        startActivity(intent);

    }
}