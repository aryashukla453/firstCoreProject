package firstCoreProject;
/*public class CoreOop1Class {
/*int id;
String name;
void display() {
	System.out.println("the id is:"+id+"\n"+"name is:"+name);}
	public static void main(String[] args) {
		CoreOop1Class s1 = new CoreOop1Class();
		CoreOop1Class s2= new CoreOop1Class();
		s1.id=101;
		s2.id=102;
		s1.name="Arya";
		s2.name="aayushi";
		s1.display();
		s2.display();
	}


	
	
	}*/
/*class Emp{
	void m() {
		System.out.println("hello employee");
	}
	String name ="Adhiraj";//data member,field,class level variable,state
	int salary;
	String cname;
	void show() {
	System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		System.out.println("hello main");
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		a.m();
		a.show();
		b.show();
		c.show();
		d.show();
		a.input("arya shukla",100,"abc");
		b.input("ab",112,"asdd");
		c.input("aba",1112,"asxcdd");
		d.input("abb",11112,"ascvdd");
		a.show();
		b.show();
		c.show();
		d.show();
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("total salary:"+total);
		a.m();
	}
	}*/
/*class employee{
	private String name;
	private int salary=9000;
	private String cname;
	public void show() {
		System.out.println(name+" "+salary+" "+cname);
		
	}
	void input(String n,int s,String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		employee a=new employee();
		employee b=new employee();
		employee c=new employee();
		employee d=new employee();
		a.input("Cheetha",256000,"abc");
		b.input("arya",356000,"asbc");
		c.input("boss",276000,"abfc");
		d.input("thala",2567000,"fgabc");
		a.show();
		b.show();
		c.show();
		d.show();
	}
}*/


/*class employee{
	private String name;
	private int salary;
	private String cname;
	public void show() {
		System.out.println(name+" "+salary+" "+cname);
		
	}
	void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enteer the employee's details");
		System.out.println("salary: ");
		salary=sc.nextInt();
		System.out.println("name:");
		name=sc.next();
		System.out.println("company name:");
		cname=sc.next();
		sc.close();
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		employee a=new employee();
		employee b=new employee();
		employee c=new employee();
		employee d=new employee();
		a.input();
		b.input();
		c.input();
		d.input();
		a.show();
		b.show();
		c.show();
		d.show();
	}
}*/


//// STATIC VARIABLE


/*class employee{
	String name;
	int salary;
	static String cname="ABC";
	void show() {
		System.out.println(name+""+salary+""+cname);
		
	}
	public void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		System.out.println(employee.cname);
		employee a =new employee();
		employee b =new employee();
		employee c =new employee();
		employee d =new employee();
		a.show();
		b.show();
		c.show();
		d.show();
		a.input(null, 0);
		b.input(null, 0);
		c.input(null, 0);
		d.input(null, 0);
		a.cname="asdf";///allowed
		employee.cname="xyz";
	}
}*/

////STATIC METHOD



/*public class CoreOop1Class{
	int x=90;
	static int y=90;
	public static void main(String[] args) {
		System.out.println(y);
		System.out.println(CoreOop1Class.y);
		CoreOop1Class obj=new CoreOop1Class();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(new CoreOop1Class().x);
	}
}*/


///STATIC BLOCK


/*class animal{
	String name;
	int age;
	static String color;
	void show() {
		System.out.println(name+" "+age+" "+color);
	}
	void input(String n,int a) {
		name=n;
		age=a;
	}
	static void display() {
		System.out.println("hi animal");
		System.out.println(color);
	}
	static {
		color="green";
		System.out.println("hello animal");
		System.out.println(color);
	}
}
	public class CoreOop1Class{
		public static void main(String[] args) {
			System.out.println("hello main");
			animal.color="red";
			animal a=new animal();
			animal b=new animal();
			animal c=new animal();
			
			a.input("dog",4);
			b.input("cat",6);
			c.input("tiger",9);
			
			a.show();
			b.show();
			c.show();
		}
		static {
			System.out.println("hello");
		}
	}*/


/*class b{
	static {
		System.out.println("hello b");
	}
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	static {
		System.out.println("hi b");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		b b1=new b();
		b b2=new b();
		b1.show();
		b2.show();
		System.out.println("bye main");
	}
}*/

/*class c{
	static {
		System.out.println("hello c");
	}
	String x;
	static {
		System.out.println("ok c");
	}
	static int y;
	static {
		System.out.println("hi c");
		System.out.println(y);
	}
}
public class CoreOop1Class{
	static int g=90;
	public static void main(String[] args) {
		System.out.println(g);
		CoreOop1Class ss=new CoreOop1Class();
		System.out.println(ss.g);
		System.out.println("hello main");
		c c1=new c();
		c c2=new c();
		System.out.println("bye main");
	}
}*/

/*class kk{
	static {
		System.out.println("hello c");
	}
	String x;
	static int y;
	static {
		System.out.println("hi c");
		System.out.println(y++);
	}
	void m() {
		x=y++ +"ram";
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		System.out.println(kk.y);
		kk k1=new kk();
		kk k2=new kk();
		System.out.println("hello main");
		k1.m();
		k2.m();
		k1.m();
		System.out.println(k1.x+" "+k1.y);
		System.out.println(k2.x+""+k2.y);
	}
}*/



///// CONSTRUCTOR-chaining

/*class emp{
	String name;
	int age;
	String cname;
	int salary;
	void show() {
		System.out.println(name+" "+age+" "+cname+" "+salary);
	}
	emp(String n,int s){
		name=n;
		salary=s;
	}
	emp(String n,int s,String c,int a){
		this(n,s);
		cname=c;
		age=a;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		emp a1=new emp("gogo",89000);
		emp a2=new emp("ram",95000,"abc",23);
		a1.show();
		a2.show();
	}
}*/


/*class employee{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	/// 1st constructor created//////
	employee(String n,int a){///paramatrized constructor///
	this();
		System.out.println("hello employee");
		name=n;
		age=a;
	}
	///// 2nd connstructor created//////
	employee(){///no-args constructor///
		System.out.println("hi employee");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		employee a1=new employee("gogo",5);
		employee a2=new employee();
		a1.show();
		a2.show();
	}
}*/

/*class vehicle{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	vehicle(String n,int a){
		this("Audi a4");
		System.out.println("hello vehicle");
		name=n;
		age=a;
	}
	vehicle(String n){
		this();
		System.out.println("ok vehicle");
		name=n;
	}
	vehicle(){
		System.out.println("hi vehicle");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		vehicle v=new vehicle("BMW x1",10);
		v.show();
	}
}*/

/*class a{
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	a(String a ,int b){
		this();
		System.out.println("hello a");
		x=a;
		y=b;
	}
	a(String a){
		this("kk",10);
		System.out.println("ok a");
		x=a;
	}
	a(){
		System.out.println("hi a");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		a aa=new a("gg");
		aa.show();
	}
}*/


/////constructor////

/*class animal{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	//// constructor called
	animal(){
		name="dog";
		age=3;
		System.out.println("hello animal");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		animal a1=new animal();
		animal a2=new animal();
		animal a3=new animal();
		a1.show();
		a2.show();
		a3.show();
	}
}*/


/*class human{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	human(String n,int a){
		System.out.println("hello human");
		name=n;
		age=a;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		human a1=new human("arya shukla",21);
		human a2=new human("aayushi rathore",25);
		a1.show();
		a2.show();
	}
}*/



/*class bird{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	bird(){
		System.out.println("hello bird");
	}
	bird(String n,int a){
		System.out.println("hello bird");
		name=n;
		age=a;
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		bird a1=new bird("parot",5);
		bird a2=new bird("egle",2);
		bird a3=new bird();
		a1.show();
		a2.show();
		a3.show();
	}
}*/
/////initilize block////

/*class person{
	{
		System.out.println("universal");
	}
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	person(){
		System.out.println("hello person");
		name="ram";
		age=10;
	}
	{
		System.out.println("ok");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		person p1=new person();
		person p2=new person();
		person p3=new person();
		p1.show();
		p2.show();
		p3.show();
	}
}*/


/*class human{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	/////constructor created/////
	human(String n,int a){
		System.out.println("hello human");
		name=n;
		age=a;
	}
	////2nd constructor created/////
	human(){
		System.out.println("hi");
	}
	///initilized block////
	{
		System.out.println("universal");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		human p1=new human("gogo",45);
		human p2=new human("arya",21);
		p1.show();
		p2.show();
	}
}*/



/*class animal{
	String name;
	int age;
	void show() {
		System.out.println(name+""+age);
	}
	////constructor created////
	animal(String n,int a){
		this();
		System.out.println("hello animal");
		name=n;
		age=a;
	}
	///2nd constructor/////
	animal(){
		System.out.println("hi animal");
	}
	////initilized block////
	{
		System.out.println("universal");
	}
}
public class CoreOop1Class{
	public static void main(String[] args) {
		animal p1=new animal("hyena  ",12);
		p1.show();
	}
}*/








