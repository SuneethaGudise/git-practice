package com.array;

public class MAxandMinUnsortedArray {
	public static int maxNumber(int arr[])
	{
		int len =arr.length;
		int max=arr[0];
       
        for(int i=0;i<len;i++)
        {
        	if(max<arr[i])
        	{
        	 max =arr[i];
        	}
        }
        	return max;
        }
        
        
        public static int minNumber(int arr[])
    	{
        	int len = arr.length;
    		int min=arr[0];
           
            for(int i=0;i<len;i++)
            {
            	if(min>arr[i])
            	{
            	 min =arr[i];
            	}
            }
            	 return min;
            }
              
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MAxandMinUnsortedArray minmax =new  MAxandMinUnsortedArray();
		
        int arr[] = {4,25,11,5,1,45,23,12,6,46,10};
        //int len =arr.length;
        int minnum = minNumber(arr);
        int maxnum = maxNumber(arr);
        System.out.println(maxnum);
        System.out.println(minnum);
       
        
	}

}
