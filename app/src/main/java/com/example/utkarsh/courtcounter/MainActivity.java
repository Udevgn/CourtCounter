package com.example.utkarsh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Score_A=0;
    int Score_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneforTeamA(View view){
         Score_A+=1;
        TextView total_a = (TextView)findViewById(R.id.teamA_scoreCount);
        total_a.setText(Score_A+"");
    }
    public void addTwoforTeamA(View view){
        Score_A+=2;
        TextView total_a = (TextView)findViewById(R.id.teamA_scoreCount);
        total_a.setText(Score_A+"");
    }
    public void addThreeforTeamA(View view){
        Score_A+=3;
        TextView total_a = (TextView)findViewById(R.id.teamA_scoreCount);
        total_a.setText(Score_A+"");
    }

    public void addOneforTeamB(View view){
        Score_B+=1;
        TextView total_b = (TextView)findViewById(R.id.teamB_scoreCount);
        total_b.setText(Score_B+"");
    }
    public void addTwoforTeamB(View view){
        Score_B+=2;
        TextView total_b = (TextView)findViewById(R.id.teamB_scoreCount);
        total_b.setText(Score_B+"");
    }
    public void addThreeforTeamB(View view){
        Score_B+=3;
        TextView total_b = (TextView)findViewById(R.id.teamB_scoreCount);
        total_b.setText(Score_B+"");
    }
    public void Reset(View view){
        TextView total_a = (TextView)findViewById(R.id.teamA_scoreCount);
        TextView total_b = (TextView)findViewById(R.id.teamB_scoreCount);
        Score_A=0;
        Score_B=0;
        total_a.setText("0");
        total_b.setText("0");
    }

}
