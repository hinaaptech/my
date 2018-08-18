/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author bilal
 */
public class Main {

    public static String name="Ali";
private int id=3;
protected float sal=20.3654f;

static
{
    System.out.println("im in block"+name);
    
}
 static public void method1(){
     System.out.println("im in method");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(""+name);
       method1();
    }

}
