import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to
   letter mapping on a standard telephone keypad.
   thanks dad for helping out 
 */
public class PinWordEnumerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);
        enumerateWords(num);
    }

    /**
       A wrapper for a recursive method that enumerates all the
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    
    public static void enumerateWords(String n)
    {
         // Implement a recursive method that generates
         // all possible phone keypad encodings for a
         // number. Implement additional auxiliary methods
         // if necessary.
         
         //System.out.println(n); 2     3       4   5    6      7     8     9
        String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
         String word = "";
         
       
         
          /* 
            for (int i = 0; i < n.length(); i ++){
                 int singleNum = Integer.valueOf(n.substring(i, i+1));
                 for (int j = 0; j < map[singleNum].length(); j ++){
                     System.out.print(map[singleNum].substring(j, j+1));
                     
                 }
                   
                
                 System.out.println();
        

        }
        */
        
        enumerateWords(n, "");
    }
    /**
           Recursively generates all possible 'words' that represent
           the telephone keypad encoding of a number.
           @param pin the number
           @param word representing the encoding a the pin
           
         */
        public static void enumerateWords(String pin, String word)
        {

            //System.out.println(word);
            //String newWord = word;
            //               0   1   2      3     4     5     6    7      8     9 
            String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};         
            
            if (pin.length() == 0){
                 System.out.println(word);
                 return;
            }
           
            int singleDigit = Integer.valueOf(pin.substring(0, 1));
            String letterGroup = map[singleDigit];
            
             for (int i = 0; i < letterGroup.length(); i ++){
                // shorten the pin by 1
                // ex: 1234 becomes 234 after method call
                //keeps shortening pin lenght until base case is hit
                
                //each splits in more and more
                //imagine a tree
                //so it splits each letter 
                enumerateWords(pin.substring(1), word + letterGroup.charAt(i));
            }
            
            
           

            
            
            

             
            
        }
        
        

    }
            
            
        
        
        
        
        
    



