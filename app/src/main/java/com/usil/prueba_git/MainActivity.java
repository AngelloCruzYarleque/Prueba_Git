package com.usil.prueba_git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView prueba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias() {
        prueba=findViewById(R.id.txtPrueba);
        prueba.setText("qqq");
    }
}