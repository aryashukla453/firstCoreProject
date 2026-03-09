package firstCoreProject;
/* Logical Operators
 * &&,||,! */
public class CoreOperator4 {
public static void main(String[] args) {
	int age=21;
	boolean HaveId=true;
	if (age>=18&&HaveId) {
		System.out.println("APPROVED");
	} else {
System.out.println("Not approved");//shortcut=  Sysout  .
	}
	if (age>=18||HaveId) {
		System.out.println("APPROVED");
	} else {
System.out.println("Not approved");
	}
	Not();
}
static public void Not() {
	boolean Network= false;
	if (!Network) {
		System.out.println("No internet");
	} else {
System.out.println("Connected to internet");
	}
}

}
