package JavaAlgos;

import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        System.out.println(arrayList);
        arrayList.add("dfg");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));//second array [dfg] printed
        System.out.println(arrayList.get(0));//first array [abc] printed
    }
    
}
