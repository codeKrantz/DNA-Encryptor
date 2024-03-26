class Main{

    public static void main(String[] args){

        //basic message info
        String test = "test";
        String uppercaseMessage = test.toUpperCase(); //all upercase reduces the number of charaters needed for base pairing
        
        //initializing class
        DNAencryptor DNA = new DNAencryptor(uppercaseMessage);
        DNA.getMessage();



    }

}