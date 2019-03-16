package arrays;

public class Segregate0sand1s {
	
	static int[] segregate(int[] arr) {
		
		int startCount=0;
		int endCount=arr.length-1;
		int[] newArr = new int[arr.length];
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				newArr[startCount] = arr[i];
				startCount++;				
			}
			else
			{ 
				newArr[endCount] = arr[i];
				endCount--;
			}
		}
		
		for(int j=0; j<newArr.length; j++)
		{System.out.print(newArr[j]);}
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int[] binArray = {0,1,1,0,0,1,0,1,1};
		
		binArray = segregate(binArray);
		
	}

}
