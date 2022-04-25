
import java.util.ArrayList;



/**
 *
 * @author Artur
 */
public class RegLin {
    
        
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    
    private static Dupla saida=new Dupla();
    
    private static Double w0=0.0;
    private static Double w1=0.0;
    private static Double p;
    private static Double dif;
    private static int e=2000;
    private static Double lr=0.03;
    
     
//</editor-fold>
   
   
    

         
    
    
public static Dupla metodo1(ArrayList<Double> ins, ArrayList <Double> outs){

       
    for(int i = 1; i<=2000;i++){
    
        if((i%10)==0){
        
            System.out.printf("%d %.3f %.3f \n", i,w1,w0);
            
        }
        
        for(int j=0; j<ins.size();j++){
        
            p=w1*ins.get(j)+w0;
            dif=outs.get(j)-p;
            w0+=dif*lr;
            w1+=dif*lr*ins.get(j);
            
            //System.out.printf("%s %d %s %d %s %.5f %s %.5f \n","i:",i," j:",j, " w0:",w0," w1:",w1);
        
        }
    
    }
    
    saida.setA(w1);
    saida.setB(w0);
    return saida;
}
    
public static Dupla metodo2(ArrayList<Double> ins, ArrayList <Double> outs, int e){

       
    for(int i = 1; i<=e;i++){
    
        if((i%10)==0){
        
            System.out.printf("%d %.3f %.3f \n", i,w1,w0);
            
        }
        
        for(int j=0; j<ins.size();j++){
        
            p=w1*ins.get(j)+w0;
            dif=outs.get(j)-p;
            w0+=dif*lr;
            w1+=dif*lr*ins.get(j);
            
            //System.out.printf("%s %d %s %d %s %.5f %s %.5f \n","i:",i," j:",j, " w0:",w0," w1:",w1);
        
        }
    
    }
    
    saida.setA(w1);
    saida.setB(w0);
    return saida;
}    
    
 public static Dupla metodo3(ArrayList<Double> ins, ArrayList <Double> outs, int e, Double lr){

       
    for(int i = 1; i<=e;i++){
    
        if((i%10)==0){
        
            System.out.printf("%d %.3f %.3f \n", i,w1,w0);
            
        }
        
        for(int j=0; j<ins.size();j++){
        
            p=w1*ins.get(j)+w0;
            dif=outs.get(j)-p;
            w0+=dif*lr;
            w1+=dif*lr*ins.get(j);
            
            //System.out.printf("%s %d %s %d %s %.5f %s %.5f \n","i:",i," j:",j, " w0:",w0," w1:",w1);
        
        }
    
    }
    
    saida.setA(w1);
    saida.setB(w0);
    return saida;
}       
    
    
    
    
    
}
