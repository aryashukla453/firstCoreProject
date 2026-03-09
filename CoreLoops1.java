package firstCoreProject;

public class CoreLoops1 {
public static void main(String[] args) {
	/*java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("enter the value for variable");
	int start=sc.nextInt();
	System.out.println("enter the vaalue for condition");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		System.out.println(i);
	}
	sc.close();*/
	
	
	/*java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("enter the start value");
	int start=sc.nextInt();
	System.out.println("enter the end value");
	int end=sc.nextInt();
	System.out.println("enter the conditional operator <,>");
	char op=sc.next().charAt(0);
	System.out.println("enter the update operator +,-,++,--");
	String update=sc.next();
	int step=1;
	if(update.equals("+")||update.equals("-")) {
		System.out.println("enter the value of step");
		step=sc.nextInt();
	}
	System.out.println("output\n");
	if(op=='<'&& update.equals("++")) {
		for(int i=start;i<end;i++) {
			System.out.println(i);
		}
	}else if(op=='<'&& update.equals("+")) {
		for(int i=start;i<end;i+= step) {
			System.out.println(i);
		}
	}else if(op=='>'&& update.equals("--")) {
		for(int i=start;i>end;i--) {
			System.out.println(i);
		}
	}else if(op=='>'&& update.equals("-")){
		for(int i=start;i>end;i-=step) {
			System.out.println(i);
		}
	}else {
		System.out.println("invalid combination");
	}
sc.close();*/
	
	/*for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}*/
	
	
	/*for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}*/
	
	/*for(int i = 1;i<=5;i++) {
		for(int j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}*/
	
	/*eSystem.out.println();
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=6-i;j++) 
			System.out.print(" ");
		
		for(int k=1;k<=2*i-1;k++) 
			System.out.print("*");
		
		System.out.println();
		}

	
	for(int i = 6; i >= 1; i--) {

        for(int j = 1; j <= 6 - i; j++)
            System.out.print(" ");

        for(int k = 1; k <= 2 * i - 1; k++)
            System.out.print("*");

        System.out.println();
    }*/
	
	
	
     //single outer loop
	for(int i=1; i <= 2 * 5 - 1 ;i++) {
	//decide row value
		int row =(i<=5)?i:(2*5-i);
		// spaces
		for(int j=1;j<=5-row;j++)
			System.out.print(" ");
		//stars
		for(int k=1;k<=2*row-1;k++)
			System.out.print("*");
		
		System.out.println();
		
	}

	
	
	
	
	
}
}	

		
	
	
	


