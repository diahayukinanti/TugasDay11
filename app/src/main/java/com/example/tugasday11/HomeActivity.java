package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    ImageButton chatButton, phoneButton, playButton, settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        chatButton = findViewById(R.id.chatButton);
        phoneButton = findViewById(R.id.phoneButton);
        playButton = findViewById(R.id.playButton);
        settingsButton = findViewById(R.id.settingsButton);
        klik();
    }
    void klik(){
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchatButton = new Intent(HomeActivity.this, ObrolanActivity.class);
                startActivity(intentchatButton);
            }
        });
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentphoneButton = new Intent(HomeActivity.this, PanggilanActivity.class);
                startActivity(intentphoneButton);
            }
        });
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplayButton = new Intent(HomeActivity.this, VoomActivity.class);
                startActivity(intentplayButton);
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(HomeActivity.this, PengaturanActivity.class);
                startActivity(intentsettingsButton);
            }
        });
    }
}