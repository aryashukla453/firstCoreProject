package firstCoreProject;

public class CoreRecursion {

	static int fact(int n) {
		if(n==1||n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
	//	System.out.println("factorial is:\n"+fact(n));
	//	System.out.println("sum of natural no is\n"+sum(n));
		//reverse(n);
		sc.close();
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+sum(n-1);
		}
	}
static void reverse(int n) {
	if(n==0)
		return;
	System.out.print(n%10);
	reverse(n/10);
}

}
