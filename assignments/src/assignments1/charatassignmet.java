package assignments1;

public class charatassignmet {
	public static void main(String[] args) {
		String s = "STRUCTURE";
		int n = s.length();
		System.out.println("length os string is " + s + n);
		// char c= s.charAt(n);
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			// int a = s.indexOf(c);
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				char c1 = s.charAt(j);
				// int b= s.indexOf(j);
				if (c == c1) {
					count++;
				}

			}
			if (count > 1)
				System.out.println(c + "-" + count);
			// System.out.println(c);
			// int x= s.indexOf(i);

		}

	}
}
