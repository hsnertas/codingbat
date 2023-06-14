package string_1;

public class ExtraFront {

public static void main(String[] args){

    System.out.println(extraFront("Hello"));
}


    public static String extraFront(String str) {

        if(str.length()>2){

            str=  str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
        else{
            str=str+str+str;
        }
        return str;

    }
}
