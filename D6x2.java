public class D6x2 {
    public static void main(String[] args) {
   int d6;
   int d6x;
   
   d6=1;
   d6x=1;
   
        while (d6+d6x!=2) {            
            d6=1+(int)(Math.random()*6);
            d6x=1+(int)(Math.random()*6);
            System.out.println("Snake Eyes:"+"\n"+d6+"\n"+d6x);
                       
        }
   
}
}
