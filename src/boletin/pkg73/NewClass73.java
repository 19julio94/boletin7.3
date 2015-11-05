
package boletin.pkg73;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class NewClass73 {
    
    int num1;
    
    public int pedirNumero(){
        
       int num;
       String res=JOptionPane.showInputDialog("Dame o numero");
       num=Integer.parseInt(res);
       return num;
       }
    
      public void valor(int num1){
          if (num1>=0)
              System.out.println("O valor do numero e +");
          else
              System.out.println("O valor do numero e -");
             
      }
    
}
