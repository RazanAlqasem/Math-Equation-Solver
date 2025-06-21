
package main;
import javax.swing.*;

  
public class Calc extends javax.swing.JFrame {

     Poly resultt; 

    public Calc() {
        initComponents();
        setSize(560 , 745); 
        setLocationRelativeTo(null); 
        setTitle("Calculator");
        setResizable(false);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        equlab1 = new javax.swing.JLabel();
        equlab2 = new javax.swing.JLabel();
        operation = new javax.swing.JComboBox<>();
        edu1 = new javax.swing.JTextField();
        edu2 = new javax.swing.JTextField();
        result = new javax.swing.JButton();
        X = new javax.swing.JLabel();
        Insert = new javax.swing.JTextField();
        Notation = new javax.swing.JComboBox<>();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        solver = new javax.swing.JLabel();
        sol = new javax.swing.JLabel();
        end = new javax.swing.JButton();
        res2 = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        r11 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(8, 50, 97));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 177, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 20, 210, 50);

        equlab1.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        equlab1.setForeground(new java.awt.Color(255, 255, 255));
        equlab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equlab1.setText("Equation 1:");
        equlab1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 177, 14), 1, true));
        jPanel1.add(equlab1);
        equlab1.setBounds(20, 100, 180, 40);

        equlab2.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        equlab2.setForeground(new java.awt.Color(255, 255, 255));
        equlab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equlab2.setText("Equation 2:");
        equlab2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 177, 14)));
        jPanel1.add(equlab2);
        equlab2.setBounds(350, 100, 180, 40);

        operation.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        operation.setForeground(new java.awt.Color(255, 0, 0));
        operation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationActionPerformed(evt);
            }
        });
        jPanel1.add(operation);
        operation.setBounds(250, 120, 60, 30);
        operation.getAccessibleContext().setAccessibleDescription("");

        edu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edu1ActionPerformed(evt);
            }
        });
        jPanel1.add(edu1);
        edu1.setBounds(20, 150, 180, 30);

        edu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edu2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edu2ActionPerformed(evt);
            }
        });
        jPanel1.add(edu2);
        edu2.setBounds(350, 150, 180, 30);

        result.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(204, 0, 0));
        result.setText("Result");
        result.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        jPanel1.add(result);
        result.setBounds(130, 200, 110, 30);

        X.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("Insert X Value");
        X.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 177, 14)));
        jPanel1.add(X);
        X.setBounds(70, 300, 180, 40);

        Insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert);
        Insert.setBounds(330, 310, 70, 30);

        Notation.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        Notation.setForeground(new java.awt.Color(204, 0, 0));
        Notation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Infix", "Postfix", "Prefix" }));
        Notation.setAutoscrolls(true);
        Notation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Notation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotationActionPerformed(evt);
            }
        });
        jPanel1.add(Notation);
        Notation.setBounds(210, 440, 110, 30);

        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(r2);
        r2.setBounds(70, 480, 430, 30);

        r3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(r3);
        r3.setBounds(70, 390, 430, 30);

        solver.setFont(new java.awt.Font("Vijaya", 1, 30)); // NOI18N
        solver.setForeground(new java.awt.Color(255, 255, 255));
        solver.setText(" X-solver ?");
        solver.setAutoscrolls(true);
        solver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 177, 14)));
        solver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        solver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(solver);
        solver.setBounds(120, 530, 120, 40);

        sol.setForeground(new java.awt.Color(255, 255, 255));
        sol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(sol);
        sol.setBounds(70, 590, 430, 30);

        end.setBackground(new java.awt.Color(255, 204, 0));
        end.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        end.setText("End");
        end.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });
        jPanel1.add(end);
        end.setBounds(180, 650, 80, 30);

        res2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        res2.setForeground(new java.awt.Color(204, 0, 0));
        res2.setText("Result");
        res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res2ActionPerformed(evt);
            }
        });
        jPanel1.add(res2);
        res2.setBounds(110, 350, 110, 30);

        yes.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        yes.setForeground(new java.awt.Color(204, 0, 0));
        yes.setText("Yes");
        yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes);
        yes.setBounds(310, 530, 110, 30);

        clear1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        clear1.setForeground(new java.awt.Color(204, 0, 0));
        clear1.setText("Clear");
        clear1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear1.setMaximumSize(new java.awt.Dimension(65, 35));
        clear1.setMinimumSize(new java.awt.Dimension(65, 35));
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1);
        clear1.setBounds(320, 200, 110, 30);

        clear2.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        clear2.setForeground(new java.awt.Color(204, 0, 0));
        clear2.setText("Clear");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel1.add(clear2);
        clear2.setBounds(300, 350, 110, 30);

        clearall.setBackground(new java.awt.Color(255, 204, 0));
        clearall.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        clearall.setText("Clear All");
        clearall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallActionPerformed(evt);
            }
        });
        jPanel1.add(clearall);
        clearall.setBounds(280, 650, 80, 30);

        r11.setEditable(false);
        r11.setColumns(20);
        r11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        r11.setRows(5);
        r11.setBorder(null);
        jScrollPane1.setViewportView(r11);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 450, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 553, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationActionPerformed
r11.setText("");
r2.setText("");
r3.setText("");
sol.setText("");
Insert.setText("");
Notation.setSelectedIndex(0);
    }//GEN-LAST:event_operationActionPerformed

    private void edu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edu1ActionPerformed
r11.setText("");
r2.setText("");
r3.setText("");
sol.setText("");
Insert.setText("");
Notation.setSelectedIndex(0);
    }//GEN-LAST:event_edu1ActionPerformed

    private void edu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edu2ActionPerformed
r11.setText("");
r2.setText("");
r3.setText("");
sol.setText("");
Insert.setText("");
Notation.setSelectedIndex(0);
    }//GEN-LAST:event_edu2ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed

    String eq1 = edu1.getText();
    String eq2 = edu2.getText();
     if (eq1.trim().isEmpty() || eq2.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both equations!", "Input Error", JOptionPane.WARNING_MESSAGE);
        return; 
    }
    String Op = (String) operation.getSelectedItem();
    try {
        Poly p1 = Poly.parse(eq1);
        Poly p2 = Poly.parse(eq2);

     switch (Op) {
     case "+":
        resultt = p1.add(p2);
        r11.setText(resultt.infix());

     break;
        
     case "-":
          resultt = p1.sub(p2);
          r11.setText(resultt.infix());
     break;
        
     case "*":
         resultt = p1.mul(p2);
         r11.setText(resultt.infix());
     break;
    
     default :
         resultt = p1.div(p2);  
          r11.setText(resultt.infix()); 
       
}

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }
   
    }//GEN-LAST:event_resultActionPerformed

    private void NotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotationActionPerformed
          if (resultt == null)
              return; 

    String NOTa = (String) Notation.getSelectedItem();
    String NOT = "";

    switch (NOTa) {
        case "Infix":
            NOT = resultt.infix();
            break;
        case "Postfix":
            NOT = resultt.Postfix();
            break;
        case "Prefix":
            NOT = resultt.Prefix();
            break;
    }

    r2.setText(NOT);
    }//GEN-LAST:event_NotationActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

    }//GEN-LAST:event_InsertActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        
        End End = new End(); 
        End.setVisible(true);
        this.dispose(); 

    }//GEN-LAST:event_endActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        // TODO add your handling code here:
        Poly poly = new Poly();
        String root = poly.roots(resultt); 
         sol.setText( root);
        
        
    }//GEN-LAST:event_yesActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed

        edu1.setText("");
        edu2.setText("");
        r11.setText("");

    }//GEN-LAST:event_clear1ActionPerformed

    private void res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res2ActionPerformed
        
        if (!Insert.getText().isEmpty()) {
    try {
        double x = Double.parseDouble(Insert.getText());
        int xVal = (int) Double.parseDouble(Insert.getText());
        double val = resultt.evaluate(xVal);
        r3.setText("f(x) = " + val);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid X ", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

        
    }//GEN-LAST:event_res2ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        // TODO add your handling code here:
       Insert.setText("");
       r3.setText("");   
    }//GEN-LAST:event_clear2ActionPerformed

    private void clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearallActionPerformed
        
r11.setText("");
r2.setText("");
r3.setText("");
sol.setText("");
Insert.setText("");
Notation.setSelectedIndex(0);
edu1.setText("");
edu2.setText("");

       
    }//GEN-LAST:event_clearallActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Insert;
    private javax.swing.JComboBox<String> Notation;
    private javax.swing.JLabel X;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JButton clearall;
    private javax.swing.JTextField edu1;
    private javax.swing.JTextField edu2;
    private javax.swing.JButton end;
    private javax.swing.JLabel equlab1;
    private javax.swing.JLabel equlab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> operation;
    private javax.swing.JTextArea r11;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JButton res2;
    private javax.swing.JButton result;
    private javax.swing.JLabel sol;
    private javax.swing.JLabel solver;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
