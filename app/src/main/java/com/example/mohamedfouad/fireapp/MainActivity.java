package com.example.mohamedfouad.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;

   // final FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
   // DatabaseReference mRef = mDatabase.getReference("https://fireapp-122cd.firebaseio.com/");
    private Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndriodContext(this);
        mRef = new Firebase("https://fireapp-122cd.firebaseio.com/");


        mSendData = (Button)findViewById(R.id.sendData);
        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase mRefChild = mRef.child("Name");
                mRefChild.setValue("Omnia");
           //   DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("https://fireapp-122cd.firebaseio.com/");
             // mDatabase.child("Name").setValue("omnia");
            }
        });
    }
}
