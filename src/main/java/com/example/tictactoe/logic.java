package com.example.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class logic {

    public void check(Button button[], Label Turn) {
        if (button[1].getText().equals("X") && button[2].getText().equals("X") && button[3].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[1].getText().equals("O") && button[2].getText().equals("O") && button[3].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[4].getText().equals("X") && button[5].getText().equals("X") && button[6].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[4].getText().equals("O") && button[5].getText().equals("O") && button[6].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[7].getText().equals("X") && button[8].getText().equals("X") && button[9].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[7].getText().equals("O") && button[8].getText().equals("O") && button[9].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[1].getText().equals("X") && button[4].getText().equals("X") && button[7].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[1].getText().equals("O") && button[4].getText().equals("O") && button[7].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[2].getText().equals("X") && button[5].getText().equals("X") && button[8].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[2].getText().equals("O") && button[5].getText().equals("O") && button[8].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[3].getText().equals("X") && button[6].getText().equals("X") && button[9].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[3].getText().equals("O") && button[6].getText().equals("O") && button[9].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[1].getText().equals("X") && button[5].getText().equals("X") && button[9].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[1].getText().equals("O") && button[5].getText().equals("O") && button[9].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[3].getText().equals("X") && button[5].getText().equals("X") && button[7].getText().equals("X")) {
            Turn.setText("X Wins!");
        } else if (button[3].getText().equals("O") && button[5].getText().equals("O") && button[7].getText().equals("O")) {
            Turn.setText("O Wins!");
        } else if (button[1].getText() != " " && button[2].getText() != " " && button[3].getText() != " " && button[4].getText() != " " && button[5].getText() != " " && button[6].getText() != " " && button[7].getText() != " " && button[8].getText() != " " && button[9].getText() != " ") {
            Turn.setText("DRAW!");
        }

        if (Turn.getText() == "X Wins!" || Turn.getText() == "O Wins!" || Turn.getText() == "DRAW!") {
            for(int i= 1; i < 10; i++){
                button[i].setDisable(true);
            }

        }
    }


    public void set(final char turn, Button button) {
        if(button.getText() == "X" || button.getText() == "O"){
            return;
        }
            if (turn == 'X') {
                button.setText("X");
            } else if(turn == 'O'){
                button.setText("O");
            }


    }
}
