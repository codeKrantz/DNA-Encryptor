public class DNAencryptor{
    private String message;



    public DNAencryptor(String messageInput){
        message = messageInput;
        
    }

/*
 * PRECODITION: message does not contrain lower case letters
 * Punctuation will then come next in the key
 * then number starting with 1 to 9 and ending at zero (follow the key board)
 * special characters may be add based on logical use
 * start and end codons will be added based on the key
 * follow the key from the top left and work your way down and then back up one collum to the right 
 */

    public void getMessage(){
        // create a char list from the string message and store last char index
       char[] charList = new char[message.length()];
       int lastChar = message.length();

       //use get char method to access letters are primative data types
        message.getChars(0, lastChar, charList, 0);


        //printing out the message Starting with the start codon
        System.out.println("3-MET");
        // then go down the key starting with letters and after Z switch to . , ! and ? then move to numbers 1-0
        for(int i = 0; i < message.length(); i++){
            char tempLetter = charList[i];
            
            // start of letters
            if (tempLetter == 'A'){
                System.out.print("UUU");
            }
            else if (tempLetter == 'B'){
                System.out.print("UUC");
            }
            else if (tempLetter == 'C'){
                System.out.println("UUA");
            }
            else if (tempLetter == 'D'){
                System.out.print("UUG");
            }
            else if (tempLetter == 'E'){
                System.out.print("CUU");
            }
        

// MAYBE USE LISTS?



            else{System.out.println("Character not added yet");}
        }
        
       
    
}
}