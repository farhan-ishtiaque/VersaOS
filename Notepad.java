package com.mycompany.project;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;

// A simple text editor application
class CustomEditor extends JFrame implements ActionListener {
    JTextArea textArea; // Text component for editing
    JFrame frame; // Main frame

    // Constructor for the text editor
    CustomEditor() {
        frame = new JFrame("NOTEPAD"); // Create the main frame

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        } catch (Exception e) {}

        textArea = new JTextArea(); // Create the text area
        JMenuBar menuBar = createMenuBar(); // Create the menu bar with menus and items

        frame.setJMenuBar(menuBar); // Set the menu bar for the frame
        frame.add(textArea); // Add the text area to the frame
        frame.setSize(500, 500); // Set the size of the frame
        frame.show(); // Display the frame
    }

    // Method to create the menu bar with menus and items
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar(); // Create the menu bar

        // Create File menu and items
        JMenu fileMenu = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        JMenuItem printFile = new JMenuItem("Print");

        // Add action listeners for file menu items
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        printFile.addActionListener(this);

        // Add file menu items to the file menu
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(printFile);

        // Create Edit menu and items
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        // Add action listeners for edit menu items
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        // Add edit menu items to the edit menu
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        // Create Close item for the menu bar
        JMenuItem close = new JMenuItem("Close");
        close.addActionListener(this);

        // Add menus and items to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(close);

        return menuBar; // Return the menu bar
    }

    // Method to handle actions performed on menu items
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand(); // Get the action command

        // Perform actions based on the action command
        if (action.equals("Cut")) {
            textArea.cut();
        } else if (action.equals("Copy")) {
            textArea.copy();
        } else if (action.equals("Paste")) {
            textArea.paste();
        } else if (action.equals("Save")) {
            saveFile();
        } else if (action.equals("Print")) {
            printFile();
        } else if (action.equals("Open")) {
            openFile();
        } else if (action.equals("New")) {
            textArea.setText("");
        } else if (action.equals("Close")) {
            frame.setVisible(false);
        }
    }

    // Method to save the content of the text area to a file
    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser("f:"); // Create a file chooser
        int result = fileChooser.showSaveDialog(null); // Show the save dialog

        // If the user selects a file
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile(); // Get the selected file

            try (FileWriter writer = new FileWriter(selectedFile, false);
                 BufferedWriter bufferWriter = new BufferedWriter(writer)) {

                bufferWriter.write(textArea.getText()); // Write the text to the file
                bufferWriter.flush(); // Flush the buffer

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage()); // Display an error message
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Operation canceled by the user"); // User canceled the operation
        }
    }

    // Method to print the content of the text area
    private void printFile() {
        try {
            textArea.print(); // Print the text area content
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage()); // Display an error message
        }
    }

    // Method to open a file and load its content into the text area
    private void openFile() {
        JFileChooser fileChooser = new JFileChooser("f:"); // Create a file chooser
        int result = fileChooser.showOpenDialog(null); // Show the open dialog

        // If the user selects a file
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile(); // Get the selected file

            try (FileReader reader = new FileReader(selectedFile);
                 BufferedReader bufferedReader = new BufferedReader(reader)) {

                String line, content = "";

                // Read the content from the file
                while ((line = bufferedReader.readLine()) != null) {
                    content += line + "\n";
                }

                textArea.setText(content); // Set the text area content

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage()); // Display an error message
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Operation canceled by the user"); // User canceled the operation
        }
    }

    // Main method to create an instance of the text editor
    public static void main(String args[]) {
        CustomEditor customEditor = new CustomEditor();
    }
}
