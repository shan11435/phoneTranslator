package edu.citytech.alogorithym.sid23356435;

public class ABCTelephoneTranslator {
	
	public static String translate(String phoneNumber) {
		 // Creating array of string length 
        char[] ch = new char[phoneNumber.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < phoneNumber.length(); i++) { 
            ch[i] = phoneNumber.charAt(i); 
            
            //if letters are A,B, or C change to 2
            if(ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C') { 
                ch[i] = '2';
           }
            
            //if letters are D,E, or F change to 3
            if(ch[i] == 'D' || ch[i] == 'E' || ch[i] == 'F') { 
                ch[i] = '3';
           }
            
            //if letters are G,H, or I change to 4
            if(ch[i] == 'G' || ch[i] == 'H' || ch[i] == 'I') { 
                ch[i] = '4';
           }
          
            //if letters are J,K, or L change to 5
            if(ch[i] == 'J' || ch[i] == 'K' || ch[i] == 'L') { 
                ch[i] = '5';
           }
           
            //if letters are M,N, or O change to 6
            if(ch[i] == 'M' || ch[i] == 'N' || ch[i] == 'O') { 
                ch[i] = '6';
           }
          
            //if letters are P,Q,R, or S change to 7
            if(ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R' || ch[i] == 'S') { 
                ch[i] = '7';
           }
           
            //if letters are  T,U, or V change to 8
            if(ch[i] == 'T' || ch[i] == 'U' || ch[i] == 'V') { 
                ch[i] = '8';
           }
  
            //if letters are W,X,Y, or Z change to 9
            if(ch[i] == 'W' ||  ch[i] == 'X' ||  ch[i] == 'Y' || ch[i] == 'Z') { 
                ch[i] = '9';
           }
         
        } 
        
        return new String(ch);
}
}
