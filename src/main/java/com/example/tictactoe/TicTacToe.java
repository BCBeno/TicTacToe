package com.example.tictactoe;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;

public class TicTacToe extends Application {

    private void FreshStart()
    {
        for(int i=1;i<10;i++)
        {
            button[i].setText(" ");
            button[i].setDisable(false);
        }
    }

    static char turn;

    static Button[] button;

    @Override
    public void start(Stage stage) throws IOException {
        button = new Button[10];

        stage.getIcons().add(new Image("file:src/main/resources/com/example/tictactoe/icon.png"));
        stage.setTitle("Tic Tac Toe");
        stage.setResizable(false);
        GridPane TurnGrid = new GridPane();
        TurnGrid.setPrefSize(400, 400);
        this.turn = 'X';
        Label Turn = new Label("Turn: "+ turn);
        Turn.setFont(Font.font("Arial", 25));
        TurnGrid.add(Turn, 1, 0);
        TurnGrid.setAlignment(Pos.CENTER);


        for(int i=1;i<10;i++)
        {
            button[i] = new Button(" ");
            button[i].setFont(Font.font("Arial", 40));
            button[i].setPrefSize(100, 100);
        }


        TurnGrid.add(button[1], 0, 1);
        TurnGrid.add(button[2], 0, 2);
        TurnGrid.add(button[3], 0, 3);
        TurnGrid.add(button[4], 1, 1);
        TurnGrid.add(button[5], 1, 2);
        TurnGrid.add(button[6], 1, 3);
        TurnGrid.add(button[7], 2, 1);
        TurnGrid.add(button[8], 2, 2);
        TurnGrid.add(button[9], 2, 3);
        TurnGrid.setHgap(10);
        TurnGrid.setVgap(10);

        Scene TurnScene = new Scene(TurnGrid);


        logic logic = new logic();
        button[1].setOnAction(e ->{
            if(button[1].getText().equals(" "))
            {
                logic.set(turn, button[1]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
            logic.check(button, Turn);
            }
        });button[2].setOnAction(e ->{
            if(button[2].getText().equals(" "))
            {
                logic.set(turn, button[2]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[3].setOnAction(e ->{
            if(button[3].getText().equals(" "))
            {
                logic.set(turn, button[3]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[4].setOnAction(e ->{
            if(button[4].getText().equals(" "))
            {
                logic.set(turn, button[4]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[5].setOnAction(e ->{
            if(button[5].getText().equals(" "))
            {
                logic.set(turn, button[5]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[6].setOnAction(e ->{
            if(button[6].getText().equals(" "))
            {
                logic.set(turn, button[6]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[7].setOnAction(e ->{
            if(button[7].getText().equals(" ")){
                logic.set(turn, button[7]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[8].setOnAction(e ->{
            if(button[8].getText().equals(" "))
            {
                logic.set(turn, button[8]);
            if(this.turn == 'X') {
                this.turn = 'O';
                Turn.setText("Turn: " + turn);
            } else if(this.turn == 'O'){
                this.turn = 'X';
                Turn.setText("Turn: " + turn);
            }
                logic.check(button, Turn);            }
        });button[9].setOnAction(e ->{
            if(button[9].getText().equals(" "))
            {
                logic.set(turn, button[9]);
                if(this.turn == 'X') {
                    this.turn = 'O';
                    Turn.setText("Turn: " + turn);
                } else if(this.turn == 'O') {
                    turn = 'X';
                    Turn.setText("Turn: " + turn);
                }}
            logic.check(button, Turn);
                }
        );

        Button reset = new Button("Restart");
        reset.setOnAction(e ->{
            FreshStart();
            Turn.setText("Turn: X");
            this.turn = 'X';
        });
        reset.setAlignment(Pos.CENTER);
        reset.setPrefSize(100, 50);
        TurnGrid.add(reset, 1, 4);



        stage.setScene(TurnScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}