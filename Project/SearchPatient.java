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

//import java.beans.Statement;

import java.awt.Color;
import java.beans.Statement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author bilal
 */
public class SearchPatient extends javax.swing.JFrame {

    String st;

    /** Creates new form one */
    public SearchPatient() {
        initComponents();
    }
    
    Vector<String> Header=new Vector<String>();
    Vector<Vector<String>> Data=new Vector<Vector<String>>();

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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        doc = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt20 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Patient");
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
        txt1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txt1MouseMoved(evt);
            }
        });
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/delete-2.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton2MouseWheelMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Find5.png"))); // NOI18N
        jButton3.setText("Show");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search Patient By:");

        doc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ", "Id", "Name", "Country", "City" }));
        doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docActionPerformed(evt);
            }
        });

        jLabel10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel10PropertyChange(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/view.png"))); // NOI18N
        jButton4.setText("Show All");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(251, 251, 251)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(270, 270, 270)
                                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(590, 590, 590)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)))
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docActionPerformed
        // TODO add your handling code here:
      /*  try {
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
            java.sql.Statement s=con.createStatement();
            s.execute("select * from doctor where name=st");*/

        if(doc.getSelectedItem().equals("Id")){
            jLabel9.setText("Enter Doctor Id");
            //st=txt20.getText();
        }
        if(doc.getSelectedItem().equals("Name")){
            jLabel9.setText("Enter Doctor Name");
        }
        if(doc.getSelectedItem().equals("Timing")){
            jLabel9.setText("Enter Doctor Timing");
        }
        if(doc.getSelectedItem().equals("Speciality")){
            jLabel9.setText("Enter Doctor Speciality");
        }
      /*  } catch (Exception e) {
        }*/
}//GEN-LAST:event_docActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (doc.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(rootPane, "Please Select the field that you want to Search !!!");
            }
        else{
        Data.clear();
    Header.clear();
        try {
              Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
             java.sql.Statement stm=con.createStatement();
             String s=txt20.getText();
             String s1=txt20.getText();
             String s2=txt20.getText();
             String s3=txt20.getText();

             String str="select * from patient where id='"+s+"' OR fname like '"+s1+"%' or country like '%"+s2+"%' or city like '%"+s3+"%'"; /**/
           // String str="select * from patient where country like '%"+s2+"%' or city like '%"+s3+"%'";
             ResultSet rs=stm.executeQuery(str);
              
             while (rs.next()) {
                 String id=rs.getString(1);
                 String prefix=rs.getString(2);
                 String fname=rs.getString(3);
                 String lname=rs.getString(4);
                 String dob=rs.getString(5);
                 String gender=rs.getString(6);
                 String country=rs.getString(7);
                 String city=rs.getString(8);
                 String address=rs.getString(9);
                 String pat_status=rs.getString(10);
                 String phone=rs.getString(11);
                 String mobile=rs.getString(12);
                 String email=rs.getString(13);
                 String type=rs.getString(14);

                 Vector<String> rows=new Vector<String>();

                 rows.add(id);
                 rows.add(prefix);
                 rows.add(fname);
                 rows.add(lname);
                 rows.add(dob);
                 rows.add(gender);
                 rows.add(country);
                 rows.add(city);
                 rows.add(address);
                 rows.add(pat_status);
                 rows.add(phone);
                 rows.add(mobile);
                 rows.add(email);
                 rows.add(type);

                 Data.add(rows);

                 Header.add("Id");
                 Header.add("Prefix");
                 Header.add("F-name");
                 Header.add("L-name");
                 Header.add("DOB");
                 Header.add("Gender");
                 Header.add("Country");
                 Header.add("City");
                 Header.add("Address");
                 Header.add("Pat_status");
                 Header.add("Phone");
                 Header.add("Mobile");
                 Header.add("Email");
                 Header.add("Type");

                  jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(new DefaultTableModel(Data,Header));
            }

             
        } catch (SQLException e) {
             Logger.getLogger(SearchPatient.class.getName()).log(Level.SEVERE,null,e);
        }
    catch(Exception ex){
    JOptionPane.showMessageDialog(rootPane, "Enter Valid Field Data");
    }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
        six a=new six();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txt5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        seven a=new seven();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel10PropertyChange
        // TODO add your handling code here:

        jLabel10.setText(""+ date1);
}//GEN-LAST:event_jLabel10PropertyChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
        java.sql.Statement stm=con.createStatement();
        Data.clear();
            Header.clear();
        String str="select * from patient";
           ResultSet rs=stm.executeQuery(str);
             while (rs.next()) {
                 String id=rs.getString(1);
                 String prefix=rs.getString(2);
                 String fname=rs.getString(3);
                 String lname=rs.getString(4);
                 String dob=rs.getString(5);
                 String gender=rs.getString(6);
                 String country=rs.getString(7);
                 String city=rs.getString(8);
                 String address=rs.getString(9);
                 String pat_status=rs.getString(10);
                 String phone=rs.getString(11);
                 String mobile=rs.getString(12);
                 String email=rs.getString(13);
                 String type=rs.getString(14);

                 Vector<String> rows=new Vector<String>();

                 rows.add(id);
                 rows.add(prefix);
                 rows.add(fname);
                 rows.add(lname);
                 rows.add(dob);
                 rows.add(gender);
                 rows.add(country);
                 rows.add(city);
                 rows.add(address);
                 rows.add(pat_status);
                 rows.add(phone);
                 rows.add(mobile);
                 rows.add(email);
                 rows.add(type);

                 Data.add(rows);

                 Header.add("Id");
                 Header.add("Prefix");
                 Header.add("F-name");
                 Header.add("L-name");
                 Header.add("DOB");
                 Header.add("Gender");
                 Header.add("Country");
                 Header.add("City");
                 Header.add("Address");
                 Header.add("Pat_status");
                 Header.add("Phone");
                 Header.add("Mobile");
                 Header.add("Email");
                 Header.add("Type");

                  jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(new DefaultTableModel(Data,Header));
            }
        
        } catch (SQLException e) {
             Logger.getLogger(SearchPatient.class.getName()).log(Level.SEVERE,null,e);
        }
    catch(Exception ex){

    }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        // TODO add your handling code here:
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseDragged
        // TODO add your handling code here:
        jButton2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton2MouseDragged

    private void jButton2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton2MouseWheelMoved
        // TODO add your handling code here:
         jButton2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton2MouseWheelMoved

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton2MouseExited

    private void txt1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseMoved
        // TODO add your handling code here:
        txt1.setBackground(Color.BLACK);
    }//GEN-LAST:event_txt1MouseMoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

           int b=JOptionPane.showConfirmDialog(rootPane, "Do You Want to Logout ?","New",JOptionPane.YES_NO_OPTION);
   if(b==JOptionPane.YES_OPTION)
           {

           Login t=new Login();
        t.setVisible(true);
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
                new SearchPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox doc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton txt1;
    private javax.swing.JButton txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JButton txt3;
    private javax.swing.JButton txt5;
    private javax.swing.JButton txt6;
    // End of variables declaration//GEN-END:variables

}
