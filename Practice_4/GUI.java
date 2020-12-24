package task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

    static class task extends JFrame {

        private int milanCounter = 0;
        private int madridCounter = 0;
        JButton buttonACMilan = new JButton("AC Milan");
        JButton buttonRealMadrid = new JButton("Real Madrid");
        JLabel matchResult = new JLabel("Result: " + milanCounter + "X" + madridCounter);
        JLabel scorerLabel = new JLabel("Last Scorer: N/A");
        Label winnerLabel = new Label("Winner: DRAW");

        task() {
            super("task");
            setLayout(null);
            buttonACMilan.setBounds(100, 100, 150, 20);
            buttonRealMadrid.setBounds(250, 100, 150, 20);
            matchResult.setBounds(225, 200, 100, 20);
            scorerLabel.setBounds(200, 225, 150, 20);
            winnerLabel.setBounds(200, 250, 150, 20);
            add(buttonACMilan);
            buttonACMilan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    milanCounter += 1;
                    scorerLabel.setText("Last scorer: AC Milan");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("WINNER: DRAW");
                    else winnerLabel.setText(madridCounter > milanCounter ? "WINNER: Real Madrid" : "WINNER: AC Milan");
                }
            });
            add(buttonRealMadrid);
            buttonRealMadrid.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    madridCounter += 1;
                    scorerLabel.setText("Last scorer: Real Madrid");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("WINNER: DRAW");
                    else winnerLabel.setText(madridCounter > milanCounter ? "WINNER: Real Madrid" : "WINNER: AC Milan");
                }
            });
            add(matchResult);
            add(scorerLabel);
            add(winnerLabel);
            setSize(500, 500);
            setVisible(true);
        }
    }
    public static void main(String[] args) {

        new task();
    }
}