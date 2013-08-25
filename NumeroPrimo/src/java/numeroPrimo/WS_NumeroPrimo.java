/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroPrimo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

/**
 *
 * @author Micchele
 */
@WebService(serviceName = "WS_NumeroPrimo")
public class WS_NumeroPrimo {

       public String Primo(int num){
         
        String resp = "";
        int cont = 1;
            for (int i = 1; i < num; i++) {  
                if (num % i == 0) {  
                  cont++;
                }
            }    
         if (cont == 2)  
            resp =  "O número é primo";
         if (cont > 2)
            resp = "O número não é primo";
                
               
         return resp;   
        
} 
}


