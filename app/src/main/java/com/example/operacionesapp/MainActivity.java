package com.example.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        tv = findViewById(R.id.tv);
    }

    public void sumar (View view){
        String valor1=number1.getText().toString();
        String valor2=number2.getText().toString();
        Float nro1=Float.parseFloat(valor1);
        Float nro2=Float.parseFloat(valor2);
        Float suma=nro1+nro2;
        String resu=String.valueOf(suma);
        tv.setText(resu);
    }
    public void restar (View view){
        String valor1=number1.getText().toString();
        String valor2=number2.getText().toString();
        Float nro1=Float.parseFloat(valor1);
        Float nro2=Float.parseFloat(valor2);
        Float res=nro1-nro2;
        String resu=String.valueOf(res);
        tv.setText(resu);
    }

    public void multi (View view){
        String valor1=number1.getText().toString();
        String valor2=number2.getText().toString();
        Float nro1=Float.parseFloat(valor1);
        Float nro2=Float.parseFloat(valor2);
        Float multi=nro1*nro2;
        String resu=String.valueOf(multi);
        tv.setText(resu);
    }
    public void dividir (View view){
        String valor1=number1.getText().toString();
        String valor2=number2.getText().toString();
        Float nro1=Float.parseFloat(valor1);
        Float nro2=Float.parseFloat(valor2);
        if(nro2 != 0 ){
            Float divi=nro1/nro2;
            String resu=String.valueOf(divi);
            tv.setText(resu);
        }else{
            tv.setText("Error");
        };
    }
}