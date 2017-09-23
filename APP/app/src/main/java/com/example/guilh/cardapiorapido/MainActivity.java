package com.example.guilh.cardapiorapido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) this.findViewById(R.id.bntrestaurante1);
        btn2 = (Button) this.findViewById(R.id.bntrestaurante2);
        btn3 = (Button) this.findViewById(R.id.bntrestaurante3);
        btn4 = (Button) this.findViewById(R.id.bntrestaurante4);
        this.chamarbotoes();

    }
    protected void chamarbotoes() {
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), CardapioRestaurantes.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), CardapioRestaurantes.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), CardapioRestaurantes.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), CardapioRestaurantes.class);
                startActivity(i);
            }
        });
    }

}
