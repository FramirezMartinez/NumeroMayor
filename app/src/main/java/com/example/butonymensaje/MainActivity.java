package com.example.butonymensaje;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText etcN1;
    private EditText etcN2;
    private EditText etcN3;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los campos de texto EditText
        etcN1 = findViewById(R.id.etN1);
        etcN2 = findViewById(R.id.etN2);
        etcN3 = findViewById(R.id.etntres);
        resultado = findViewById(R.id.resul);

        // Configurar el botón para responder al clic
        Button objcalcular = findViewById(R.id.btncalcular);
        objcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí ejecuta tu función
                ejecutarMiFuncion();
            }
        });
    }

    private void ejecutarMiFuncion() {
        try {
            // Obtener el texto de los EditText y convertirlos a números enteros
            int valorN1 = Integer.parseInt(etcN1.getText().toString());
            int valorN2 = Integer.parseInt(etcN2.getText().toString());
            int valorN3 = Integer.parseInt(etcN3.getText().toString());

            int numeroMayor = valorN1;  // Suponemos que el número mayor es valorN1 inicialmente

            // Comparar con valorN2 y actualizar si es necesario
            if (valorN2 > numeroMayor) {
                numeroMayor = valorN2;
            }

            // Comparar con valorN3 y actualizar si es necesario
            if (valorN3 > numeroMayor) {
                numeroMayor = valorN3;
            }

            resultado.setText("El número mayor es: " + numeroMayor);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            resultado.setText("Ingrese números válidos en todos los campos");
        }
    }
}
