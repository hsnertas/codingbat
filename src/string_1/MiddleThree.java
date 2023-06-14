package string_1;

public class MiddleThree {

    public static void main(String[] args){


        System.out.println("middleThree(\"candy\") = " + middleThree("candy"));
    }


    public static String middleThree(String str) {


        if(((str.length()%2==1) && str.length()>=3)){

            str=str.substring((str.length()/2)-1,(str.length()/2)+2);
        }
        return str;
    }

}
