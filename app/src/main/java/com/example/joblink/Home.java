package com.example.joblink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Home extends AppCompatActivity {

    private Button mLogout;
    @BindView(R.id.intern) Button mIntern;
    @BindView(R.id.company) Button mCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        mCompany.setOnClickListener((View.OnClickListener) this);
        mIntern.setOnClickListener((View.OnClickListener) this);

        mLogout = findViewById(R.id.button);
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , MainActivity.class);
                startActivity(intent);
            }
        });




    }



}
