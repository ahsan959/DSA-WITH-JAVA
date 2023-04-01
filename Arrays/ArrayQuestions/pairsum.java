

public class pairsum
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,4,5,6,7,2,3,4};
		int sum = 5;
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(" Before pairing " + arr[i]);
			
		   int elements = arr[i];
			
         //inner loop for agha wala elemnts
			for(int j=i+1;j<arr.length;j++)
			{
				
				//System.out.println(" After paring " + elements +" " + arr[j]);
				//System.out.println("(" + elements +","+ arr[j] + ")");
				
				if(elements + arr[j] == sum ) {
					System.out.println("pair Found :"+elements+" , " + arr[j]);
				}
			}
		}
		
	}

}
