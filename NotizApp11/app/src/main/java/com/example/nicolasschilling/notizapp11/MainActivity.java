package com.example.nicolasschilling.notizapp11;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView txt;
    public EditText edit; //Das hier erzeugt jeweils ein Objekt für die einzelnen XML-Dinger, den Button, die Meldung und das Eingabefeld
    public String Notiz = new String();
    public String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/aatutorial";
    public String notiz2;
    public int count; //Counter für die Anzahl Buchstaben im Array
    //public File ordner;
    String SimpleDateFormat;
    String datum;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        edit = (EditText)
                findViewById(R.id.editnotiz);
        txt = (TextView)
                findViewById(R.id.helloworld);

        btn =(Button)
                findViewById(R.id.mybutton); //Hier wird dem Button "btn" der Button aus der XML-Datei zugewiesen
       /* ordner = new File(Environment.getExternalStorageDirectory(),"NotizenApp");
            if (!ordner.exists()) {
                ordner.mkdirs();

            } else {
                //Toast.makeText(getApplicationContext(), "Ordner konnte nicht erstellt werden.", Toast.LENGTH_SHORT).show();
            }

        */



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() > 0) {   // Prüft, ob Text vorhanden ist

                    //File notizdatei = new File(ordner, "Text_"+ System.currentTimeMillis()+ ".txt");

                    try {
                   // OutputStream outputStream = new FileOutputStream(notizdatei);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getApplicationContext().openFileOutput("notizdatei.txt", Context.MODE_PRIVATE)); // Context ist ein Enum, getApplicationContext kann auch durch den konkreten Context ausgetauscht werden (den ich aber hier nicht kenne)
                        outputStreamWriter.write(edit.getText().toString());
                        Toast.makeText(getApplicationContext(), edit.getText().toString()+" ...wurde gespeichert", Toast.LENGTH_SHORT).show();
                    outputStreamWriter.close();
                    // Hier noch eine Prüfung einfügen, ob die .txt existiert
                    edit.setText(null);      // leert das Textfeld



                        } catch (IOException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),"Es ist ein Fehler aufgetreten. Konnte nicht gespeichert werden.", Toast.LENGTH_LONG).show();
                        }


                } else {
                    Toast.makeText(getApplicationContext(), "Bitte geben Sie Text ein!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}