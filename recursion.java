package JavaAlgos;

public class recursion {
    public static void main(String[] args) {
        Integer n = 30;
        String havex = "xasdaxdsaddax";
        simpleRecursion(n);
        System.out.println(countx(havex));
    }


    public static Integer simpleRecursion(Integer n){
        //BASE CASE
        if(n==1){
            System.out.println("1");
            return 1;
        }
        //Recursion
        System.out.println("not one " + n);
        return n + simpleRecursion(n-1);
    }
    //count the times x is in a string

    public static Integer countx(String havex){
        if(havex.length() == 0){
            return 0;
        }
        else if (havex.charAt(0) == 'x'){
            System.out.println("has x in the first char");
            return 1 + countx(havex.substring(1));
            
        }
        else {
            System.out.println("Doesn't have x in first char");
            return countx(havex.substring(1));

        }
    }
}
