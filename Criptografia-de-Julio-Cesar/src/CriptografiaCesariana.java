public class CriptografiaCesariana {

    public static void main(String[] args){
        System.out.println("Criptografa: " + criptografar("abcdefg"));
        System.out.println("Descriptografa: " + descriptografar("defghij"));
    }

    public static String criptografar(String text) {
        if(text == ""){
            throw new IllegalArgumentException();
        }
        String lowerCaseText = text.toLowerCase();
        String encryptedText = "";

        for(int i=0; i < lowerCaseText.length() ; i++ ){
            int charOfString = (char)(lowerCaseText.charAt(i));
            if(charOfString > 96 && charOfString < 120){
                charOfString+=3;
            } else if(charOfString > 120){
                charOfString-=21;
            }
            encryptedText += (char)(charOfString);
        }
        return encryptedText;
    }

    public static String descriptografar(String text) {
        if(text == ""){
            throw new IllegalArgumentException();
        }
        String lowerCaseText = text.toLowerCase();
        String descryptedText = "";
        if(text == "")
            throw new Error();
        for(int i=0; i < lowerCaseText.length() ; i++ ){
            int charOfString = (char)(lowerCaseText.charAt(i));
            if(charOfString > 99 && charOfString <= 122){
                charOfString-=3;
            } else if(charOfString > 96 && charOfString <= 100){
                charOfString+=23;
            }
            descryptedText += (char)(charOfString);
        }
        return descryptedText;
    }
}
