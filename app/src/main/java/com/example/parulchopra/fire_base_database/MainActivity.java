package com.example.parulchopra.fire_base_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
EditText E1,E2;
    Button B1;
    private Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1 = (EditText)findViewById(R.id.E1);
        E2 = (EditText)findViewById(R.id.E2);
        B1 = (Button) findViewById(R.id.B1);
        mref = new Firebase("https://fir-database-92281.firebaseio.com/users");
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String values = E1.getText().toString();
                String key = E2.getText().toString();
                //Firebase childref = mref.child("name");  only values replace each others
                //childref.setValue(values);

               // mref.push().setValue(values); each value added with unique id
                Firebase child = mref.child(key);
                child.setValue(values);


            }
        });
    }
}
