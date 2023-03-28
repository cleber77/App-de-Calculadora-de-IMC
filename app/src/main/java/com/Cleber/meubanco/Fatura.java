package com.Cleber.meubanco;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Cleber.meubanco.databinding.ActivityFaturaBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Fatura extends AppCompatActivity {

    private ActivityFaturaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding .toolbarFatura.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent votarTelaPrincipal = new Intent(Fatura.this,MainActivity.class);
                startActivity(votarTelaPrincipal);
            }
        });

        CreditCardView cartaoDeCreditor = binding.CartaoDeCredito;
        cartaoDeCreditor.setCardNumber("444 526 239 369");

        cartaoDeCreditor.setCardName("Cleber Geraldo da Silva");
        cartaoDeCreditor.setExpiryDate("12/23");
        cartaoDeCreditor.setType(CardType.MASTERCARD);

    }
}