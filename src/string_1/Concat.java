package string_1;

public class Concat {

    public static void main (String[] args){


    }

    public static String conCat(String a, String b){

        if(b.equals("")){
            return a;

        }else if(a.equals("")){

            return b;
        }else if((a.substring(a.length()-1)).equals(b.substring(0,1))){
            return a.concat(b.substring(1));

        }

        return a+b;

    }
}
