package string_1;

public class SeeColor {


    public static void main (String [] args){


        System.out.println(seeColor("redXXX"));
    }

    public static String seeColor(String str) {

        if(str.startsWith("red")){

            str=str.substring(0,3);
        }else if(str.startsWith("blue")){

            str=str.substring(0,4);
        }else{
            str="";
        }
        return str;
    }
}
