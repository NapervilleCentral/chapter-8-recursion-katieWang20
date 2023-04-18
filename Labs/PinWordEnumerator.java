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
         for (int i = 0; i < n.length(); i ++){
             if (n.charAt(i) == '0'){
                word += "0";    
            }else if (n.charAt(i) == '1'){
                word += "1";
            }else if  (n.charAt(i) == '2'){
                word += "A";
            }else if (n.charAt(i) == '3'){
                word += "D";
            }else if  (n.charAt(i) == '4'){
                word += "G";
            }else if (n.charAt(i) == '5'){
                word +="J";
            }else if (n.charAt(i) == '6'){
                word += "M";
            }else if (n.charAt(i) == '7'){
                word += "P";
            }else if (n.charAt(i) == '8'){
                word += "T";
            }else if (n.charAt(i) == '9'){
                word += "W";
            }
            
         }
        
         // just make the word... 
         
         enumerateWords(n, word);
        

    }

    /**
           Recursively generates all possible 'words' that represent
           the telephone keypad encoding of a number.
           @param pin the number
           @param word representing the encoding a the pin
         */
        public static void enumerateWords(String pin, String word)
        {
            String newWord = "";
            /**
             * absolute garbage disaster 
            if (pin.length() == 0)
            {
                System.out.printf("%s%n",word);
            }
            else
            {
                String[] map = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
                
                for (int i =0; i < word.length();i ++){
                    if (word.charAt(i) == '1'){
                        newWord += "1";
                    }else if (word.charAt(i) == '0'){
                        newWord += "0";
                    }else{
                        for (int a = 0; a < map.length; a ++){
                            for (int j = 0; j < map[a].length(); j++){
                                if (word.charAt(i) == map[a].charAt(j)){
                                    if (j == 2){
                                        newWord+= map[a].charAt(j-1);
                                    
                                    
                                    }else if (j == 0){
                                        newWord += map[a].charAt(j+1);
                                    }else if (j == 4){
                                        newWord += map[a].charAt(j - 1);
                                    
                                    }

                            }
                        }
                    }
                
                }
                
                
                
                
                
            }
            
            enumerateWords(pin, word);
            
        }
        
        */
    }


}
