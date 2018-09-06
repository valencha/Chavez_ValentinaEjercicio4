package com.example.valentinachavez.chavez_valentinaejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ListView lv_contactos;
    ContactoAdapter customAdapter;
    EditText edt_name;
    EditText edt_number;
    Switch switch_gene;
    Button btn_agregar;
    TextView tv_f;
    String genero;
    ImageView img_genero;
    Boolean switchState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_name = findViewById(R.id.edt_name);
        edt_number = findViewById(R.id.edt_number);
        switch_gene = findViewById(R.id.switch_gene);
        btn_agregar = findViewById(R.id.btn_agregar);
        img_genero = findViewById(R.id.img_genero);
        tv_f = findViewById(R.id.tv_f);

        lv_contactos = findViewById(R.id.lv_contactos);
        customAdapter = new ContactoAdapter(MainActivity.this);
        switchState = switch_gene.isChecked();
        lv_contactos.setAdapter(customAdapter);


        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = edt_name.getText().toString();

                String num = edt_number.getText().toString();


                if (switchState = true) {
                    genero = "mujer";
                } else {
                    genero = "hombre";
                }


                Contacto newContacto = new Contacto(nom, num, genero);
                customAdapter.agregarContacto(newContacto);


            }
        });

    }


}
