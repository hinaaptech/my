/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xterme
 */
class conn {
Connection con;
    Connection connect(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbc");
            con=DriverManager.getConnection("jdbc:odbc:db","sa","aptech");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"SQL 1 "+e);
        }
        return con;
    }

}
