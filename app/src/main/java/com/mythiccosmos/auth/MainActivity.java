package com.mythiccosmos.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mythiccosmos.auth.lib.FirebaseAuthUI;

public class MainActivity extends AppCompatActivity {

    FirebaseAuthUI firebaseAuthUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuthUI = new FirebaseAuthUI(this,this);

        firebaseAuthUI.setAuthProviderEMAIL();
        firebaseAuthUI.setAuthProviderPHONE();
        firebaseAuthUI.setAuthProviderGOOGLE();
        firebaseAuthUI.createSignInIntent();
    }
}
