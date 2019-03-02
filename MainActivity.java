package com.example.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView singlescore,doublescore,fourscore,widescore,noscore,totscore;
    private Button singleminus,singleplus,doubleminus,doubleplus,fourminus,fourplus,wideminus,wideplus,nominus,noplus,total;
    private int singlescore1,doublescore1,fourscore1,widescore1,noscore1,totscore1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleminus=findViewById(R.id.singleminus);
        singleplus=findViewById(R.id.singleplus);
        doubleplus=findViewById(R.id.doubleplus);
        doubleminus=findViewById(R.id.doubleminus);
        fourminus=findViewById(R.id.fourminus);
        fourplus=findViewById(R.id.fourplus);
        wideminus=findViewById(R.id.wideminus);
        wideplus=findViewById(R.id.wideplus);
        nominus=findViewById(R.id.nominus);
        noplus=findViewById(R.id.noplus);

        singlescore=findViewById(R.id.singlescore);
        doublescore=findViewById(R.id.doublescore );
        fourscore=findViewById(R.id.fourscore);
        widescore=findViewById(R.id.widescore);
        noscore=findViewById(R.id.noscore);
        total=findViewById(R.id.total);
        totscore=findViewById(R.id.totscore);

        singleminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(singlescore1<=0){
                    singlescore1=0;
                    Toast.makeText(MainActivity.this, "Score cannot be less then 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    --singlescore1;
                    singlescore.setText(singlescore1+ "");
                }
            }
        });

        singleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singlescore1++;
                singlescore.setText(singlescore1+" ");

            }
        });

        doubleminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doublescore1<=0){
                    doublescore1=0;
                    Toast.makeText(MainActivity.this, "Score cannot be less then 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    --doublescore1;
                    doublescore.setText(doublescore1+ "");
                }
            }
        });

        doubleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doublescore1++;
                doublescore.setText(doublescore1+" ");

            }
        });

        fourminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fourscore1<=0){
                    fourscore1=0;
                    Toast.makeText(MainActivity.this, "Score cannot be less then 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    --fourscore1;
                    fourscore.setText(fourscore1+ "");
                }
            }
        });

        fourplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourscore1++;
                fourscore.setText(fourscore1+" ");

            }
        });

        wideminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(widescore1<=0){
                    widescore1=0;
                    Toast.makeText(MainActivity.this, "Score cannot be less then 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    --widescore1;
                    widescore.setText(widescore1+ "");
                }
            }
        });

        wideplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                widescore1++;
                widescore.setText(widescore1+" ");

            }
        });

        nominus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noscore1<=0){
                    noscore1=0;
                    Toast.makeText(MainActivity.this, "Score cannot be less then 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    --noscore1;
                    noscore.setText(noscore1+ "");
                }
            }
        });

        noplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noscore1++;
                noscore.setText(noscore1+" ");

            }
        });

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totscore1=singlescore1+doublescore1*2+fourscore1*4+widescore1;
                totscore.setText(totscore1+" ");

            }
        });









    }
}
