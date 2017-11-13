/*
package com.example.nicolasschilling.notizapp11;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;


public class MainActivityold extends AppCompatActivity {
    public Button btn;
    public TextView txt;
    public EditText edit; //Das hier erzeugt jeweils ein Objekt für die einzelnen XML-Dinger, den Button, die Meldung und das Eingabefeld
    public String Notiz = new String();
    public String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/aatutorial";
    public String notiz2;
    public int count; //Counter für die Anzahl Buchstaben im Array





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


        File dir = new File(path);  // Creating a folder in the location stored in "path"
        dir.mkdir();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IRGENDWAS was der Button tun soll hier rein


                //File file = new File (path + "/savedfile.txt");
               // String [] Notiz = String.valueOf(edit.getText()).split(System.getProperty("line seperator"));
                //count = Notiz.length;
               // txt.setText(count);




            }

        });



    }

}
*/
