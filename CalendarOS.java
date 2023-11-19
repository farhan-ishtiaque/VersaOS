package com.mycompany.project;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class CalendarOS extends JFrame {

    DefaultTableModel model;
    Calendar cal = new GregorianCalendar();
    JLabel label;

    CalendarOS() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Calendar");
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // Initialize the label and set its properties
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center-align the text in the label
        Color color = new Color(255, 240, 245);

        // Create buttons for navigating months
        JButton b1 = new JButton("<<");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cal.add(Calendar.MONTH, -1);
                updateMonth();
            }
        });

        JButton b2 = new JButton(">>");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cal.add(Calendar.MONTH, +1);
                updateMonth();
            }
        });

        // Create a panel to hold buttons and label
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(b1, BorderLayout.WEST);
        panel.add(label, BorderLayout.CENTER);
        panel.add(b2, BorderLayout.EAST);

        // Define column names for the table
        String[] columns = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        model = new DefaultTableModel(null, columns);
        JTable table = new JTable(model);

        // Create a cell renderer to center-align the text in the cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        // Set the cell renderer for all columns
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JScrollPane pane = new JScrollPane(table);
        table.setRowHeight(60);

        table.setBackground(color);

        Font tableFont = new Font("Helvetica", Font.PLAIN, 18);
        table.setFont(tableFont);
        label.setFont(new Font("Helvetica", Font.BOLD, 20));
        table.setForeground(Color.BLACK);

        // Add components to the JFrame
        this.add(panel, BorderLayout.NORTH);
        this.add(pane, BorderLayout.CENTER);

        // Update the calendar display
        this.updateMonth();
                setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Calender.png")).getImage());

    }

    // Method to update the calendar display
    void updateMonth() {
        cal.set(Calendar.DAY_OF_MONTH, 1);

        String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
        int year = cal.get(Calendar.YEAR);
        label.setText(month + " " + year);

        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        model.setRowCount(0);
        model.setRowCount(weeks);

        int i = startDay - 1;
        for (int day = 1; day <= numberOfDays; day++) {
            model.setValueAt(day, i / 7, i % 7);
            i = i + 1;
        }
    }
}
