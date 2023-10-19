package com.example.partediario;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;
    private String[] nombres = {"Nombre1", "Nombre2", "Nombre3"};
    private String[] razones = {"Razón 1", "Razón 2", "Razón 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tableLayout);

        for (String nombre : nombres) {
            TableRow row = new TableRow(this);

            TextView textView = new TextView(this);
            textView.setText(nombre);
            textView.setGravity(Gravity.CENTER);
            row.addView(textView);

            RadioButton formaRadioButton = new RadioButton(this);
            row.addView(formaRadioButton);

            RadioButton noFormaRadioButton = new RadioButton(this);
            row.addView(noFormaRadioButton);

            Spinner spinner = new Spinner(this);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, razones);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            row.addView(spinner);

            tableLayout.addView(row);
        }
    }
}
