
/**
 * Write a description of class getRich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class getRich
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class getRich
     */
    public static void main(String[] arg){
        System.out.println();
        int money = 1000;
       // getRich(money);
        
        System.out.println("Goal: " +getRich(money));    
    }
    public static int getRich(int money)
    {
       
        System.out.println(money);
     
        if(money == 1){
         
           
          
           return 1;
        }else{
            
            
            
           
           //getRich(money/10);
           
           //getRich(money/10);
           return getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10)+
           getRich(money/10);
        
          //return money + getRich(money/10);
            
        }
        
    }
}
