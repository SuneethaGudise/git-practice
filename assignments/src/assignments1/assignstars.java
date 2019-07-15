package assignments1;

public class assignstars {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="*";
String s1="* *";
String s2="* * *";
String s3 ="* * * *";
String s4 ="* * * * *";

System.out.println(s);
System.out.println(" ");
System.out.println(s1);
System.out.println(" ");
System.out.println(s2);
System.out.println(" ");
System.out.println(s3);
System.out.println(" ");
System.out.println(s4);


	}*/
	
	public static void main(String[] args)
	 {
	  int i=1;
	   while(i<=5)
	    {
	      System.out.println(" ");
	      int j=1;
	     while(j<=i)
	      {
	       System.out.print(" ");
	       System.out.print("*");
	       System.out.print(" ");
	       ++j;
	      }
	    i++;
	     System.out.println(" ");
	     }
	  }


}
