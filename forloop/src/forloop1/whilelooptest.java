package forloop1;

public class whilelooptest {
	public static void main(String[] args)
	{
		// int i,j;
		// i=5;
		// j=1;

		// while(i>0) {
		// i =i-1;
		// j=j*i;
		//
		// System.out.println(j);
		int n;
		n = 1;
		while (n <= 32)
		{
			n = 2 * n;
			System.out.println(n);
			;
		}

		String name;
		int i;
		boolean startWord;
		name = "Richard M.Nixon";
		startWord = true;
		for (i = 0; i < name.length(); i++)
		{
			if (startWord)
				System.out.println(name.charAt(i));
			if (name.charAt(i) == ' ')
				startWord = true;
			else
				startWord = false;

		}
	}
}

