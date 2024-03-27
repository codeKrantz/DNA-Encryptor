public class DNAencryptor{
    private String message;



    public DNAencryptor(String messageInput){
        message = messageInput;
        
    }

    public void getMessage(){
        // create a char list from the string message and store last char index
       char[] charList = new char[message.length()];
       int lastChar = message.length();

       //use get char method to access letters are primative data types
        message.getChars(0, lastChar, charList, 0);
        
        
       
    
}
}