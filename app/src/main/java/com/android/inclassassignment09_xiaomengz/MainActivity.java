package com.android.inclassassignment09_xiaomengz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference stringRef;
    private DatabaseReference iceCreamRef;

    private int stringIndex = 1;
    private int iceCreamIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        stringRef = database.getReference("string_value");
        iceCreamRef = database.getReference("ice_cream");
    }

    public void uploadString(View view) {
        stringRef.setValue("This is string " + stringIndex);
        stringIndex++;
    }

    public void uploadIceCream(View view) {
        iceCreamRef.push().setValue(new IceCream("Ice Cream " + iceCreamIndex, true, 2));
        iceCreamIndex++;
    }
}
