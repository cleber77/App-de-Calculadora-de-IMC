package com.Cleber.meubanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Cleber.meubanco.databinding.ActivityMainBinding;
import com.Cleber.meubanco.databinding.ActivitySaldoBinding;

public class Saldo extends AppCompatActivity {

    private ActivitySaldoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
         binding.toolbarSaldo.setNavigationOnClickListener(new View.OnClickListener(){
             @Override
             public  void  onClick(View view){

              Intent voltaParaVolta   =  new Intent(Saldo.this,MainActivity.class);

              startActivity(voltaParaVolta);
        }


    });
}
}