/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Aug 14, 2012, 6:19:39 AM
 */

package project;



import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *
 * @author bilal
 */
public class signup1 extends javax.swing.JFrame {

    String a;
    /** Creates new form Login **/
    public signup1() {
        initComponents();
    }
    String x;
    private void group(){
        group.add(radio2);
        group.add(radio1);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        group = new javax.swing.ButtonGroup();
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txt7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radio2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.setForeground(new java.awt.Color(153, 153, 153));
        txt2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt2.setName("Username"); // NOI18N
        txt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt2FocusLost(evt);
            }
        });
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 160, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sign-up.png"))); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 81, 30));

        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 80, -1));

        txt3.setForeground(new java.awt.Color(153, 153, 153));
        txt3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt3MouseExited(evt);
            }
        });
        txt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt3FocusLost(evt);
            }
        });
        txt3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt3PropertyChange(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 160, 20));

        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 70, -1));

        jLabel8.setText("City");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 50, -1));

        txt5.setForeground(new java.awt.Color(153, 153, 153));
        txt5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt5.setName("Username"); // NOI18N
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        txt5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt5FocusLost(evt);
            }
        });
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 160, 20));

        txt6.setForeground(new java.awt.Color(153, 153, 153));
        txt6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt6.setName("Username"); // NOI18N
        txt6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt6FocusGained(evt);
            }
        });
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 160, 20));

        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 60, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select City", "Karachi", "Lahore ", "Islamabad", "Quetta", "Other.." }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 160, -1));

        txt7.setForeground(new java.awt.Color(153, 153, 153));
        txt7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt7.setName("Username"); // NOI18N
        txt7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt7FocusLost(evt);
            }
        });
        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt7KeyReleased(evt);
            }
        });
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 160, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 80, -1));

        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, -1));

        txt8.setForeground(new java.awt.Color(153, 153, 153));
        txt8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt8.setName("Username"); // NOI18N
        txt8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt8FocusLost(evt);
            }
        });
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 160, 20));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 110, 20));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, -1));

        jLabel11.setText("Username");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 90, -1));

        group.add(radio2);
        radio2.setText("Female");
        getContentPane().add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 70, 50));

        jLabel14.setText("Gender");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 60, -1));

        group.add(radio1);
        radio1.setText("Male");
        getContentPane().add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 60, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/login.png"))); // NOI18N
        jButton2.setText("Sign In");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 81, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 110, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/header_travel_and_tourism.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 390, 400));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/loginblur.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 650));

        txt4.setForeground(new java.awt.Color(153, 153, 153));
        txt4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        txt4.setName("Username"); // NOI18N
        txt4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt4FocusLost(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 160, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
try {
   
  
                if (txt5.getText().length()==0 || txt5.getText().equals("Text Only")) {
                     txt5.setForeground(Color.red);
                   txt5.setText("Insert Name");
            JOptionPane.showMessageDialog(rootPane, "Please insert Name");

        }
            else if(txt8.getText().length()==0 || txt8.getText().equals("Text Only") )
            {
                 txt8.setForeground(Color.red);
                   txt8.setText("Insert Last Name");
            JOptionPane.showMessageDialog(rootPane,"Please Insert Last Name");
            }
                else if(txt7.getText().length()==0 || txt7.getText().equals("Already in Use !"))
            {
            JOptionPane.showMessageDialog(rootPane,"Please Insert Username");
            }
                 else if(txt3.getText().length()==0 || txt3.getText().length()<=5)
            {
            JOptionPane.showMessageDialog(rootPane,"Please Insert Password");
            }
                else if(txt3.getText().length()==0 || txt3.getText().length()<=5)
            {
            JOptionPane.showMessageDialog(rootPane,"Please Insert Password");
            }
                else  if(txt6.getText().length()==0 ||txt6.getText().equals("Insert Address")|| txt6.getText().equals("Invalid ID"))
            {
                 txt6.setForeground(Color.red);
                   txt6.setText("Insert Address");
            JOptionPane.showMessageDialog(rootPane,"Please Insert Address !!!");
            }
                else if(jComboBox1.getSelectedIndex()==0 )
            {
                     
            JOptionPane.showMessageDialog(rootPane,"Please Select City ");
            }
                else  if(txt2.getText().length()==0 ||txt2.getText().equals("Insert Email")|| txt2.getText().equals("Invalid Email ID"))
            {
                 txt2.setForeground(Color.red);
                   txt2.setText("Insert Email");
            JOptionPane.showMessageDialog(rootPane,"Please Insert Email !!!");
            }
                else  if(radio1.isSelected()==false && radio2.isSelected()==false )
            {
               radio1.setForeground(Color.red);
               radio2.setForeground(Color.red);
            JOptionPane.showMessageDialog(rootPane,"Please Select Gender !!!");
            }
         

            else{
                

        
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
            java.sql.Statement s=con.createStatement();

          

            String s1=(String) jComboBox1.getSelectedItem();
            a=s1;
            String radio="";

            if (radio2.isSelected()) {
                radio=radio2.getText();

            }
            if (radio1.isSelected()) {
                radio=radio1.getText();

            }
            
                   

    else{
   }
            

            s.execute("insert into signup values('"+txt5.getText()+"','"+txt8.getText()+"','"+txt7.getText()+"','"+txt3.getText()+"','"+txt6.getText()+"','"+a+"','"+txt2.getText()+"','"+radio+"')");
       JOptionPane.showMessageDialog(rootPane, "Welcome!! Hospital Management System");
           int b=JOptionPane.showConfirmDialog(rootPane, "Do You want to Sign in?","New",JOptionPane.YES_NO_OPTION);
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

            }

}catch (Exception e) {

        }

        
                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt5ActionPerformed

    private void txt5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt5FocusLost
        // TODO add your handling code here:
         String exp="[a-zA-Z]*+||([a-zA-Z]*\\s[a-zA-Z]*)+||([a-zA-Z]*\\s[a-zA-Z]*\\s[a-zA-Z]*)";
String s1=txt5.getText();
String pat=Pattern.compile(exp).toString();
if(s1.matches(pat)==true){
   txt5.setForeground(Color.BLACK);
   }
 else{
       txt5.setForeground(Color.red);
       txt5.setText("Text Only");
   }
    }//GEN-LAST:event_txt5FocusLost

    private void txt5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt5FocusGained
        // TODO add your handling code here:
        txt5.setText("");
    }//GEN-LAST:event_txt5FocusGained

    private void txt8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt8FocusLost
        // TODO add your handling code here:
         String exp="[a-zA-Z]*+||([a-zA-Z]*\\s[a-zA-Z]*)+||([a-zA-Z]*\\s[a-zA-Z]*\\s[a-zA-Z]*)";
String s1=txt8.getText();
String pat=Pattern.compile(exp).toString();
if(s1.matches(pat)==true){
    txt8.setForeground(Color.BLACK);
   }
 else{
       txt8.setForeground(Color.red);
       txt8.setText("Text Only");
   }
    }//GEN-LAST:event_txt8FocusLost

    private void txt8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt8FocusGained
        // TODO add your handling code here:
        txt8.setText("");
    }//GEN-LAST:event_txt8FocusGained

    private void txt2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusLost
        // TODO add your handling code here:
 
{
String exp=".+@.+\\.[a-zA-Z]{2,4}+";
String st=txt2.getText();
String pat=Pattern.compile(exp).toString();
if(st.matches(pat)==true){
    txt2.setForeground(Color.BLACK);
   }
 else{
       txt2.setForeground(Color.red);
       txt2.setText("Invalid Email ID");
   }
}
    }//GEN-LAST:event_txt2FocusLost

    private void txt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2FocusGained
        // TODO add your handling code here:
        
       if(txt2.getText().equalsIgnoreCase("Insert Email") ||txt2.getText().equalsIgnoreCase("Invalid Email ID")) {
            txt2.setForeground(Color.BLACK);
            txt2.setText("");
        }
    }//GEN-LAST:event_txt2FocusGained

    private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt3KeyPressed

    private void txt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyReleased
        // TODO add your handling code here:
       
       
              if (txt3.getText().length()>=6 && txt3.getText().length()<8) {

   jLabel7.setForeground(Color.blue);
                   jLabel7.setText("Weak Password");
    }
             else if (txt3.getText().length()>=8 && txt3.getText().length()<10) {

   jLabel7.setForeground(Color.blue);
                   jLabel7.setText("Normal Password");
    }
              else if (txt3.getText().length()>=10) {

   jLabel7.setForeground(Color.blue);
                   jLabel7.setText("Strong Password");
    }
    else{
        jLabel7.setForeground(Color.red);
   jLabel7.setText("Too Short");
    }
    }//GEN-LAST:event_txt3KeyReleased

private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
    // TODO add your handling code here:
     
}//GEN-LAST:event_txt3KeyTyped

private void txt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseExited
    // TODO add your handling code here:

}//GEN-LAST:event_txt3MouseExited

private void txt3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt3PropertyChange
    // TODO add your handling code here:

}//GEN-LAST:event_txt3PropertyChange

private void txt3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt3FocusLost
    // TODO add your handling code here:
    if(txt3.getText().length()==0 || txt3.getText().length()<=5)
            {
        //    JOptionPane.showMessageDialog(rootPane, "Too Short Password!!!");
            // txt3.setForeground(Color.red);
    //txt3.setText("Insert Student ID");
    }
}//GEN-LAST:event_txt3FocusLost

private void txt7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusGained
    // TODO add your handling code here:
    if(txt7.getText().equalsIgnoreCase("Invalid Username")||txt7.getText().equalsIgnoreCase("Already in Use !") ) {
         
        
        txt7.setForeground(Color.BLACK);
            txt7.setText("");
        }
    
}//GEN-LAST:event_txt7FocusGained

private void txt7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyReleased
    // TODO add your handling code here:
try {
         Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
             java.sql.Statement stm=con.createStatement();
           
             String str="select * from signup where username='"+txt7.getText()+"'";
             ResultSet rs=stm.executeQuery(str);
             if (rs.next()==true) {
                 jLabel10.setForeground(Color.red);
             jLabel10.setText("Invalid Username");
             
        }
                else if(txt7.getText().length()==0 )
            {
                     jLabel10.setForeground(Color.red);
             jLabel10.setText("");
           // JOptionPane.showMessageDialog(rootPane,"Please Insert Username");
            }
             else{
                
                 jLabel10.setForeground(Color.blue);
                   jLabel10.setText("Valid Username");
             }
    } catch (Exception e) {
    }
    
  /* try {
        Class.forName("sun.jdbc.odbc.JdbcOdbc");
            Connection con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
             java.sql.Statement stm=con.createStatement();
             String str="select * from signup where username='"+x+"'";

              ResultSet rs=stm.executeQuery(str);
             if (rs.next()==true) {
                 jLabel10.setForeground(Color.red);
             jLabel10.setText("Invalid Username");
        }
             else{
                   jLabel10.setForeground(Color.blue);
                   jLabel10.setText("Valid Username");
             }
    } catch (Exception e) {
    }*/
}//GEN-LAST:event_txt7KeyReleased

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    String s1=txt5.getText(),s2=txt8.getText(),s3=txt7.getText(),s4=txt3.getText(),s5=txt6.getText(),s6=txt2.getText();
    if (s1.length()!=0 || s2.length()!=0 || s3.length()!=0 || s4.length()!=0 || s5.length()!=0 || s6.length()!=0) {
     int b=JOptionPane.showConfirmDialog(rootPane, "Do You Want to Continue ?","New",JOptionPane.OK_CANCEL_OPTION);
   if(b==JOptionPane.OK_OPTION)
           {
                  Login s=new Login();
             s.setVisible(true);
           this.dispose();
           }
     if(b==JOptionPane.CANCEL_OPTION)
           {
//System.nanoTime();
    
           }
    }
    else{
    Login a=new Login();
        a.setVisible(true);
        this.dispose();}
}//GEN-LAST:event_jButton2ActionPerformed

private void txt4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt4FocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_txt4FocusGained

private void txt4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt4FocusLost
    // TODO add your handling code here:
}//GEN-LAST:event_txt4FocusLost

private void txt7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt7FocusLost
    // TODO add your handling code here:
    if (jLabel10.getText()=="Invalid Username") {
        JOptionPane.showMessageDialog(rootPane, "Username Already in Use !");
        txt7.setForeground(Color.red);
                   txt7.setText("Already in Use !");
    }
}//GEN-LAST:event_txt7FocusLost

private void txt6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt6FocusGained
    // TODO add your handling code here:
    if(txt6.getText().equalsIgnoreCase("Insert Address")) {
            txt6.setForeground(Color.BLACK);
            txt6.setText("");
        }
}//GEN-LAST:event_txt6FocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable()

        {

            public void run() {
                new signup1().setVisible(true);

            }
        });


    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup group;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JTextField txt2;
    private javax.swing.JPasswordField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables

}
