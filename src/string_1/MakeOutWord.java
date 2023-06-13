package string_1;

public class MakeOutWord {

    public static void main(String[] args){

       System.out.println( makeOutWord("<<>>","Hasan"));

    }

public static String makeOutWord(String out, String word){

    return out.substring(0,2)+ word+out.substring(2);

}

}
