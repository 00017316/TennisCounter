package com.alvarenga.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private TextView score1;
    private TextView score2;
    private TextView J1S1;
    private TextView J1S2;
    private TextView J1S3;
    private TextView J2S1;
    private TextView J2S2;
    private TextView J2S3;
    private int cont1 = 0;
    private int cont2 = -1;
    private int cont3 = -1;
    private int cont4 = 0;
    private int cont5 = -1;
    private int cont6 = -1;
    private TextView Winner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score1 = (TextView) findViewById(R.id.ScoreQ);
        score2 = (TextView) findViewById(R.id.ScoreQT);
        btn1 = (Button) findViewById(R.id.Button1);
        btn2 = (Button) findViewById(R.id.Button01);
        btn3 = (Button) findViewById(R.id.ButtonReset);
        J1S1 = (TextView) findViewById(R.id.J1S1);
        J1S2 = (TextView) findViewById(R.id.J1S2);
        J1S3 = (TextView) findViewById(R.id.J1S3);
        J2S1 = (TextView) findViewById(R.id.J2S1);
        J2S2 = (TextView) findViewById(R.id.J2S2);
        J2S3 = (TextView) findViewById(R.id.J2S3);
        Winner = (TextView) findViewById(R.id.Won);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (score1.getText().toString().matches("0") && Winner.getText().toString().matches("")) {
                    score1.setText("15");
                }else if (score1.getText().toString().matches("15") && Winner.getText().toString().matches("")) {
                   score1.setText("30");
                }else if (score1.getText().toString().matches("30") && Winner.getText().toString().matches("")) {
                    score1.setText("40");
                }else if (Winner.getText().toString().matches("") && ((score1.getText().toString().matches("40") && !(score2.getText().toString().matches("40") || score2.getText().toString().matches("Adv"))) || score1.getText().toString().matches("Adv"))) {
                    score2.setText("0");
                    score1.setText("0");
                    if(J1S1.getText().toString().matches("0" ) || J1S1.getText().toString().matches("1" ) || J1S1.getText().toString().matches("2" ) || J1S1.getText().toString().matches("3" ) || J1S1.getText().toString().matches("4" ) || J1S1.getText().toString().matches("5" )){
                        cont1++;
                        if(cont1 == 1)
                            J1S1.setText("1");
                        if(cont1 == 2)
                            J1S1.setText("2");
                        if(cont1 == 3)
                            J1S1.setText("3");
                        if(cont1 == 4)
                            J1S1.setText("4");
                        if(cont1 == 5)
                            J1S1.setText("5");
                        if(cont1 == 6)
                            J1S1.setText("6");
                    }
                    if(J1S1.getText().toString().matches("6") && (J1S2.getText().toString().matches("0" ) || J1S2.getText().toString().matches("1" ) || J1S2.getText().toString().matches("2" ) || J1S2.getText().toString().matches("3" ) || J1S2.getText().toString().matches("4" ) || J1S2.getText().toString().matches("5" ))){
                        cont2++;
                        if(cont2 == 0)
                            J1S2.setText("0");
                        if(cont2 == 1)
                            J1S2.setText("1");
                        if(cont2 == 2)
                            J1S2.setText("2");
                        if(cont2 == 3)
                            J1S2.setText("3");
                        if(cont2 == 4)
                            J1S2.setText("4");
                        if(cont2 == 5)
                            J1S2.setText("5");
                        if(cont2 == 6)
                            J1S2.setText("6");
                    }
                    if(J1S2.getText().toString().matches("6") && (J1S3.getText().toString().matches("0" ) || J1S3.getText().toString().matches("1" ) || J1S3.getText().toString().matches("2" ) || J1S3.getText().toString().matches("3" ) || J1S3.getText().toString().matches("4" ) || J1S3.getText().toString().matches("5" ))){
                        cont3++;
                        if(cont3 == 0)
                            J1S3.setText("0");
                        if(cont3 == 1)
                            J1S3.setText("1");
                        if(cont3 == 2)
                            J1S3.setText("2");
                        if(cont3 == 3)
                            J1S3.setText("3");
                        if(cont3 == 4)
                            J1S3.setText("4");
                        if(cont3 == 5)
                            J1S3.setText("5");
                        if(cont3 == 6)
                            J1S3.setText("6");
                    }
                    if(J1S1.getText().toString().matches("6") && J1S2.getText().toString().matches("6") && J1S3.getText().toString().matches("6")){
                        //Ganador Jugador 1
                        Winner.setText("Jugador 1 Ganó!!!");
                        score2.setText("0");
                        score1.setText("0");
                    }
                }else if(score1.getText().toString().matches("40") && score2.getText().toString().matches("40")){
                    score1.setText("Adv");
                }else if(score2.getText().toString().matches("Adv") && score1.getText().toString().matches("40")){
                    score2.setText("40");
                    score1.setText("40");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (score2.getText().toString().matches("0") && Winner.getText().toString().matches("")) {
                    score2.setText("15");
                }else if (score2.getText().toString().matches("15") && Winner.getText().toString().matches("")) {
                    score2.setText("30");
                }else if (score2.getText().toString().matches("30") && Winner.getText().toString().matches("")) {
                    score2.setText("40");
                }else if (Winner.getText().toString().matches("") && ((score2.getText().toString().matches("40") && !(score1.getText().toString().matches("40") || score1.getText().toString().matches("Adv"))) || score2.getText().toString().matches("Adv"))) {
                    score1.setText("0");
                    score2.setText("0");
                    if(J2S1.getText().toString().matches("0" ) || J2S1.getText().toString().matches("1" ) || J2S1.getText().toString().matches("2" ) || J2S1.getText().toString().matches("3" ) || J2S1.getText().toString().matches("4" ) || J2S1.getText().toString().matches("5" )){
                        cont4++;
                        if(cont4 == 1)
                            J2S1.setText("1");
                        if(cont4 == 2)
                            J2S1.setText("2");
                        if(cont4 == 3)
                            J2S1.setText("3");
                        if(cont4 == 4)
                            J2S1.setText("4");
                        if(cont4 == 5)
                            J2S1.setText("5");
                        if(cont4 == 6)
                            J2S1.setText("6");
                    }
                    if(J2S1.getText().toString().matches("6") && (J2S2.getText().toString().matches("0" ) || J2S2.getText().toString().matches("1" ) || J2S2.getText().toString().matches("2" ) || J2S2.getText().toString().matches("3" ) || J2S2.getText().toString().matches("4" ) || J2S2.getText().toString().matches("5" ))){
                        cont5++;
                        if(cont5 == 0)
                            J2S2.setText("0");
                        if(cont5 == 1)
                            J2S2.setText("1");
                        if(cont5 == 2)
                            J2S2.setText("2");
                        if(cont5 == 3)
                            J2S2.setText("3");
                        if(cont5 == 4)
                            J2S2.setText("4");
                        if(cont5 == 5)
                            J2S2.setText("5");
                        if(cont5 == 6)
                            J2S2.setText("6");
                    }
                    if(J2S2.getText().toString().matches("6") && (J2S3.getText().toString().matches("0" ) || J2S3.getText().toString().matches("1" ) || J2S3.getText().toString().matches("2" ) || J2S3.getText().toString().matches("3" ) || J2S3.getText().toString().matches("4" ) || J2S3.getText().toString().matches("5" ))){
                        cont6++;
                        if(cont6 == 0)
                            J2S3.setText("0");
                        if(cont6 == 1)
                            J2S3.setText("1");
                        if(cont6 == 2)
                            J2S3.setText("2");
                        if(cont6 == 3)
                            J2S3.setText("3");
                        if(cont6 == 4)
                            J2S3.setText("4");
                        if(cont6 == 5)
                            J2S3.setText("5");
                        if(cont6 == 6)
                            J2S3.setText("6");
                    }
                    if(J2S1.getText().toString().matches("6") && J2S2.getText().toString().matches("6") && J2S3.getText().toString().matches("6")){
                        //Ganador Jugador 1
                        Winner.setText("Jugador 2 Ganó!!!");
                        score1.setText("0");
                        score2.setText("0");
                    }
                }else if(score2.getText().toString().matches("40") && score1.getText().toString().matches("40")){
                    score2.setText("Adv");
                }else if(score1.getText().toString().matches("Adv") && score2.getText().toString().matches("40")){
                    score1.setText("40");
                    score2.setText("40");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Winner.setText("");
                score1.setText("0");
                score2.setText("0");
                J1S1.setText("0");
                J1S2.setText("0");
                J1S3.setText("0");
                J2S1.setText("0");
                J2S2.setText("0");
                J2S3.setText("0");
                cont1 = 0;
                cont2 = -1;
                cont3 = -1;
                cont4 = 0;
                cont5 = -1;
                cont6 = -1;

            }
        });
    }
}
