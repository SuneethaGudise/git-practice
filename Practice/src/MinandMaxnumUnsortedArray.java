
public class MinandMaxnumUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {4,25,11,5,1,45,23,12,6,46,10};
	        int len =arr.length;
	        int max=arr[0];
	        int min=arr[0];
	        for(int i=0;i<len;i++)
	        {
	        	if(max<arr[i])
	        	{
	        	 max =arr[i];
	        	}
	        	else if(min>arr[i])
	        	{
	        		min=arr[i];
	        	}
	        }
	        System.out.println(min);
	        System.out.println(max);
		}

	}


