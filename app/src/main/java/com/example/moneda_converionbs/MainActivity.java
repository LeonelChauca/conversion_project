package com.example.moneda_converionbs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static final double USD_RATE = 0.145;
    private static final double EUR_RATE = 0.122;
    private static final double JPY_RATE = 15.70;
    private static final double CNY_RATE = 0.92;
    private static final double PEN_RATE = 0.50;
    private static final double BRL_RATE = 0.77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PresionarBoton(View v){
        EditText text_num = findViewById(R.id.input_num);
        String txt=text_num.getText().toString();

        TextView dolar = findViewById(R.id.tx_dolares);
        TextView euro = findViewById(R.id.tx_euros);
        TextView yenes = findViewById(R.id.tx_yenes);
        TextView yuanes = findViewById(R.id.tx_yuanes);
        TextView soles = findViewById(R.id.tx_soles);
        TextView reales = findViewById(R.id.tx_reales);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        try{
            dolar.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*USD_RATE)));
            euro.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*EUR_RATE)));
            yenes.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*JPY_RATE)));
            yuanes.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*CNY_RATE)));
            soles.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*PEN_RATE)));
            reales.setText(String.valueOf(decimalFormat.format(Double.parseDouble(txt)*BRL_RATE)));
        }
        catch (NumberFormatException err){

        }

    }
}