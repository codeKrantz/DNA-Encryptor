public class DNAencryptor{
    private String message;



    public DNAencryptor(String messageInput){
        message = messageInput;
        
    }

    public void getMessage(){
        // create a char list from the string message
       char[] charList = new char[message.length()-1];

       //use get char method to access letters are primative data types
       try {
        message.getChars(0, 2, charList, 0);
        System.out.println(charList);
       }   
       catch (Exception ex) {
        System.out.println(ex);
    } 
    }
}