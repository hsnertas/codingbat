package string_1;

public class Endsly {

public static void main(String[] args){
System.out.println( endsLy("evenly"));

}


    public static boolean endsLy(String str) {

        boolean isEndsly= false;
        System.out.println(str.substring(str.length()-2));
        if(str.length()>=2){

            if(str.substring(str.length()-2).equals("ly")){
                System.out.println(str.length()-2);
                isEndsly=  true;
            }

        }

        return isEndsly;

    }
}
