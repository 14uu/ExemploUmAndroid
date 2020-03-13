package com.example.exemploum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView res;
    Button btnSoma;
    double num1, num2, soma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText)findViewById(R.id.num2);
        res = (TextView)findViewById(R.id.resultado);
        btnSoma = (Button)findViewById(R.id.btnCalcula);


    }
    public void  Calcula (View view)
    {
        num1 = Double.parseDouble(n1.getText().toString());
        num2 = Double.parseDouble(n2.getText().toString());
        soma = num1 + num2;
        res.setText(Double.toString(soma));
    }
}
