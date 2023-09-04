
import javax.swing.JOptionPane;
public class D6_Nvezes {
    public static void main(String[] args) {
       String n; 
       int d1;
       int d2;
       int x;
       int cont;
                 
       n=JOptionPane.showInputDialog("Diga quantas vezes você quer que repita");
       x=Integer.parseInt(n);
      cont=1;
      d1=0;
      d2=0;
      while(cont<=x){
      d1=1+(int)(Math.random()*6);
      d2=1+(int)(Math.random()*6);
      System.out.println("Dado 1["+d1+"]"+" "+"Dado 2["+d2+"]");
      cont=cont+1;
      if(d1+d2==5){
      break;
      }
      }
         
}
    
}
