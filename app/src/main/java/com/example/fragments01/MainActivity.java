package com.example.fragments01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button1 = findViewById(R.id.button);
//        button2 = findViewById(R.id.button2);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragment = new FragmentOne();
//                fragmentManager = getSupportFragmentManager();
//                fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment, fragment);
//                fragmentTransaction.commit();
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragment = new FragmentTwo();
//                fragmentManager = getSupportFragmentManager();
//                fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment, fragment);
//                fragmentTransaction.commit();
//            }
//        });
//

    }
    // [ORIENTATION NOT WORKING - CRASHING APP]
    public void change(View view) {
        fragment = null;
        switch (view.getId()) {
            case R.id.button:
                fragment = new FragmentOne();
                break;
            case R.id.button2:
                fragment = new FragmentTwo();
                break;
        }
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }
}
