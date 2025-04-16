package com.example.appcompras;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxArroz, checkBoxLeite, checkBoxCarne, checkBoxFeijao, checkBoxRefri;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar componentes
        checkBoxArroz = findViewById(R.id.checkBoxArroz);
        checkBoxLeite = findViewById(R.id.checkBoxLeite);
        checkBoxCarne = findViewById(R.id.checkBoxCarne);
        checkBoxFeijao = findViewById(R.id.checkBoxFeijao);
        checkBoxRefri = findViewById(R.id.checkBoxRefri);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurar listener do botão
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        double total = 0.0;

        if (checkBoxArroz.isChecked()) {
            total += 2.69;
        }
        if (checkBoxLeite.isChecked()) {
            total += 2.70;
        }
        if (checkBoxCarne.isChecked()) {
            total += 16.70;
        }
        if (checkBoxFeijao.isChecked()) {
            total += 3.38;
        }
        if (checkBoxRefri.isChecked()) {
            total += 3.00;
        }

        textViewResultado.setText(String.format("Total: R$ %.2f", total));
    }


}