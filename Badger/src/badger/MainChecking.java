
package badger;

import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.Frame;
import javax.swing.JFrame;


public class MainChecking {



    public static void main(String[] args) {
        
         double ibalance;
         double deposit;
         double deficit;
       

         String initialBalanceString, depositString, deficitString, balanceString;
         
         
         
         initialBalanceString = JOptionPane.showInputDialog(null, "Enter original account balance", "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
         ibalance = Double.parseDouble(initialBalanceString);

      

         JFrame myFrame = new JMyFrame();
         JFrame mySecondFrame = new JMyDepositFrame();

         depositString = JOptionPane.showInputDialog(null, "Enter deposit", "Salary Dialog 2", JOptionPane.INFORMATION_MESSAGE);
         deposit = Double.parseDouble(depositString);
         
         deficitString = JOptionPane.showInputDialog(null, "Enter deficits", "Salary Dialog 3", JOptionPane.INFORMATION_MESSAGE);
         deficit = Double.parseDouble(deficitString);

 double cbalance = ibalance + deposit - deficit;

         JOptionPane.showMessageDialog(null, "Your current balance is $" + cbalance);



    }



     







}
