package JavaAlgos;

public class quicksort {
    public static void main(String[] args) {
        // |8|2|5|3|9|4|7|6|1
       int[] array = {8, 2 , 5, 3, 9 ,4 ,7 , 6 , 1};
       quickSort(array,0, array.length -1);

       for(int i = 0; i< array.length;i++){
        System.out.print(i + " ");
       }
    }
    
    public static void quickSort(int array[],int start,int end){
        //base case - if end is less or equal to start-> end
        if(end <= start){
            return;
        }
        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);

    }
    public static int partition(int array[],int start,int end){
        //choose the pivot -> last in the array
        // |8|2|5|3|9|4|7|6|  -> pivot = 1
        int pivot = array[end];
        //start the first index
         //    i is no where  |8|2|5|3|9|4|7|6|  -> pivot = 1 
        int i = start - 1;
        //start j
        // i|j = 8|2|5|3|9|4|7|6|   -> pivot = 1
        for (int j = start ; j< end;j++){
            // if 8 <= 1 SWAP
            if(array[j]< pivot){
                //increment the i to the next position
                i++;
                //swap-
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        //else if array[j] is bigger than pivot
        //like with 8 <= 1 , increment i
        //// |i = 8|2|5|3|9|4|7|6|1
        i++;
        //create another temp = 8
        int temp = array[i];
        // 8 = 1
        array[i] = array[end];
        array[end] = temp;
        
        return i;
        
    }
}
