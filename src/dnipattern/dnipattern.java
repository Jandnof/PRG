/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DNIPattern;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author John Doe
 */
public class dnipattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] l={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String dni="48151623L";
        int n=Integer.parseInt(dni.substring(0,8));
        int pos=n%23;
        String string=n+l[pos];
        Pattern p= Pattern.compile(string);
        Matcher m=p.matcher(dni);
        
            
        if(m.matches()){
            System.out.println("✓");
        }else{
            System.out.println("✗");
        }
    }    
    
}
