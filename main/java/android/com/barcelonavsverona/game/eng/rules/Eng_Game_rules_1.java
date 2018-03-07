package android.com.barcelonavsverona.game.eng.rules;

import android.annotation.SuppressLint;
import android.com.barcelonavsverona.R;
import android.com.barcelonavsverona.game.eng.Eng_Title_window;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.com.barcelonavsverona.game.eng.rules.Eng_Game_rules_2;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Eng_Game_rules_1 extends AppCompatActivity implements OnClickListener {

    ImageButton btn_next_eng_slide;
    ImageButton btn_previous_eng_slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_game_rules_1);

        btn_next_eng_slide = (ImageButton) findViewById(R.id.btn_next_eng_slide);
        btn_next_eng_slide.setOnClickListener(this);

        btn_previous_eng_slide = (ImageButton) findViewById(R.id.btn_previous_eng_slide);
        btn_previous_eng_slide.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next_eng_slide:
                Intent intent = new Intent(this, Eng_Game_rules_2.class);
                startActivity(intent);
                break;
            case R.id.btn_previous_eng_slide:
                Intent intent2 = new Intent(this, Eng_Title_window.class);
                startActivity(intent2);
                break;
        }
    }
}
