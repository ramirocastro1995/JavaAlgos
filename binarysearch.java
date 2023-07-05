package JavaAlgos;

public class bs {
    public static void main(String[] args) {
        int[] haystack = {3,5,6,8,9,10,14,17};
        int needle = 14;
        boolean searchResponse = binarySearch(haystack,needle);
        if(searchResponse == true){
            System.out.println("lo encontramos!");
        }
        else{
            System.out.println("No lo encontramos");
        }
        
    }

    public static boolean binarySearch(int[] haystack,int needle){
        int low = 0;
        int hi = haystack.length;     
        while(low<hi){
            int midpoint = low+(hi-low)/2;
            int value = haystack[midpoint];
            if(value == needle){
                return true;
            }
            else if (value > needle){
                hi = midpoint;
            }
            else{
                low = midpoint+1;
            }

        }
        return false;
         
    }

}

