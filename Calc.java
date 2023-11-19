package com.mycompany.project;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.Image;

public class Calc extends javax.swing.JFrame {
    int age;
    private Account account;
    public Calc(Account account) {
        initComponents();
        jPanel6.setVisible(false);
        jPanel5.setVisible(false);
        jPanel4.setVisible(false);
        disable();
        age=Integer.parseInt(account.getAge());
        if((age>0)&&(age<=15))
                {
                    jPanel4.setVisible(false);
                }
        else
          jPanel4.setVisible(true);
          setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Calculator 1.png")).getImage());
    }

    public void enable() {
        jColorChooser1.setEnabled(true);
        jPanel3.setEnabled(true);
        jComboBox1.setEnabled(true);
        jTextField2.setEnabled(true);
        jComboBox2.setEnabled(true);
        jTextField3.setEnabled(true);
        jLabel4.setEnabled(true);
        jButton37.setEnabled(true);
        jComboBox3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField5.setEnabled(true);
        jComboBox4.setEnabled(true);
        jLabel3.setEnabled(true);
        jButton39.setEnabled(true);
        jPanel2.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton1.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton2.setEnabled(true);
        jButton16.setEnabled(true);
        jButton23.setEnabled(true);
        jButton22.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jPanel1.setEnabled(true);
        jButton29.setEnabled(true);
        jButton25.setEnabled(true);
        jButton24.setEnabled(true);
        jPanel4.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton26.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton35.setEnabled(true);
        jButton34.setEnabled(true);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        jSeparator2.setEnabled(true);
    }

    public void disable() {
        jColorChooser1.setEnabled(false);
        jPanel3.setEnabled(false);
        jPanel2.setEnabled(false);
        jTextField1.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton1.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton2.setEnabled(false);
        jButton16.setEnabled(false);
        jButton23.setEnabled(false);
        jButton22.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jPanel1.setEnabled(false);
        jButton29.setEnabled(false);
        jButton25.setEnabled(false);
        jButton24.setEnabled(false);
        jPanel4.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jButton26.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton32.setEnabled(false);
        jButton33.setEnabled(false);
        jButton30.setEnabled(false);
        jButton31.setEnabled(false);
        jButton35.setEnabled(false);
        jButton34.setEnabled(false);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jSeparator2.setEnabled(false);
        jTextField1.setText("");
        operations.clear();
        operators.clear();
    }
    static final double EPSILON = 1E-14;
    double d1, d2;
    double x, y;
    double result;
    boolean isOperatorClicked;
    String operator = "";
    ArrayList<Double> operations = new ArrayList<>();
    ArrayList<String> operators = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(102, 255, 0));
        setIconImages(null);
        setSize(new java.awt.Dimension(0, 0));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(255, 234, 234));

        jPanel3.setBackground(new java.awt.Color(255, 234, 234));
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 490));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Select:");

        jCheckBox3.setBackground(new java.awt.Color(255, 234, 234));
        jCheckBox3.setText("Temperature Convertor");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 234, 234));
        jCheckBox4.setText("Length Convertor");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 234, 234));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(372, 250));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[....Select....]", "Celsius", "Fahrenheit", "Kelvin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[....Select....]", "Celsius", "Fahrenheit", "Kelvin" }));

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Temperature Convertor");

        jButton37.setBackground(new java.awt.Color(255, 204, 204));
        jButton37.setText("Convert");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton37)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton37)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 234, 234));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox3.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[....Select....]", "Kilometer", "Meter", "Centimeter", "Millimeter", "Micrometer", "Nanometer", "Mile", "Yard", "Foot", "Inch", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(255, 204, 204));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jComboBox4.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[....Select....]", "Kilometer", "Meter", "Centimeter", "Millimeter", "Micrometer", "Nanometer", "Mile", "Yard", "Foot", "Inch" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Length Convertor");

        jButton39.setBackground(new java.awt.Color(255, 204, 204));
        jButton39.setText("Convert");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton39)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(jTextField5)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton39)
                .addContainerGap())
        );

        jButton38.setBackground(new java.awt.Color(255, 204, 204));
        jButton38.setText("Exit");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(255, 204, 204));
        jButton36.setText("CLR");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unit Convertor", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 234, 234));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(380, 650));
        jPanel2.setPreferredSize(new java.awt.Dimension(55, 47));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText("1");
        jButton3.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton3.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton4.setText("2");
        jButton4.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton4.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton4.setOpaque(true);
        jButton4.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton5.setText("3");
        jButton5.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton5.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton5.setOpaque(true);
        jButton5.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton6.setText("4");
        jButton6.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton6.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton6.setOpaque(true);
        jButton6.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton7.setText("5");
        jButton7.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton7.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton7.setOpaque(true);
        jButton7.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 204, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton8.setText("6");
        jButton8.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton8.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton8.setOpaque(true);
        jButton8.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton9.setText("7");
        jButton9.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton9.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton9.setOpaque(true);
        jButton9.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton10.setText("8");
        jButton10.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton10.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton10.setOpaque(true);
        jButton10.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton11.setText("9");
        jButton11.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton11.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton11.setOpaque(true);
        jButton11.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton12.setText("0");
        jButton12.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton12.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton12.setOpaque(true);
        jButton12.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("+");
        jButton1.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton1.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton1.setOpaque(true);
        jButton1.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 204, 204));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton13.setText("-");
        jButton13.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton13.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton13.setOpaque(true);
        jButton13.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 204, 204));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton14.setText("x");
        jButton14.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton14.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton14.setOpaque(true);
        jButton14.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 204, 204));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton15.setText("/");
        jButton15.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton15.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton15.setOpaque(true);
        jButton15.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("=");
        jButton2.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton2.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton2.setOpaque(true);
        jButton2.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 204, 204));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton16.setText("DEL");
        jButton16.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton16.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton16.setOpaque(true);
        jButton16.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 204, 204));
        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton23.setText("x²");
        jButton23.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton23.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton23.setOpaque(true);
        jButton23.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 204, 204));
        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton22.setText("√ ");
        jButton22.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton22.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton22.setOpaque(true);
        jButton22.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 204, 204));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton17.setText("CLR");
        jButton17.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton17.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton17.setOpaque(true);
        jButton17.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 204, 204));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton18.setText(".");
        jButton18.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton18.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton18.setOpaque(true);
        jButton18.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel1.setAlignmentX(0.4F);
        jPanel1.setAlignmentY(0.4F);
        jPanel1.setMaximumSize(new java.awt.Dimension(37, 37));
        jPanel1.setMinimumSize(new java.awt.Dimension(37, 37));
        jPanel1.setPreferredSize(new java.awt.Dimension(37, 37));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jButton29.setBackground(new java.awt.Color(255, 204, 204));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton29.setText("π");
        jButton29.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton29.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton29.setOpaque(true);
        jButton29.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 204, 204));
        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton25.setText("x ^y");
        jButton25.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton25.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton25.setOpaque(true);
        jButton25.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 204, 204));
        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton24.setText("%");
        jButton24.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton24.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton24.setOpaque(true);
        jButton24.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 234, 234));

        jButton27.setBackground(new java.awt.Color(255, 204, 204));
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton27.setText("BIN");
        jButton27.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton27.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton27.setOpaque(true);
        jButton27.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 204, 204));
        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton28.setText("OCT");
        jButton28.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton28.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton28.setOpaque(true);
        jButton28.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 204, 204));
        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton26.setText("HEX");
        jButton26.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton26.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton26.setOpaque(true);
        jButton26.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 204, 204));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton19.setText("sin");
        jButton19.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton19.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton19.setOpaque(true);
        jButton19.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 204, 204));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton20.setText("cos");
        jButton20.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton20.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton20.setOpaque(true);
        jButton20.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton21.setText("tan");
        jButton21.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton21.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton21.setOpaque(true);
        jButton21.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(255, 204, 204));
        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton32.setText("!");
        jButton32.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton32.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton32.setOpaque(true);
        jButton32.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(255, 204, 204));
        jButton33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton33.setText("mod");
        jButton33.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton33.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton33.setOpaque(true);
        jButton33.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(255, 204, 204));
        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton30.setText("floor");
        jButton30.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton30.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton30.setOpaque(true);
        jButton30.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 204, 204));
        jButton31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton31.setText("ceil");
        jButton31.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton31.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton31.setOpaque(true);
        jButton31.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton30.getAccessibleContext().setAccessibleDescription("");
        jButton31.getAccessibleContext().setAccessibleDescription("");

        jButton35.setBackground(new java.awt.Color(255, 204, 204));
        jButton35.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton35.setText("log");
        jButton35.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton35.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton35.setOpaque(true);
        jButton35.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(255, 204, 204));
        jButton34.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton34.setText("ln");
        jButton34.setMaximumSize(new java.awt.Dimension(55, 47));
        jButton34.setMinimumSize(new java.awt.Dimension(55, 47));
        jButton34.setOpaque(true);
        jButton34.setPreferredSize(new java.awt.Dimension(55, 47));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 234, 234));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 234, 234));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.getAccessibleContext().setAccessibleDescription("");
        jButton4.getAccessibleContext().setAccessibleDescription("");
        jButton5.getAccessibleContext().setAccessibleDescription("");
        jButton6.getAccessibleContext().setAccessibleDescription("");
        jButton7.getAccessibleContext().setAccessibleDescription("");
        jButton8.getAccessibleContext().setAccessibleDescription("");
        jButton9.getAccessibleContext().setAccessibleDescription("");
        jButton10.getAccessibleContext().setAccessibleDescription("");
        jButton11.getAccessibleContext().setAccessibleDescription("");
        jButton12.getAccessibleContext().setAccessibleDescription("");
        jButton1.getAccessibleContext().setAccessibleDescription("");
        jButton13.getAccessibleContext().setAccessibleDescription("");
        jButton14.getAccessibleContext().setAccessibleDescription("");
        jButton15.getAccessibleContext().setAccessibleDescription("");
        jButton2.getAccessibleContext().setAccessibleDescription("");
        jButton16.getAccessibleContext().setAccessibleDescription("");
        jButton23.getAccessibleContext().setAccessibleDescription("");
        jButton22.getAccessibleContext().setAccessibleDescription("");
        jButton17.getAccessibleContext().setAccessibleDescription("");
        jButton18.getAccessibleContext().setAccessibleDescription("");
        jButton29.getAccessibleContext().setAccessibleDescription("");
        jButton25.getAccessibleContext().setAccessibleDescription("");
        jButton24.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Calculator", jPanel2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 153));

        jMenu2.setBackground(new java.awt.Color(204, 255, 204));
        jMenu2.setText("Edit");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("New");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Calc(account).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        double degree = Double.parseDouble(jTextField1.getText());
        if ((int) degree == 90) {
            jTextField1.setText("INFINITY");
        } else {
            double radian = Math.toRadians(degree);
            jTextField1.setText(String.valueOf(Math.tan(radian)));
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            String text = jTextField1.getText();
            boolean containsOnlyDigits = text.matches("[\\d.]+");
            if (containsOnlyDigits == true) {
                double degree = Double.parseDouble(text);
                double radian = Math.toRadians(degree);
                jTextField1.setText(String.valueOf(Math.cos(radian)));
            } else {
                jTextField1.setText("MATH ERROR");
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            String text = jTextField1.getText();
            boolean containsOnlyDigits = text.matches("[\\d.]+");
            if (containsOnlyDigits == true) {
                double degree = Double.parseDouble(text);
                double radian = Math.toRadians(degree);
                jTextField1.setText(String.valueOf(Math.sin(radian)));
            } else {
                jTextField1.setText("MATH ERROR");
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        double hex = Double.parseDouble(jTextField1.getText());
        int hexInt = (int) hex;
        if (Math.abs(hex - hexInt) < EPSILON) {
            String hexString = Integer.toHexString(hexInt).toUpperCase();
            int count = 0;
            for (int i = 0; i < hexString.length(); i++) {
                if ((hexString.charAt(i) == ('0')) || (hexString.charAt(i) == ('1')) || (hexString.charAt(i) == ('2')) || (hexString.charAt(i) == ('3')) || (hexString.charAt(i) == ('4')) || (hexString.charAt(i) == ('5')) || (hexString.charAt(i) == ('6')) || (hexString.charAt(i) == ('7')) || (hexString.charAt(i) == ('8')) || (hexString.charAt(i) == ('9')) || (hexString.charAt(i) == ('A')) || (hexString.charAt(i) == ('B')) || (hexString.charAt(i) == ('C')) || (hexString.charAt(i) == ('D')) || (hexString.charAt(i) == ('E')) || (hexString.charAt(i) == ('F'))) {
                    count++;
                }
            }
            if (count == hexString.length()) {
                jTextField1.setText(hexString);
            } else {
                jTextField1.setText("MATH ERROR");
            }
        } else {
            jTextField1.setText("MATH ERROR");
        }

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        double oct = Double.parseDouble(jTextField1.getText());
        int octInt = (int) oct;
        if (Math.abs(oct - octInt) < EPSILON) {
            String octString = Integer.toOctalString(octInt);
            int count = 0;
            for (int i = 0; i < octString.length(); i++) {
                if ((octString.charAt(i) == ('0')) || (octString.charAt(i) == ('1')) || (octString.charAt(i) == ('2')) || (octString.charAt(i) == ('3')) || (octString.charAt(i) == ('4')) || (octString.charAt(i) == ('5')) || (octString.charAt(i) == ('6')) || (octString.charAt(i) == ('7'))) {
                    count++;
                }
            }
            if (count == octString.length()) {
                jTextField1.setText(octString);
            } else {
                jTextField1.setText("MATH ERROR");
            }
        } else {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        double bin = Double.parseDouble(jTextField1.getText());
        int binInt = (int) bin;
        if (Math.abs(bin - binInt) < EPSILON) {
            String binString = Integer.toBinaryString(binInt);
            int count = 0;
            for (int i = 0; i < binString.length(); i++) {
                if ((binString.charAt(i) == ('0')) || (binString.charAt(i) == ('1'))) {
                    count++;
                }
            }
            if (count == binString.length()) {
                jTextField1.setText(binString);
            } else {
                jTextField1.setText("MATH ERROR");
            }
        } else {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            double num = Double.parseDouble(jTextField1.getText());
            num = num / 100;
            jTextField1.setText(String.valueOf(num));
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try {
            x = Double.parseDouble(jTextField1.getText());
            operations.add(x);
            jTextField1.setText("");
            operator = "^";
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        jTextField1.setText(String.valueOf(Math.PI));

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (!(jTextField1.getText().contains("."))) {
            jTextField1.setText(jTextField1.getText() + ".");
        } else {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        jTextField1.setText("");
        operator = "";
        operations.clear();
        operators.clear();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        try {
            double val = getOperand(jTextField1.getText());
            if (val >= 0) {
                double p = Math.pow(val, 0.5);
                jTextField1.setText(String.valueOf(p));
            } else {
                jTextField1.setText("INVALID INPUT");
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            double r = Double.parseDouble(jTextField1.getText()) * Double.parseDouble(jTextField1.getText()); // TODO add your handling code here:
            jTextField1.setText(String.valueOf(r));
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try {
            String del = null;    // TODO add your handling code here:
            if (jTextField1.getText().length() > 0) {
                StringBuilder s = new StringBuilder(jTextField1.getText());
                s.deleteCharAt(jTextField1.getText().length() - 1);
                del = s.toString();
                jTextField1.setText(del);
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if ((operators.isEmpty()) && (operations.isEmpty())) {
                jTextField1.setText(jTextField1.getText());
            } else {
                d2 = Double.parseDouble(jTextField1.getText());
                if (operator.equals("^")) {
                    double q = Math.pow(x, d2);
                    jTextField1.setText(String.valueOf(q));
                    return;
                } else {
                    result = operations.get(0);
                    operations.add(d2);
                    for (int i = 1; i < operations.size(); i++) {
                        if (operators.get(i - 1).equals("+")) {
                            result = result + operations.get(i);
                        } else if (operators.get(i - 1).equals("-")) {
                            result = result - operations.get(i);
                        } else if (operators.get(i - 1).equals("*")) {
                            result = result * operations.get(i);
                        } else if (operators.get(i - 1).equals("/")) {
                            if (Math.abs(operations.get(i) - 0) > EPSILON) {
                                result = result / operations.get(i);
                            } else {
                                jTextField1.setText("MATH ERROR");
                                return;
                            }
                        }
                    }
                    isOperatorClicked = false;
                    jTextField1.setText(String.valueOf(result));
                }
            }
            operations.clear();
            operators.clear();
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            d1 = Double.parseDouble(jTextField1.getText());
            operations.add(d1);
            operators.add("/");
            jTextField1.setText("");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            d1 = Double.parseDouble(jTextField1.getText());
            operations.add(d1);
            operators.add("*");
            jTextField1.setText("");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try {
            if (jTextField1.getText().isEmpty()) {
                jTextField1.setText("-");
            } else {
                d1 = getOperand(jTextField1.getText());
                operations.add(d1);
                operators.add("-");
                jTextField1.setText("");
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton13ActionPerformed
    private double getOperand(String s) {
        try {
            if (s.isEmpty()) {
                return 0.0;
            } else if ((s.startsWith("-")) && s.length() > 1) {
                return -Double.parseDouble(s.substring(1));
            } else {
                return Double.parseDouble(s);
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
        return 0;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            d1 = Double.parseDouble(jTextField1.getText());
            operations.add(d1);
            operators.add("+");
            jTextField1.setText("");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "0");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "9");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "8");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "7");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "6");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "5");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "4");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "3");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "2");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            jTextField1.setText(jTextField1.getText() + "1");
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

        int fact = 1;
        double val = Double.parseDouble(jTextField1.getText());
        int n = (int) val;
        if ((val == n) || (n >= 0)) {
            if (n < 0) {
                jTextField1.setText("MATH ERROR");
            } else if (n == 0 || (n == 1)) {
                jTextField1.setText(String.valueOf("1"));
            } else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }// TODO add your handling code here:
                jTextField1.setText(String.valueOf(fact));
            }
        } else {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        try {
            if (Double.parseDouble(jTextField1.getText()) >= 0) {
                jTextField1.setText(String.valueOf(Math.log(Double.parseDouble(jTextField1.getText()))));
            } else {
                result = 0;
                jTextField1.setText("MATH ERROR");
            }        // TODO add your handling code here:
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        try {
            if (Double.parseDouble(jTextField1.getText()) >= 0) {
                jTextField1.setText(String.valueOf(Math.log10(Double.parseDouble(jTextField1.getText()))));
            } else {
                result = 0;
                jTextField1.setText("MATH ERROR");
            }
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        try {
            jTextField1.setText(String.valueOf(Math.floor(Double.parseDouble(jTextField1.getText()))));
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        try {
            jTextField1.setText(String.valueOf(Math.ceil(Double.parseDouble(jTextField1.getText()))));
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        try {
            jTextField1.setText(String.valueOf(Math.abs(Double.parseDouble(jTextField1.getText()))));
        } catch (Exception ex) {
            jTextField1.setText("MATH ERROR");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
       try
       {
        if ((jComboBox1.getSelectedIndex() == 0) || (jComboBox2.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(Calc.this, "Select any option");
            return;
        } else {
            String inputval1 = (jComboBox1.getSelectedItem()).toString();
            String inputval2 = (jComboBox2.getSelectedItem()).toString();
            if ((jTextField2.getText().equals(""))&&((jTextField3.getText().equals("")))) {
                JOptionPane.showMessageDialog(Calc.this, "Enter  input value");
                return;
            }
            else if ((jTextField2.getText().equals(""))&&((!jTextField3.getText().equals("")))) {
               JOptionPane.showMessageDialog(Calc.this, "Enter  value in input box");
                return;
            } 
            else if ((inputval1.equals("Celsius")) && (inputval2.equals("Fahrenheit"))) {
                
                    double cel = Double.parseDouble(jTextField2.getText());
                    double fahrenheit = (double) ((cel * 9) / 5) + 32;
                    jTextField3.setText(String.valueOf(fahrenheit));

                
            } else if ((inputval1.equals("Celsius")) && (inputval2.equals("Kelvin"))) {
             
                    double cel = Double.parseDouble(jTextField2.getText());
                    double kelvin = (double) cel + 273;
                    jTextField3.setText(String.valueOf(kelvin));
               
                
            } else if ((inputval1.equals("Fahrenheit")) && (inputval2.equals("Celsius"))) {
               
                    double fahrenheit = Double.parseDouble(jTextField2.getText());
                    double cel = (double) ((fahrenheit - 32) * 5) / 9;
                    jTextField3.setText(String.valueOf(cel));
                
                
            } else if ((inputval1.equals("Fahrenheit")) && (inputval2.equals("Kelvin"))) {
                
                    double fahrenheit = Double.parseDouble(jTextField2.getText());
                    double kelvin = (double) (((fahrenheit - 32) * 5) / 9) + 273;
                    jTextField3.setText(String.valueOf(kelvin));
                
                
            } else if ((inputval1.equals("Kelvin")) && (inputval2.equals("Celsius"))) {
              
                    double kelvin = Double.parseDouble(jTextField2.getText());
                    double cel = (double) kelvin - 273;
                    jTextField3.setText(String.valueOf(cel));
            } else if ((inputval1.equals("Kelvin")) && (inputval2.equals("Fahrenheit"))) {
               
                    double kelvin = Double.parseDouble(jTextField2.getText());
                    double fahrenheit = (double) (((kelvin - 273) * 9) / 5) + 32;
                    jTextField3.setText(String.valueOf(fahrenheit));
            }
            else {
                jTextField3.setText(jTextField2.getText());
            }
        }
        }
       catch(Exception ex)
       {
       jTextField3.setText("INVALID INPUT");    
       }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        jPanel6.setVisible(false);
        jPanel5.setVisible(true);

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

        jPanel5.setVisible(false);
        jPanel6.setVisible(true);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
        if ((jComboBox3.getSelectedIndex() == 0) || (jComboBox4.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(Calc.this, "Select any option");
        } else {
            String input1 = (jComboBox3.getSelectedItem()).toString();
            String input2 = (jComboBox4.getSelectedItem()).toString();
           if ((jTextField4.getText().equals(""))&&((jTextField5.getText().equals("")))) {
                JOptionPane.showMessageDialog(Calc.this, "Enter  input value");
                return;
            }
            if ((jTextField4.getText().equals(""))&&((!jTextField5.getText().equals("")))) {
               JOptionPane.showMessageDialog(Calc.this, "Enter  value in input box");
                return;
            } 
            if(Double.parseDouble(jTextField4.getText())>=0.0)
                    {
             if ((input1.equals("Kilometer")) && (input2.equals("Meter"))) {
                    double km = Double.parseDouble(jTextField4.getText());
                    double m = km * 1000.0;
                    jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Kilometer")) && (input2.equals("Centimeter"))) {
                    double km = Double.parseDouble(jTextField4.getText());
                    double cm = km * 100000.0;
                    jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Kilometer")) && (input2.equals("Millimeter"))) {
                    double km = Double.parseDouble(jTextField4.getText());
                    double mm = km * 1000000.0;
                    jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Kilometer")) && (input2.equals("Micrometer"))) {
                     double km = Double.parseDouble(jTextField4.getText());
                    double micm = km * 1000000000.0;
                    jTextField5.setText(String.valueOf(micm));
            } else if ((input1.equals("Kilometer")) && (input2.equals("Nanometer"))) {
                if((!jTextField4.getText().equals("")) && (jTextField5.getText().equals(""))) {
                    double km = Double.parseDouble(jTextField4.getText());
                    double nanom = 1000000000000.0 * km;
                    jTextField5.setText(String.valueOf(nanom));
                } else if ((!jTextField4.getText().equals("")) && (jTextField5.getText().equals(""))) {
                     if((!jTextField4.getText().equals("")) && (jTextField5.getText().equals(""))) {
                    double km = Double.parseDouble(jTextField4.getText());
                    double nanom = 1000000000000.0 * km;
                    jTextField4.setText(String.valueOf(nanom));
                     }
            } else if ((input1.equals("Kilometer")) && (input2.equals("Yard"))) {
                if((!jTextField4.getText().equals("")) && (jTextField5.getText().equals(""))) {
                double km = Double.parseDouble(jTextField4.getText());
                double yard = 1094.0 * km;
                jTextField5.setText(String.valueOf(yard));
                }
             else if ((!jTextField4.getText().equals("")) && (jTextField5.getText().equals(""))) {
              double km = Double.parseDouble(jTextField4.getText());
                double yard = 1094.0 * km;
                jTextField4.setText(String.valueOf(yard));   
             }   
            } else if ((input1.equals("Kilometer")) && (input2.equals("Foot"))) {
               
                double km = Double.parseDouble(jTextField4.getText());
                double foot = 3280.84 * km;
                jTextField5.setText(String.valueOf(foot));
              
              }   
            } else if ((input1.equals("Kilometer")) && (input2.equals("Mile"))) {
               
                double km = Double.parseDouble(jTextField4.getText());
                double mile = 0.621371 * km;
                jTextField5.setText(String.valueOf(mile));
               
            } else if ((input1.equals("Kilometer")) && (input2.equals("Inch"))) {
               
                double km = Double.parseDouble(jTextField4.getText());
                double inch = 39370.1 * km;
                jTextField5.setText(String.valueOf(inch));
              
            } else if ((input1.equals("Meter")) && (input2.equals("Kilometer"))) {
               
                double m = Double.parseDouble(jTextField4.getText());
                double km = m / 1000.0;
                jTextField5.setText(String.valueOf(km));
               
            } else if ((input1.equals("Meter")) && (input2.equals("Centimeter"))) {
              
                double m = Double.parseDouble(jTextField4.getText());
                double cm = 100 * m;
                jTextField5.setText(String.valueOf(cm));
               
            } else if ((input1.equals("Meter")) && (input2.equals("Millimeter"))) {
             
                double m = Double.parseDouble(jTextField4.getText());
                double mm = 1000 * m;
                jTextField5.setText(String.valueOf(mm));
              
            } else if ((input1.equals("Meter")) && (input2.equals("Micrometer"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double microm = 1000000 * m;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Meter")) && (input2.equals("Nanometer"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double nanom = 1000000000 * m;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Meter")) && (input2.equals("Yard"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double microm = 1.09361 * m;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Meter")) && (input2.equals("Foot"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double foot = 3.28084 * m;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Meter")) && (input2.equals("Inch"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double inch = 39.3701 * m;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Meter")) && (input2.equals("Mile"))) {
                double m = Double.parseDouble(jTextField4.getText());
                double mile = 0.000621371 * m;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Kilometer"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double km = cm / 100000.0;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Meter"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double m = cm / 100.0;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Millimeter"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double mm = cm * 10;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Micrometer"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double microm = cm * 10000;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Nanometer"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double nanom = cm * 10000000;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Yard"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double yard = cm / 91.44;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Foot"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double foot = cm / 30.48;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Inch"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double inch = cm / 2.54;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Centimeter")) && (input2.equals("Mile"))) {
                double cm = Double.parseDouble(jTextField4.getText());
                double mile = cm / 160934.4;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Kilometer"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double km = mm / 1000000.0;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Meter"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double m = mm / 1000.0;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Centimeter"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double cm = mm / 10.0;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Micrometer"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double microm = mm * 1000.0;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Nanometer"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double nanom = mm * 1000000000.0;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Yard"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double yard = mm / 914.4;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Foot"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double foot = mm / 304.8;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Inch"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double inch = mm / 25.4;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Millimeter")) && (input2.equals("Mile"))) {
                double mm = Double.parseDouble(jTextField4.getText());
                double mile = mm / 1609344.0;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Kilometer"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double km = microm / 1000000000.0;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Meter"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double m = microm / 1000000.0;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Centimeter"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double cm = microm / 10000.0;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Millimeter"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double mm = microm / 1000.0;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Nanometer"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double nanom = microm * 1000.0;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Yard"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double yard = microm / 914400.0;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Foot"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double foot = microm / 304800.0;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Inch"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double inch = microm / 25400.0;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Micrometer")) && (input2.equals("Mile"))) {
                double microm = Double.parseDouble(jTextField4.getText());
                double mile = (microm / 1609344000000.0);
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Kilometer"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double km = (nanom / 1000000000000.0);
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Meter"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double m = nanom / 1000000000.0;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Millimeter"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double mm = nanom / 1000000.0;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Micrometer"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double microm = nanom / 10000.0;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Centimeter"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double cm = nanom / 100000.0;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Yard"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double yard = nanom / 914400000.0;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Foot"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double foot = nanom / 304.8;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Inch"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double inch = nanom / 25400000.0;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Nanometer")) && (input2.equals("Mile"))) {
                double nanom = Double.parseDouble(jTextField4.getText());
                double mile = nanom / 1609344000000.0;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Yard")) && (input2.equals("Meter"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double m = yard * 0.9144;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Yard")) && (input2.equals("Centimeter"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double cm = yard * 91.44;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Yard")) && (input2.equals("Millimeter"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double mm = yard * 914.4;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Yard")) && (input2.equals("Micrometer"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double micm = yard * 914400.0;
                jTextField5.setText(String.valueOf(micm));
            } else if ((input1.equals("Yard")) && (input2.equals("Nanometer"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double nanom = 914400000 * yard;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Yard")) && (input2.equals("Kilometer"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double km = 0.0009144 * yard;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Yard")) && (input2.equals("Foot"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double foot = 3.0 * yard;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Yard")) && (input2.equals("Mile"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double mile = yard / 1760.0;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Yard")) && (input2.equals("Inch"))) {
                double yard = Double.parseDouble(jTextField4.getText());
                double inch = 36.0 * yard;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Foot")) && (input2.equals("Meter"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double m = foot * 0.3048;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Foot")) && (input2.equals("Centimeter"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double cm = foot * 30.48;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Foot")) && (input2.equals("Millimeter"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double mm = foot * 304.8;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Foot")) && (input2.equals("Micrometer"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double micm = foot * 304800.0;
                jTextField5.setText(String.valueOf(micm));
            } else if ((input1.equals("Foot")) && (input2.equals("Nanometer"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double nanom = 304800000.0 * foot;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Foot")) && (input2.equals("Kilometer"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double km = 0.0003048 * foot;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Foot")) && (input2.equals("Yard"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double yard = foot / 3.0;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Foot")) && (input2.equals("Mile"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double mile = foot / 5280.0;
                jTextField5.setText(String.valueOf(mile));
            } else if ((input1.equals("Foot")) && (input2.equals("Inch"))) {
                double foot = Double.parseDouble(jTextField4.getText());
                double inch = 12.0 * foot;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Mile")) && (input2.equals("Kilometer"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double km = mile * 1.60934;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Mile")) && (input2.equals("Meter"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double m = mile * 1609.34;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Mile")) && (input2.equals("Millimeter"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double mm = mile * 1609340.0;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Mile")) && (input2.equals("Micrometer"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double microm = mile * 1609340000;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Mile")) && (input2.equals("Centimeter"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double cm = mile * 160934;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Mile")) && (input2.equals("Yard"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double yard = mile * 1760.0;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Mile")) && (input2.equals("Foot"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double foot = mile * 5280.0;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Mile")) && (input2.equals("Nanometer"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double nanom = mile * 1609340000000.0;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Mile")) && (input2.equals("Inch"))) {
                double mile = Double.parseDouble(jTextField4.getText());
                double inch = mile * 63360.0;
                jTextField5.setText(String.valueOf(inch));
            } else if ((input1.equals("Inch")) && (input2.equals("Kilometer"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double km = inch * 0.0000254;
                jTextField5.setText(String.valueOf(km));
            } else if ((input1.equals("Inch")) && (input2.equals("Meter"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double m = inch * 0.0254;
                jTextField5.setText(String.valueOf(m));
            } else if ((input1.equals("Inch")) && (input2.equals("Millimeter"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double mm = inch * 25400000.0;
                jTextField5.setText(String.valueOf(mm));
            } else if ((input1.equals("Inch")) && (input2.equals("Micrometer"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double microm = inch * 25400.0;
                jTextField5.setText(String.valueOf(microm));
            } else if ((input1.equals("Inch")) && (input2.equals("Centimeter"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double cm = inch * 2.54;
                jTextField5.setText(String.valueOf(cm));
            } else if ((input1.equals("Inch")) && (input2.equals("Yard"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double yard = inch / 36.0;
                jTextField5.setText(String.valueOf(yard));
            } else if ((input1.equals("Inch")) && (input2.equals("Foot"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double foot = inch / 12.0;
                jTextField5.setText(String.valueOf(foot));
            } else if ((input1.equals("Inch")) && (input2.equals("Nanometer"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double nanom = inch * 25400000.0;
                jTextField5.setText(String.valueOf(nanom));
            } else if ((input1.equals("Inch")) && (input2.equals("Mile"))) {
                double inch = Double.parseDouble(jTextField4.getText());
                double mile = inch / 63360.0;
                jTextField5.setText(String.valueOf(mile));
            } else {
                jTextField5.setText(jTextField4.getText());
            }
                    }
        else
        {
         jTextField5.setText("Length can't be negative");
        }
        }
        }
        catch(Exception ex)
        {
            jTextField5.setText("INVALID INPUT");
        }

    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(Calc.this, "A scientific calculator is an electronic calculator designed\n to perform calculations using basic addition, subtraction,\n multiplication, division and mathematical operations\nand functions.\nA unit converter is designed to perform conversions\nbetween different units of measurements");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable();  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        disable();  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
