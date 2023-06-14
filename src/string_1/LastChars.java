package string_1;

public class LastChars {

    public static void main (String[] args){
        System.out.println(lastChars("", ""));
    }

    public static String lastChars(String a, String b) {

        if(b.isEmpty()&&a.isEmpty()){
            a= "@@";



        }else if(b.isEmpty()){

            a= a.substring(0,1).concat("@");
        }else if(a.isEmpty()){
            a=  "@".concat(b.substring(b.length()-1));

        }
        else{
            a=  a.substring(0,1).concat(b.substring(b.length()-1));
        }
        return a;
    }
}
