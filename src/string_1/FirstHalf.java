package string_1;

public class FirstHalf {

    public static void main(String[] args){

        System.out.println(firstHalf("hasanhasan"));
    }



    public static String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
}
