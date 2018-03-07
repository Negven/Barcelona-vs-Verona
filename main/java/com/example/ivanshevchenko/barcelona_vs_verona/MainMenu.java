package com.example.ivanshevchenko.barcelona_vs_verona;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    @Override
    protected void onStart() {
        super.onStart();
        final Button play = (Button) findViewById(R.id.play);
        final Button settings = (Button) findViewById(R.id.settings);
        final Button game_rules = (Button) findViewById(R.id.game_rules);
        play.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(MainMenu.this, OnlineOfflineGame.class)
                );
            }
        });
        settings.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(MainMenu.this, Settings.class)
                );
            }
        });
        game_rules.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(MainMenu.this, GameRules.class)
                );
            }
        });
    }
}
