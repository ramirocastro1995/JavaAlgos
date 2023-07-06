package JavaAlgos;

public class recursion {
    public static void main(String[] args) {
        Integer n = 30;
        simpleRecursion(n);
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
}
