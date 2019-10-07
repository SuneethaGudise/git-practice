package stringPrograms;
//WAP TO FIND SUBSTRING IN A GIVENSTRING AND THEN REPLACE IT WITH ANOTHER STRING
public class SubStringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Good Morning to everyone";
		
		String str2 = "Luck";
		String rep="";
		//	GivenString =>ABC CD EF
			//substring =>CD
			//another string =>XYZ
			//ABC XYZ EF
			//if (str.contains("CD"))
			//	str = str.replace("CD", "XYZ")
		
		System.out.println(str);
      // int substr =str.indexOf("Morning");
		
    //   System.out.println(substr);
       CharSequence cs = "Morning";
       if( str.contains(cs))
    	    rep =str.replace(cs,str2);
       System.out.println(rep);
	}
}