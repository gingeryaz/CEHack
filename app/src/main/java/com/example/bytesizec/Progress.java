package com.example.bytesizec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Progress extends AppCompatActivity {
    public TextView datascore;
    public TextView funcscore;
    public TextView passbyscore;
    public TextView inoutscore;
    public TextView pointerscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        datascore= (TextView) findViewById(R.id.datascore);
        funcscore= (TextView) findViewById(R.id.funcscore);
        passbyscore= (TextView) findViewById(R.id.passbyscore);
        inoutscore= (TextView) findViewById(R.id.inoutscore);
        pointerscore= (TextView) findViewById(R.id.pointerscore);




        datascore.setText(""+((ScoresClass) this.getApplication()).getData_types_score() + "/5");
        funcscore.setText(""+((ScoresClass) this.getApplication()).getFuncts_score()+ "/5");
        passbyscore.setText(""+((ScoresClass) this.getApplication()).getPass_by_score()+ "/5");
        inoutscore.setText(""+((ScoresClass) this.getApplication()).getInout_score()+ "/5");
        pointerscore.setText(""+((ScoresClass) this.getApplication()).getPointers_score()+ "/5");

    }
}
