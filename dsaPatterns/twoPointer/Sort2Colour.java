package dsaPatterns.twoPointer;

public class Sort2Colour {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1,0,0,1};

       int colour[] = sortColour(arr);
       for(int ar:colour){
           System.out.print("  " + ar);
       }
    }

    private static int[] sortColour(int[] arr) {
        int n = arr.length;
        int i =0;
        int j = n-1;

        while(i<j){
            if(arr[i]==1 && arr[j] == 0){
               swap(arr, i, j);
                i++;
                j--;
            }else if(arr[i]==1 && arr[j]==1){
                j--;

            }else{
                i++;
            }

        }
        return arr;
    }

    private static void swap(int[] arr ,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
