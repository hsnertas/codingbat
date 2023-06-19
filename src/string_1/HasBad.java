package string_1;

public class HasBad {

    public static void main(String [] args){


    }

    public static boolean hasBad(String str){

        if(str.length()>=3&& (str.substring(0,3)).equals("bad")|| str.length()>=4&&(str.substring(1,4).equals("bad"))){
            return true;
        }
        return false;
    }

}
