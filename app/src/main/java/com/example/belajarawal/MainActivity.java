package com.example.belajarawal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edPanjang,edLebar,edTinggi;
    private Button btnHitung;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("RKR",MainActivity.class.getSimpleName()+"on craate");

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        edTinggi = findViewById(R.id.edTinggi);
        btnHitung  = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer Panjang = Integer.parseInt(edPanjang.getText().toString());
                Integer Lebar = Integer.parseInt(edLebar.getText().toString());
                Integer Tinggi = Integer.parseInt(edTinggi.getText().toString());
                tvHasil.setText(String.valueOf(Panjang*Lebar*Tinggi));




            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RKR",MainActivity.class.getSimpleName()+" onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RKR",MainActivity.class.getSimpleName()+"onRusume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RKR",MainActivity.class.getSimpleName()+"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RKR",MainActivity.class.getSimpleName()+"onRestart");
    }

}