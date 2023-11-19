package com.mycompany.project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JButton stopButton = new JButton("STOP");
    JButton resetButton = new JButton("RESET");

    JLabel time = new JLabel();

    int elapsedTime = 0, elapsedSeconds = 0, elapsedMinutes = 0, elapsedHours = 0;
    boolean timeStatus = false;

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            elapsedHours = (elapsedTime / 3600000);
            elapsedMinutes = (elapsedTime / 60000) % 60;
            elapsedSeconds = (elapsedTime / 1000) % 60;

            String secondString = String.format("%02d", elapsedSeconds);
            String minuteString = String.format("%02d", elapsedMinutes);
            String hourString = String.format("%02d", elapsedHours);

            time.setText(hourString + " : " + minuteString + " : " + secondString);
        }
    });

    public Stopwatch() {
        time.setText("00 : 00 : 00");
        time.setBounds(100, 100, 200, 100);
        time.setFont(new Font("Arial", Font.PLAIN, 35));
        time.setBorder(BorderFactory.createBevelBorder(1));
        time.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(100, 200, 100, 50);
        startButton.setFont(new Font("Arial", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(200, 200, 100, 50);
        resetButton.setFont(new Font("Arial", Font.PLAIN, 20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        
        frame.setTitle("STOPWATCH");
        frame.add(startButton);
        frame.add(resetButton);
        frame.add(time);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedHours = 0;
        elapsedMinutes = 0;
        elapsedSeconds = 0;
        elapsedTime = 0;
        time.setText("00 : 00 : 00");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (timeStatus == false) {
                timeStatus = true;
                startButton.setText("STOP");
                start();
            } else {
                timeStatus = false;
                startButton.setText("START");
                stop();
            }
        }

        if (e.getSource() == resetButton) {
            timeStatus = false;
            startButton.setText("START");
            reset();
        }
    }
}
