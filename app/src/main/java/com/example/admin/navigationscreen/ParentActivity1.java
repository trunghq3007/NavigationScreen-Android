package com.example.admin.navigationscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ParentActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

    }

    public void click(View view) {
        Intent intent = new Intent(ParentActivity1.this, ParentActivity2.class);
        startActivity(intent);
    }
}
