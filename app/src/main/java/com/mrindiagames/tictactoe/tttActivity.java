package com.mrindiagames.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.startDelay;

public class tttActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b22,b33;
    int turn;
     public void checkGame(){
        checkWinner(b1,b2,b3);
        checkWinner(b4,b5,b6);
        checkWinner(b7,b8,b9);
        checkWinner(b1,b4,b7);
        checkWinner(b2,b5,b8);
        checkWinner(b3,b6,b9);
        checkWinner(b1,b5,b9);
        checkWinner(b3,b5,b7);
    }

    public void checkWinner(Button b11,Button b22,Button b33){
         if (b11.getText()==b22.getText().toString() && b22.getText().toString()==b33.getText().toString() && b33.getText().toString()=="X"){
            Toast.makeText(tttActivity.this,"player 1 is winner ",Toast.LENGTH_LONG).show();
            //reset(view);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

        }
        else if (b11.getText()==b22.getText().toString() && b22.getText().toString()==b33.getText().toString() && b33.getText().toString()=="O"){
            //player 2 wins
            Toast.makeText(tttActivity.this,"player 2 is winner ",Toast.LENGTH_LONG).show();
            //reset(view);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }

    }
    public void reset(View view){
        turn =1;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

    }
    public void checkEmpty(){
         if (b1.getText().toString()!="" && b2.getText().toString()!="" && b3.getText().toString()!="" && b4.getText().toString()!="" && b5.getText().toString()!="" && b6.getText().toString()!="" && b7.getText().toString()!="" && b8.getText().toString()!="" && b9.getText().toString()!=""){
             Toast.makeText(tttActivity.this,"Match tie ",Toast.LENGTH_LONG).show();
             b1.setText("");
             b2.setText("");
             b3.setText("");
             b4.setText("");
             b5.setText("");
             b6.setText("");
             b7.setText("");
             b8.setText("");
             b9.setText("");
         }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
    }
    public void start(View view){
        setContentView(R.layout.activity_ttt);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        turn=1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")){
                    if (turn==1) {
                        b1.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b1.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")){
                    if (turn==1) {
                        b2.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b2.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")){
                    if (turn==1) {
                        b3.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b3.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")){
                    if (turn==1) {
                        b4.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b4.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")){
                    if (turn==1) {
                        b5.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b5.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        b6.setText("X");
                        turn = 2;
                    } else if (turn == 2) {
                        b6.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")){
                    if (turn==1) {
                        b7.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b7.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")){
                    if (turn==1) {
                        b8.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b8.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")){
                    if (turn==1) {
                        b9.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b9.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
                checkEmpty();
            }
        });

    }
}
