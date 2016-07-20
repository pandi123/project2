import java.util.Scanner;
public class t {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		else if(a==0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("negative");
		}

	}

}
