package com.mycompany.project;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TTT extends javax.swing.JFrame {

    boolean matchWon = false;

    private String firstPlayer;
    private String secondPlayer;
    private String evenMove;
    private String oddMove;
    private String player1 = "X";
    private String player2 = "O";
    private String player1ScoreLbl;
    private String player2ScoreLbl;

    private int player1checkInt = 1;
    private int player2checkInt = 2;
    private int player1score = 0;
    private int player2score = 0;
    private int move = 1;
    private int lblcount00 = 0;
    private int lblcount01 = 0;
    private int lblcount02 = 0;
    private int lblcount10 = 0;
    private int lblcount11 = 0;
    private int lblcount12 = 0;
    private int lblcount20 = 0;
    private int lblcount21 = 0;
    private int lblcount22 = 0;
    private int[][] array = new int[3][3];

    public TTT(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        player1ScoreLbl = firstPlayer;
        player2ScoreLbl = secondPlayer;
        initComponents();
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("LogoTICTACTOE.png")).getImage());
        ShowScore();
        setINTarray();
        oddMove = player1;
        evenMove = player2;
    }

    private boolean checkWinLossPlayer1() {
        boolean decision = false;
        if ((array[0][0] == player1checkInt && array[1][1] == player1checkInt && array[2][2] == player1checkInt)) {        // Diagonal \
            decision = true;
        } else if ((array[0][2] == player1checkInt && array[1][1] == player1checkInt && array[2][0] == player1checkInt)) {   // Diagonal /
            decision = true;
        } else if ((array[0][0] == player1checkInt && array[1][0] == player1checkInt && array[2][0] == player1checkInt)) {   // Vertical left
            decision = true;
        } else if ((array[0][1] == player1checkInt && array[1][1] == player1checkInt && array[2][1] == player1checkInt)) {   // Vertical middle
            decision = true;
        } else if ((array[0][2] == player1checkInt && array[1][2] == player1checkInt && array[2][2] == player1checkInt)) {   // Vertical Right
            decision = true;
        } else if ((array[0][0] == player1checkInt && array[0][1] == player1checkInt && array[0][2] == player1checkInt)) {    // Horizontal Top
            decision = true;
        } else if ((array[1][0] == player1checkInt && array[1][1] == player1checkInt && array[1][2] == player1checkInt)) {     // Horizontal Middle
            decision = true;
        } else if ((array[2][0] == player1checkInt && array[2][1] == player1checkInt && array[2][2] == player1checkInt)) {     // Horizontal Down
            decision = true;
        }
        return decision;
    }

    private boolean checkWinLossPlayer2() {
        boolean decision = false;
        if ((array[0][0] == player2checkInt && array[1][1] == player2checkInt && array[2][2] == player2checkInt)) {        // Diagonal \
            decision = true;
        } else if ((array[0][2] == player2checkInt && array[1][1] == player2checkInt && array[2][0] == player2checkInt)) {   // Diagonal /
            decision = true;
        } else if ((array[0][0] == player2checkInt && array[1][0] == player2checkInt && array[2][0] == player2checkInt)) {   // Vertical left
            decision = true;
        } else if ((array[0][1] == player2checkInt && array[1][1] == player2checkInt && array[2][1] == player2checkInt)) {   // Vertical middle
            decision = true;
        } else if ((array[0][2] == player2checkInt && array[1][2] == player2checkInt && array[2][2] == player2checkInt)) {   // Vertical Right
            decision = true;
        } else if ((array[0][0] == player2checkInt && array[0][1] == player2checkInt && array[0][2] == player2checkInt)) {    // Horizontal Top
            decision = true;
        } else if ((array[1][0] == player2checkInt && array[1][1] == player2checkInt && array[1][2] == player2checkInt)) {     // Horizontal Middle
            decision = true;
        } else if ((array[2][0] == player2checkInt && array[2][1] == player2checkInt && array[2][2] == player2checkInt)) {     // Horizontal Down
            decision = true;
        }
        return decision;
    }

    private boolean checkDraw() {
        boolean decision = false;
        if (array[0][0] != 0 && array[1][1] != 0 && array[2][2] != 0
                && array[0][0] != 0 && array[1][1] != 0 && array[2][0] != 0
                && array[0][0] != 0 && array[1][0] != 0 && array[2][0] != 0
                && array[0][1] != 0 && array[1][1] != 0 && array[2][1] != 0
                && array[0][2] != 0 && array[1][2] != 0 && array[2][2] != 0
                && array[0][0] != 0 && array[0][1] != 0 && array[0][2] != 0
                && array[1][0] != 0 && array[1][1] != 0 && array[1][2] != 0
                && array[2][0] != 0 && array[2][1] != 0 && array[2][2] != 0) {
            decision = true;
        }
        return decision;

    }

    private void clrBoard() {
        lbl00.setText("");
        lbl01.setText("");
        lbl02.setText("");
        lbl10.setText("");
        lbl11.setText("");
        lbl12.setText("");
        lbl20.setText("");
        lbl21.setText("");
        lbl22.setText("");
    }

    private void updateScore() {
        if (checkWinLossPlayer1()) {
            if (player1checkInt == 1) {
                player1score++;
                ShowScore();
            } else {
                player2score++;
                ShowScore();
            }
        } else if (checkWinLossPlayer2()) {
            if (player1checkInt == 1) {
                player1score++;
                ShowScore();
            } else {
                player2score++;
                ShowScore();
            }
        } else if (checkDraw()) {
            player1score++;
            player2score++;
            ShowScore();
        }
    }

    private void showWinLossDraw() {
        if (checkWinLossPlayer1()) {
            JOptionPane.showMessageDialog(TTT.this, firstPlayer + " Won the Game!");
            updateScore();
            matchWon = true;
            lblPlayerTurn.setText(firstPlayer + " Won the Game!");
        } else if (checkWinLossPlayer2()) {
            JOptionPane.showMessageDialog(TTT.this, secondPlayer + " Won the Game!");
            updateScore();
            matchWon = true;
            lblPlayerTurn.setText(secondPlayer + " Won the Game!");
        } else if (checkDraw()) {
            JOptionPane.showMessageDialog(TTT.this, "This Match is a Draw!");
            updateScore();
            matchWon = true;
            lblPlayerTurn.setText("This Match is a Draw!");
        }
    }

    private void setINTarray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 0;
            }
        }
    }

    private int getMove() {
        return move;
    }

    private void moveIncrement() {
        move++;
    }

    private void ShowScore() {
        // Get the current scores from labels or variables
        // Set the updated scores back to the labels
        player1ScoreLabel.setText(player1ScoreLbl + "'s Score : " + player1score);
        player2ScoreLabel.setText(player2ScoreLbl + "'s Score : " + player2score);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl00 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl01 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl02 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlayerTurn = new javax.swing.JLabel();
        player2ScoreLabel = new javax.swing.JLabel();
        player1ScoreLabel = new javax.swing.JLabel();
        NewGamebtn = new javax.swing.JButton();
        Rematchbtn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 234, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl20.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl20.setForeground(new java.awt.Color(255, 255, 255));
        lbl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl20, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl20, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl21.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl21.setForeground(new java.awt.Color(255, 255, 255));
        lbl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl21, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl21, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl22.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl22.setForeground(new java.awt.Color(255, 255, 255));
        lbl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl10.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl11.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl12.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl12, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl12, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        lbl00.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl00.setForeground(new java.awt.Color(255, 255, 255));
        lbl00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl00.setAlignmentY(0.0F);
        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl00MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl01.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl01.setForeground(new java.awt.Color(255, 255, 255));
        lbl01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl01MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl01, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl01, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setMaximumSize(new java.awt.Dimension(100, 100));

        lbl02.setFont(new java.awt.Font("American Purpose", 0, 65)); // NOI18N
        lbl02.setForeground(new java.awt.Color(255, 255, 255));
        lbl02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl02MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl02, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl02, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIC TAC TOE");

        lblPlayerTurn.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        lblPlayerTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerTurn.setText("Player 1's Turn : 'X'");
        lblPlayerTurn.setText(firstPlayer+"'s Turn : '"+player1+"'");

        player2ScoreLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        player2ScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player1ScoreLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        player1ScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NewGamebtn.setBackground(new java.awt.Color(255, 153, 153));
        NewGamebtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        NewGamebtn.setForeground(new java.awt.Color(255, 255, 255));
        NewGamebtn.setText("NEW GAME");
        NewGamebtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        NewGamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGamebtnActionPerformed(evt);
            }
        });

        Rematchbtn.setBackground(new java.awt.Color(255, 153, 153));
        Rematchbtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Rematchbtn.setForeground(new java.awt.Color(255, 255, 255));
        Rematchbtn.setText("REMATCH");
        Rematchbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Rematchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RematchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player1ScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player2ScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayerTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NewGamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rematchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(Rematchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewGamebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(player1ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        if (!matchWon) {
            if (lblcount02 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + " '");
                    lbl02.setText(oddMove);
                    array[0][2] = player1checkInt;
                    lblcount02++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl02.setText(evenMove);
                    array[0][2] = player2checkInt;
                    lblcount02++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        if (!matchWon) {
            if (lblcount01 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl01.setText(oddMove);
                    array[0][1] = player1checkInt;
                    lblcount01++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl01.setText(evenMove);
                    array[0][1] = player2checkInt;
                    lblcount01++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl01MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void lbl00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseClicked
        if (!matchWon) {
            if (lblcount00 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl00.setText(oddMove);
                    array[0][0] = player1checkInt;
                    lblcount00++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl00.setText(evenMove);
                    array[0][0] = player2checkInt;
                    lblcount00++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl00MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        if (!matchWon) {
            if (lblcount12 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl12.setText(oddMove);
                    array[1][2] = player1checkInt;
                    lblcount12++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl12.setText(evenMove);
                    array[1][2] = player2checkInt;
                    lblcount12++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        if (!matchWon) {
            if (lblcount11 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl11.setText(oddMove);
                    array[1][1] = player1checkInt;
                    lblcount11++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl11.setText(evenMove);
                    array[1][1] = player2checkInt;
                    lblcount11++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        if (!matchWon) {
            if (lblcount10 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl10.setText(oddMove);
                    array[1][0] = player1checkInt;
                    lblcount10++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl10.setText(evenMove);
                    array[1][0] = player2checkInt;
                    lblcount10++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MouseClicked
        if (!matchWon) {
            if (lblcount22 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl22.setText(oddMove);
                    array[2][2] = player1checkInt;
                    lblcount22++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl22.setText(evenMove);
                    array[2][2] = player2checkInt;
                    lblcount22++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl22MouseClicked

    private void lbl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MouseClicked
        if (!matchWon) {
            if (lblcount21 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl21.setText(oddMove);
                    array[2][1] = player1checkInt;
                    lblcount21++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl21.setText(evenMove);
                    array[2][1] = player2checkInt;
                    lblcount21++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl21MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        if (!matchWon) {
            if (lblcount20 == 0) {
                if (getMove() % 2 != 0) {
                    lblPlayerTurn.setText(secondPlayer + "'s Turn : '" + player2 + "'");
                    lbl20.setText(oddMove);
                    array[2][0] = player1checkInt;
                    lblcount20++;
                    moveIncrement();
                } else {
                    lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
                    lbl20.setText(evenMove);
                    array[2][0] = player2checkInt;
                    lblcount20++;
                    moveIncrement();
                }
                showWinLossDraw();
            } else {
                JOptionPane.showMessageDialog(TTT.this, "You Can not change previously set move");
            }
        } else {
            JOptionPane.showMessageDialog(TTT.this, "The Match has already ended");
        }
    }//GEN-LAST:event_lbl20MouseClicked

    private void NewGamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGamebtnActionPerformed

        TTT3 tictactoemain = new TTT3();
        tictactoemain.setVisible(true);

        // Close the PlayerNameInputFrame
        dispose();
    }//GEN-LAST:event_NewGamebtnActionPerformed

    private void clrlblmove() {
        lblcount10 = 0;
        lblcount11 = 0;
        lblcount12 = 0;
        lblcount20 = 0;
        lblcount21 = 0;
        lblcount22 = 0;
        lblcount00 = 0;
        lblcount01 = 0;
        lblcount02 = 0;

    }

    private void changePlayers() {
        String Temp;
        Temp = player1;
        player1 = player2;
        player2 = Temp;

        String temp;
        temp = oddMove;
        oddMove = evenMove;
        evenMove = temp;

        String dispose;
        dispose = firstPlayer;
        firstPlayer = secondPlayer;
        secondPlayer = dispose;

        int a;
        a = player1checkInt;
        player1checkInt = player2checkInt;
        player2checkInt = a;
    }

    private void RematchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RematchbtnActionPerformed
        matchWon = false;
        changePlayers();
        clrBoard();
        setINTarray();
        clrlblmove();
        lblPlayerTurn.setText(firstPlayer + "'s Turn : '" + player1 + "'");
        move = 1;
    }//GEN-LAST:event_RematchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewGamebtn;
    private javax.swing.JButton Rematchbtn;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lblPlayerTurn;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel player1ScoreLabel;
    private javax.swing.JLabel player2ScoreLabel;
    // End of variables declaration//GEN-END:variables
}
