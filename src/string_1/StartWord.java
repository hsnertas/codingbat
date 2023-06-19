package string_1;

public class StartWord {

    public static void main(String[] args){


    }

    public String startWord(String str, String word) {

        if(word.length()>str.length()){
            return "";
        }

        if(str.substring(1, word.length()).equals((word.substring(1)))){

            str=str.substring(0,word.length());
        }
        else{
            return "";
        }
        return str;

    }

}
