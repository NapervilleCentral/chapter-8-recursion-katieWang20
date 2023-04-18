import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to
   letter mapping on a standard telephone keypad.
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
         
         //System.out.println(n);
        String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
         String word = "";
         
        //for (int i = 1; i <= n.length(); i ++){
            
           // word += map[Integer.valueOf(n.substring(i - 1, i))].substring(0, 1);
        //}
         
           
            for (int i = 0; i < n.length(); i ++){
                 int singleNum = Integer.valueOf(n.substring(i-1, i));
                 for (int j = 0; j < map[singleNum].length(); j ++){
                     System.out.println(map[singleNum].substring(j, j+1));
                    
                 }
                   
                //enumerateWords(n, "");
                //newWord += map[Integer.valueOf(pin.substring(i - 1, i))].substring(i, i+1);
                
            //}
         
        //System.out.println("word: " + word);
         //add other letters to a, then add other letters to the second, then third
         
         // empty string
         
        

        }
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
            String newWord = word;
            //               0   1   2      3     4     5     6    7      8     9 
            String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};         
            
            
           
            enumerateWords(pin, newWord);
            
            
            /*
             * 
             * garbage disaster 
            for (int i = 0; i < pin.length(); i++){
                int singlePinNum = Integer.valueOf(pin.substring(i, i+1));
                for (int mapIndex = 0; mapIndex < map.length; mapIndex ++){
                    for (int mapLetterIndex = 0; mapLetterIndex < map[mapIndex].length(); mapLetterIndex ++){
                        if (map[singlePinNum].substring(mapLetterIndex, mapLetterIndex + 1).equals(word.substring(i, i+1))){
                            if (singlePinNum == 1){
                                newWord += "1";
                            }else if (singlePinNum == 0){
                                newWord += "0";
                            }else{
                                newWord  
                               
                            }
                        }
                    }
                }
                
                
                
                */    
            
            }
            
            
            
    }
            
            
        
        
        
        
        
    



