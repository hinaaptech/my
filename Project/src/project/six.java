/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * one.java
 *
 * Created on Aug 3, 2012, 6:36:09 AM
 */



package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bilal
 */
public class six extends javax.swing.JFrame {

    
    /** Creates new form one */
    public six() {
        initComponents();
    }
DateFormat date=new SimpleDateFormat("dd/MM/yyyy ");
 Date date1=new Date();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt6 = new javax.swing.JButton();
        txt5 = new javax.swing.JButton();
        txt3 = new javax.swing.JButton();
        txt2 = new javax.swing.JButton();
        txt1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reports");
        setForeground(java.awt.Color.gray);
        setResizable(false);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/log.JPG"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.setMaximumSize(new java.awt.Dimension(97, 73));
        jButton6.setMinimumSize(new java.awt.Dimension(72, 73));
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/gut3.JPG"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/billing1.JPG"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(97, 73));
        jButton5.setMinimumSize(new java.awt.Dimension(72, 73));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/billing.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/schedue1.PNG"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(97, 73));
        jButton1.setMinimumSize(new java.awt.Dimension(72, 73));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/schedu2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt6.setBackground(new java.awt.Color(0, 0, 0));
        txt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sear.JPG"))); // NOI18N
        txt6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt6.setBorderPainted(false);
        txt6.setMaximumSize(new java.awt.Dimension(97, 73));
        txt6.setMinimumSize(new java.awt.Dimension(72, 73));
        txt6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sear1.JPG"))); // NOI18N
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt5.setBackground(new java.awt.Color(0, 0, 0));
        txt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Report1.JPG"))); // NOI18N
        txt5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt5.setBorderPainted(false);
        txt5.setMaximumSize(new java.awt.Dimension(97, 73));
        txt5.setMinimumSize(new java.awt.Dimension(72, 73));
        txt5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/reports2.png"))); // NOI18N
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt3.setBackground(new java.awt.Color(0, 0, 0));
        txt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Doctor1.JPG"))); // NOI18N
        txt3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt3.setBorderPainted(false);
        txt3.setMaximumSize(new java.awt.Dimension(97, 73));
        txt3.setMinimumSize(new java.awt.Dimension(72, 73));
        txt3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/doctor2.png"))); // NOI18N
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Edited add.JPG"))); // NOI18N
        txt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt2.setBorderPainted(false);
        txt2.setMaximumSize(new java.awt.Dimension(97, 73));
        txt2.setMinimumSize(new java.awt.Dimension(72, 73));
        txt2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/cpyadd.JPG"))); // NOI18N
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Copy of 3.jpg"))); // NOI18N
        txt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt1.setBorderPainted(false);
        txt1.setMaximumSize(new java.awt.Dimension(97, 73));
        txt1.setMinimumSize(new java.awt.Dimension(72, 73));
        txt1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/add 3.JPG"))); // NOI18N
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Contact1.JPG"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel4.setText("Welcome Adminstrator");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/edited.JPG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo.gif"))); // NOI18N

        jLabel10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel10PropertyChange(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7, 0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(510, 510, 510)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(270, 270, 270)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(440, 440, 440)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(350, 350, 350)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jLabel10)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
        one a=new one();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
        two a=new two();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
        three a=new three();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
        four a=new four();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        five a=new five();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
            

    }//GEN-LAST:event_txt5ActionPerformed

    private void jLabel10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel10PropertyChange
        // TODO add your handling code here:

        jLabel10.setText(""+ date1);
}//GEN-LAST:event_jLabel10PropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        seven a=new seven();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
           int b=JOptionPane.showConfirmDialog(rootPane, "Do You Want to Logout ?","New",JOptionPane.YES_NO_OPTION);
   if(b==JOptionPane.YES_OPTION)
           {

           Login t=new Login();
        t.setVisible(true);
          try{
               Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");

            java.sql.Statement s=con.createStatement();
          String x="xxxx";
       s.execute("update history set logout='"+jSpinner1.getValue()+"' where logout='"+x+"'");

        }
        catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error"+ e);
    }
        this.dispose();
           }
     if(b==JOptionPane.NO_OPTION)
           {
//System.nanoTime();

           }

    else{
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new six().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton txt1;
    private javax.swing.JButton txt2;
    private javax.swing.JButton txt3;
    private javax.swing.JButton txt5;
    private javax.swing.JButton txt6;
    // End of variables declaration//GEN-END:variables

}
