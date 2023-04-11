
/**
 * Write a description of class GCD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCD
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class GCD
     * 
     */
   
    
    public static void main(String[] args)
    {
        // initialise instance variables
        System.out.println(gcd(25,1075));
        
    }
    
    public static int gcd(int num1, int num2){
        
        if (num2 <= num1 && num1%num2 == 0){
            return num2;
        }else if (num1 < num2){
            return gcd(num2, num1);
        }else{
            return gcd(num2, num1%num2);
        }
        
    }

}
