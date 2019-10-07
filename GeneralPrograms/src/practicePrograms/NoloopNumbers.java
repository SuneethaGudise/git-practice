package practicePrograms;

public class NoloopNumbers {
	public static void noloopNum(int num)
	{
		if(num>0) {
			noloopNum(num-1);
			System.out.println(num + " ");
		}
		return ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        noloopNum(10);
	}

}
