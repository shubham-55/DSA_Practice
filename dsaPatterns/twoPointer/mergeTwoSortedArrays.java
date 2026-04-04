package dsaPatterns.twoPointer;



public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,8};
        int arr2[] = {2,5,6,10,11,13};
       int[] arr3 = mergearray(arr1,arr2);
       for(int arr:arr3){
           System.out.print("  "  + arr);
       }
    }

    private static int[] mergearray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int k =0;
        int[] arr3 = new int[m+n];

        int i =0, j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr3[k] = arr1[i];
                k++;
                i++;
            }else{
                arr3[k] = arr2[j];
                k++;
                j++;

            }
        }
        while(i< arr1.length){
            arr3[k] =arr1[i];
            k++;
            i++;
        }
        while(j< arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;

    }


}
