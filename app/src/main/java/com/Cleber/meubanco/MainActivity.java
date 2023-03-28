package com.Cleber.meubanco;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Cleber.meubanco.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgSaldo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent navegatela = new Intent(MainActivity.this, Saldo.class);
                startActivity(navegatela);
            }
        });
        binding.imgFatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navegarTelaDeFatura = new Intent(MainActivity.this,Fatura.class);
                startActivity(navegarTelaDeFatura);
                finish();
            }
        });


    }
}

