import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    
    public static int[] insertElement(int[] array, int element, int position){
        
        int newArray[] = new int[array.length + 1];
        
        for(int i = 0, j = 0; i < newArray.length; i++){
            
            if( i == position){
                
                newArray[i] = element;
                
            }
            else{
                
                newArray[i] = array[j];
                j++;
                
            }
            
            
        }
        return newArray;
        
    }
    
  
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array : ");
	int size = sc.nextInt();
	int[] array  = new int[size];
	
	
	System.out.print("Enter the values of the array : ");
	for(int i = 0; i< size; i++){
 array[i] = sc.nextInt(); 
	    
	}
	
	System.out.print("Enter the position of the array : ");
	int position = sc.nextInt();
	
		System.out.print("Enter the element of the array : ");
	int element = sc.nextInt();
	
		
		int[] pref = insertElement(array, element , position);
		System.out.print(Arrays.toString(pref));
		
	
	}
}
