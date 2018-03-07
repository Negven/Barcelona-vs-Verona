package android.com.barcelonavsverona.game.eng;

import android.com.barcelonavsverona.R;
import android.com.barcelonavsverona.game.eng.rules.Eng_Game_rules_1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Eng_Title_window extends AppCompatActivity implements OnClickListener {

    Button btn_eng_play;
    Button btn_eng_settings;
    Button btn_eng_game_rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_title_window);

        btn_eng_play = (Button) findViewById(R.id.btn_eng_play);
        btn_eng_play.setOnClickListener(this);

        btn_eng_settings = (Button) findViewById(R.id.btn_eng_settings);
        btn_eng_settings.setOnClickListener(this);

        btn_eng_game_rules = (Button) findViewById(R.id.btn_eng_game_rules);
        btn_eng_game_rules.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_eng_settings:
                Intent intent2 = new Intent(this,Eng_Settings.class);
                startActivity(intent2);
                break;
            case R.id.btn_eng_play:
                Intent intent = new Intent(this,Eng_Types_of_game.class);
                startActivity(intent);
                break;

            case R.id.btn_eng_game_rules:
                Intent intent3 = new Intent(this,Eng_Game_rules_1.class);
                startActivity(intent3);
                break;
        }
    }
}
