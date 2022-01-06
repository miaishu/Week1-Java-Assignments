package week1.assignments;

import java.util.Arrays;


public class MissingElementInArray {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7};
		
		int count=1;
				
		Arrays.sort(a);
	
//To print the sorted array
	//	for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]+" ");

		//}
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=i+count) {
				
				System.out.println(i+count);
				count++;
				
				//break;
				}
		//	else if(a[i]==count) {
			
				
		//	count++;
				
			}
		//System.out.println("No missing element");
		
			}
	
		}
	
		
		
	