package stringPrograms;
//WAP TO CONVERT "THIS IS NICE " TO "THIS1 IS2 NICE3"
public class SplitAndConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="This is nice";
		String split [] = str.split("\\s");
		String str1="";
		for(int i=0;i<split.length;i++)
		{
			 str1= str1 + split[i] + (i+1) + " ";
			 
		}
        System.out.println(str1);
	}

}
