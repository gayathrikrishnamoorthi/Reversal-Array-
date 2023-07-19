package sample;

public class Array {
	 static void revereseArray(int arr[],
             int start, int end)
{
 int temp;
    
 while (start < end)
 {
     temp = arr[start]; 
     arr[start] = arr[end];
     arr[end] = temp;
     start++;
     end--;
 } 
}     
static void printArray(int arr[], 
                     int size)
{
 for (int i = 0; i < size; i++)
      System.out.print(arr[i] + " ");
    
  System.out.println();
} 
public static void main(String args[]) {
   
 int arr[] = {1, 2, 3, 2, 1};
 printArray(arr, 5);
 revereseArray(arr, 0, 4);
 System.out.print("Reversed array is \n");
 printArray(arr, 5); 
  
}
}


