package mx.edu.ittepic.lab_cardview_15;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<musica> listaMusica;
    RecyclerView listaObjetos;
    private RecyclerView.LayoutManager mLayoutManager;
    Adaptador adapter;

    String[] Genero = {"Folkloica",
            "Rock Alternativo", "Acusticos","Regueton","Danzon"};

    String[] Cancion = {"Sones de hueasteca",
            "Urbano Arengitno", "Concierto de trova","mala musica","musica para viejitos"};
    int[] ColorArreglo = {Color.rgb(233, 150, 122),
            Color.rgb(143,154,253), Color.rgb(223,130,22),Color.rgb(223,252,100),Color.rgb(100,150,100)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaObjetos = (RecyclerView) findViewById(R.id.caru);
        listaObjetos.setLayoutManager(new LinearLayoutManager(this));
        listaMusica= new ArrayList<>();
        obtenerAlumnos();

        adapter = new Adaptador(listaMusica, getApplicationContext());
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        listaObjetos.setAdapter(adapter);
    }

    public void obtenerAlumnos() {
        for (int i = 0; i < Genero.length; i++) {
            listaMusica.add(new musica(1, Genero[i], Cancion[i], "@drawable/p", ColorArreglo[i]));
        }

    }
}
