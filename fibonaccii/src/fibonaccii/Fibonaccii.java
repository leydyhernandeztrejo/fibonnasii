/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccii;

import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.X;

/**
 *
 * @author morenita
 */
public class Fibonaccii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int X=0;
    while(X!=4){
            System.out.println(fibonacci(X));
            X++;
        }
    }
    public static int fibonacci(int N)
    {
        if(N==0 || N==1)
        {
            return 1;
        }
        else 
        {
            return fibonacci(N-1)+fibonacci(N-2);
        }
    }

    private static boolean fibonacci(KeyCode keyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
