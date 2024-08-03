import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    
    public static int[] FindMinMax (int[] array){
        
        int max = array[0];
        int min = array[0];
        
        
        for(int i = 1; i< array.length; i++){
            
            if(array[i] < min){
                
            min = array[i];
                
            }
           if(array[i] > max){
                
            max = array[i];
                
            }
        
            
        }
        
        return new int[] {max , min};
        
        
        
        
        
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
	
	int[] result = FindMinMax(array);
	
System.out.println("Maximum value : " + result[0] );
System.out.println("Minimum value : " + result[1] );
	
	
	}
}
