
import java.util.ArrayList;


/**
 *
 * @author Artur
 */
public class Program {
    
    
    
    public static void main(String[] args) {
      
      
        ArrayList<Double> ins = new ArrayList<Double>();
        ArrayList<Double> outs = new ArrayList<Double>();


    
    /*  // Teste 001  
        
        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);
        
        outs.add(4.5);
        outs.add(12.5);
        outs.add(20.5);  
     */
    
    
    /*  // Teste 002  
    
        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);
        
        outs.add(2.0);
        outs.add(4.0);
        outs.add(6.0);  
     */
    
    
     // Teste 003  
    
        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);
        
        outs.add(3.0);
        outs.add(7.0);
        outs.add(11.0);  
     
    
    /*
      // Teste 004  
    
        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);
        
        outs.add(4.5);
        outs.add(12.5);
        outs.add(20.5);  
    
    */
      
    
    
    
    Dupla par;

        
        //par=RegLin.metodo1(ins, outs);
        //par=RegLin.metodo2(ins, outs, 2000);
        par=RegLin.metodo3(ins, outs, 2000,0.025);
        
        System.out.printf(" %s %.3f %s %.3f \n","O valor final de W1 e W0 eh: ", par.getA()," e ",par.getB());
        
    }
    

    
    
}
