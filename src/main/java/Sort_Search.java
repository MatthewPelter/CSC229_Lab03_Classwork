public class Sort_Search {
    
    static void bubbleSort(int[] a, int size) {
        int outer, inner, temp;
        for (outer = size-1; outer > 0; outer--) { 
            for (inner = 0; inner < outer; inner++) { 
                if (a[inner] > a[inner + 1]) { 
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    
    static void selectionSort(int[] a , int size) {
        int outer, inner, min;
        for (outer = 0; outer < size- 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < size ; inner++) {
                if (a[inner] < a[min]) {
                    min = inner;
                }
            }
            int temp = a[outer];
            a[outer] = a[min];
            a[min] = temp;
        }
    }  
    static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                return i;
            }
        }
        
        return -1;
    }
    
    static int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = (start + end) /2;
            if (val < arr[mid]) {
                end = mid-1;
            }
            
            if (val > arr[mid]) {
                start = mid+1;
            }
            
            if (val == arr[mid]) {
                return mid;
            }
        }
        
        return -1;
    }
    
    static void printArray(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) { 
        int[] bubbleArr = {3, 4, 1, 6, 7, 5, 12, 53, 11, 95, 60};
        
        bubbleSort(bubbleArr,bubbleArr.length);
        printArray(bubbleArr);
        
        System.out.println("\n");
        int[] selectionArr = {3, 4, 1, 6, 7, 5, 12, 53, 11, 95, 60};
        
        selectionSort(selectionArr,selectionArr.length);
        printArray(selectionArr);
        
        System.out.println("\n");

        int search = 95;
        
        System.out.println(linearSearch(selectionArr, search));
        System.out.println(binarySearch(selectionArr, search));
        
        
    }
}
