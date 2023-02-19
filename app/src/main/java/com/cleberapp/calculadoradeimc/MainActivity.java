package com.cleberapp.calculadoradeimc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cleberapp.calculadoradeimc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());

        binding.btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String peso = binding.editPeso.getText().toString();
                String altura = binding.editAltura.getText().toString();

                if (peso.isEmpty()){
                    binding.editPeso.setError("Informe seu peso ");

                }else if (altura.isEmpty()){
                    binding.editAltura.setError("Informe sua Altura ");
                }else {
                      calcularImc();

                }
            }
        });
     }

      private  void calcularImc(){

        float peso = Float.parseFloat(binding.editPeso.getText().toString());
        float altura = Float.parseFloat(binding.editAltura.getText().toString());
        float imc = peso / (altura * altura);

        if (imc <  18.5){
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Peso Baixo");
        }else if ( imc <= 24.9) {
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Peso Normal");
        }else if(imc <= 29.9){
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Sobrepeso");
        }else if ( imc <= 34.9){
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Obesidade (Grau 1)");
        }else if  ( imc <= 40.9){
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Obesidade Severa (Grau 2)");
        }else if (imc <= 44.9){
            binding.textResultado.setText("Seu IMC é de "+ imc +"\n" + "Obesidade Severa (Grau 3)");
        }
      }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemID = item.getItemId();

        if (itemID == R.id.ic_limpar){
            binding.editPeso.setText("");
            binding.editAltura.setText("");
            binding.textResultado.setText("");
        }

        return super.onOptionsItemSelected(item);
    }
}





























