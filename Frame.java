package com.mycompany.project;

import java.util.Calendar;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;

    JPanel contentPanel;
    String time;
    String day;
    String date;

    Frame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("CLOCK");
        setLayout(new FlowLayout());
        setSize(380, 250);
        setLocationRelativeTo(null);
        setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss ");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 70));
        timeLabel.setForeground(Color.RED);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Arial", Font.BOLD, 35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.BOLD, 35));

        add(timeLabel);
        add(dayLabel);
        add(dateLabel);

        setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTime();
            }
        });

        timer.start();
    }

    public void setTime() {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
    }

    public static void main(String[] args) {

        new Frame();
    }

}
