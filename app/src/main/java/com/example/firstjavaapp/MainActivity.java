package com.example.firstjavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    TextView txtResult;

    Button btsky;
    Button btgrass;
    Button btroot;
    Button btreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.txtview1);
        txt1.setText("Yes, got it");
        txtResult = findViewById(R.id.textview2);

        btsky = findViewById(R.id.btnsky);
        btgrass = findViewById(R.id.btngrass);
        btroot = findViewById(R.id.btnroot);
        btreset = findViewById(R.id.reset);
        createQuiz();

        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createQuiz();
            }
        });
    }
    public void createQuiz(){
        Random rand = new Random();
        int i;
        int num = rand.nextInt(3);
        if(num == 0)
        {
            i = rand.nextInt(skyletters.length);
            txt1.setText(Character.toString(skyletters[i]));
        }
        else {
            if(num == 1)
            {
                i = rand.nextInt(grassletters.length);
                txt1.setText(Character.toString(grassletters[i]));
            }
            else
            {
                i = rand.nextInt(rootlettetrs.length);
                txt1.setText(Character.toString(rootlettetrs[i]));
            }
        }
        txtResult.setText("Astaghfirullah");

        // button listners
        btsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 0)
                {
                    txtResult.setText("JazaK'Allah");
                }
                else{
                    txtResult.setText("Sorry Wrong Answer");
                }
            }
        });

        btgrass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 1)
                {
                    txtResult.setText("Jazak'Allah");
                }
                else{
                    txtResult.setText("Sorry Wrong Answer");
                }
            }
        });

        btroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num == 2)
                {
                    txtResult.setText("Jazak'Allah");
                }
                else{
                    txtResult.setText("Sorry Wrong Answer");
                }
            }
        });
    }
    public char[] skyletters = {'b', 'd', 'f', 'h', 'k', 'l', 't'};
    public char[] grassletters = {'a', 'c', 'e', 'i', 'm', 'n', 'o','r', 's', 'u', 'v','w', 'x', 'z'};
    public char[] rootlettetrs = {'g','q','j','p' ,'y'};


}
