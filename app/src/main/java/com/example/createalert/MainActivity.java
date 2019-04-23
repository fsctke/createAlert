package com.example.createalert;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog myAlertDialog;
    AlertDialog.Builder myBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBuilder = new AlertDialog.Builder(MainActivity.this);
        myBuilder.setTitle("my title");
        myBuilder.setMessage("this is a message");
        myBuilder.setPositiveButton("click me", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "click me button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
        myBuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "cancel button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialog = myBuilder.create();
        myAlertDialog.show();
        myAlertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.colorAlertDialog));
        myAlertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.colOrAlertDiaglogNeg));


    }
}
