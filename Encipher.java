/**
 * this program replace each letter of the original text with a secret key, in order to encipher the text. 
 * 
 * The secret key:
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * VJMQDSBGKYAZPWETXCNLHORFUI
 * 
 * Example: 
 * Input:   Attack at noon.
 * Output:  VLLVMA VL WEEW.
 */

import java.util.Scanner;
public class Encipher {
    public static void main(String[] args){
        
        String input, output;
        String key = "VJMQDSBGKYAZPWETXCNLHORFUI";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text: ");
        input = scan.nextLine();

        output = encipher(input, key);
        System.out.println(output);
    }

    public static String encipher(String input, String key){
        String output = "";

        input = input.toUpperCase();

        for(int i = 0; i < input.length(); i++){

            if(input.charAt(i) < 'A' || input.charAt(i) > 'Z'){

                output += input.charAt(i);
                
            }else{
                int ind = input.charAt(i) - 'A';
                output += key.charAt(ind);
            }
            
        }
        return output;
    }
}
