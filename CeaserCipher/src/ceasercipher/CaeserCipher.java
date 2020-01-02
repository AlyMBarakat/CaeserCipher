package ceasercipher;

import java.util.Scanner;

/**
 *
 * @author AlyBarakat
 */
public class CaeserCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encrypt();
        decrypt();
        
        // TODO code application logic here
    }
    
    
    
   public static void encrypt()
   {
       String msg = "";
       String encryptedMessage = "";
       int key;
       char charPointer;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the message to be encrypted: ");
       msg = sc.nextLine();
       
       System.out.println("Enter the key");
       key = sc.nextInt();
       
       for(int i = 0; i < msg.length(); i++)
       {
           charPointer = msg.charAt(i);
           if(charPointer >= 'a' && charPointer <= 'z')
           {
               charPointer = (char)(charPointer + key);
               
               if(charPointer > 'z')
               {
                   charPointer = (char)(charPointer - 'z' + 'a' - 1);
               }

               encryptedMessage += charPointer;
           }
           else if(charPointer >= 'A' && charPointer <= 'Z')
           {
               charPointer = (char)(charPointer + key);
               
               if(charPointer > 'Z')
               {
                   charPointer = (char)(charPointer - 'Z' + 'A' - 1);
               }
               encryptedMessage += charPointer;
           }
           else
           {
               encryptedMessage += charPointer;
           }
       }
       
       System.out.println("Encrypted Message = " + encryptedMessage);
   }
   
   public static void decrypt()
   {
       String msg = "";
       String decryptedMessage = "";
       int key;
       char charPointer;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the message to be decrypted: ");
       msg = sc.nextLine();
       
       System.out.println("Enter the key");
       key = sc.nextInt();
       
       for(int i = 0; i < msg.length(); i++)
       {
           charPointer = msg.charAt(i);
           if(charPointer >= 'a' && charPointer <= 'z')
           {
               charPointer = (char)(charPointer - key);
               
               if(charPointer < 'A')
               {
                   charPointer = (char)(charPointer + 'z' - 'a' + 1);
               }
               decryptedMessage += charPointer;
           }
           else if(charPointer >= 'A' && charPointer <= 'Z')
           {
               charPointer = (char)(charPointer - key);
               
               if(charPointer < 'A')
               {
                   charPointer = (char)(charPointer + 'Z' - 'A' + 1);
               }
               decryptedMessage += charPointer;
           }
           else
           {
               decryptedMessage += charPointer;
           }
       }
       
       System.out.println("Decrypted Message = " + decryptedMessage);    
   }   
}