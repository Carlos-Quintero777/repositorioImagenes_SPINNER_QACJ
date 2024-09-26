package com.example.repositorioimagenes_seleccionable_qacj;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class principalActivity extends AppCompatActivity {

    private HashMap<String, String> imagenesPrimos;
    private Spinner spinnerPrimos;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        imageView = findViewById(R.id.imageView);
        spinnerPrimos = findViewById(R.id.spinnerPrimos);
        configurarPrimos();


        String[] nombresPrimos = imagenesPrimos.keySet().toArray(new String[0]);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nombresPrimos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPrimos.setAdapter(adapter);


        spinnerPrimos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {

                String nombreSeleccionado = nombresPrimos[position];


                String imagenUrl = imagenesPrimos.get(nombreSeleccionado);
                if (imagenUrl != null) {
                    Picasso.get().load(imagenUrl).into(imageView);
                } else {
                    Toast.makeText(principalActivity.this, "No se encontró imagen para " + nombreSeleccionado, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    // Arreglo que ocupa links, y asigna nombre para buscar con piccaso y mostrar en el spin jsjs
    private void configurarPrimos() {
        imagenesPrimos = new HashMap<>();
        imagenesPrimos.put("Aaron", "https://drive.google.com/uc?id=1fDY74jdw2q_nJ_PpmzO61ZxIHeXpX0yv");
        imagenesPrimos.put("Adair", "https://drive.google.com/uc?id=1EMzViEG6Sc5tP_Qp3HQqIOBnZWVUoHVS");
        imagenesPrimos.put("Aldair", "https://drive.google.com/uc?id=1cC285QGGG7lVFuRH32aI3xEtayUFQvrl");
        imagenesPrimos.put("Alfredo", "https://drive.google.com/uc?id=1JqSX5G2_YFXqefG2jnD-h5sFSykxGLon");
        imagenesPrimos.put("Anahi", "https://drive.google.com/uc?id=1p8g1NXQdRanzGsIU9llE2tiladLhZ1B5");
        imagenesPrimos.put("Angel", "https://drive.google.com/uc?id=12EbSOvcCYGIDIDQ-5Ra9g29PhCjs0_Df");
        imagenesPrimos.put("Brayan", "https://drive.google.com/uc?id=1RDf4ryEkzJi3lewT-SNVTV_tYl-fE5OP");
        imagenesPrimos.put("YoMeroCaguamero", "https://drive.google.com/uc?id=19IDVCF282Stu9ETpMHzy6byZVoXWHPfZ");
        imagenesPrimos.put("Cesar", "https://drive.google.com/uc?id=1BvpcWOGvQB9TxbiM2bokFbSpgHWlxRki");
        imagenesPrimos.put("Emiliano", "https://drive.google.com/uc?id=1t-LyHgmYcQiectBUycCNPNc-7iiKKw_H");
        imagenesPrimos.put("Fabian", "https://drive.google.com/uc?id=1Wx6FU8RKlDQNz1OY8RpYfP5O19-PYWza");
        imagenesPrimos.put("Juan", "https://drive.google.com/uc?id=1e4f2JrcRa4Hk6g0Yn9nJkn3dSSK77Gnb");
        imagenesPrimos.put("Lesli", "https://drive.google.com/uc?id=13AtCZ6cRN5FhuT_XuyAw98LfkXJ9XwfN");
        imagenesPrimos.put("Mariana", "https://drive.google.com/uc?id=1smcm8_CRB-VBUqBSnVh64QHzxj0Vsa-6");
        imagenesPrimos.put("Mauricio", "https://drive.google.com/uc?id=1riOiCECN6TpID1EU7tMCXHzYV8DD4-xR");
        imagenesPrimos.put("Misael", "https://drive.google.com/uc?id=1KFxwd21gvBFodny6Q5zM_vEab0JIfzxG");
        imagenesPrimos.put("Moises", "https://drive.google.com/uc?id=1SD6MsF5K1rfghl7g0CIfAsAs01a9OExR");
        imagenesPrimos.put("Rafael", "https://drive.google.com/uc?id=13mzG2HNKKzMaGlKLfU6q2JDMEQmvAm9S");
        imagenesPrimos.put("Wendy", "https://drive.google.com/uc?id=1i6-uObnR9m3Cs_HbEJ2DlpnzwfxhLXt4");
        imagenesPrimos.put("Victor", "https://drive.google.com/uc?id=1MWlzsWAK1ntvjA-oWX09zhKE3c9o06hk");
    }
}
