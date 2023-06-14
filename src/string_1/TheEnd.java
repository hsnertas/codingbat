package string_1;

public class TheEnd {

    public static void main(String[] args){


    }


    public static String theEnd(String str, boolean front){

        if(front){
            str=str.substring(0,1);
        }
        else {
            str=str.substring(str.length()-1);
        }
        return str;
    }

}
