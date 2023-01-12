package com.sesimalam.mylapor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;

import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button btnLogout;
    private Button btnEdit;
    private TextView editName;
    private TextView editAlamat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnEdit = findViewById(R.id.btnEdit);
        btnLogout = findViewById(R.id.btnLogout);
        showUserData();

        btnEdit.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
            startActivity(intent);
        });
        btnLogout.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        }

    public void showUserData(){

        Intent intent = getIntent();
        String editName = intent.getStringExtra("username");
        String editAlamat = intent.getStringExtra("alamat");
        String editUsername = intent.getStringExtra("username");
        String editEmail = intent.getStringExtra("email");
        String editNohp = intent.getStringExtra("nohp");
    }

    }