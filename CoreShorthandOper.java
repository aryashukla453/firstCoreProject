package firstCoreProject;
//shorthand operations
public class CoreShorthandOper {
public static void main(String[] args) {
	/*byte a=12;
	a=(byte)(a+5);//a+=5  // a=12+5 = 17
	System.out.println(a);
	int aa=4,bb=5,cc=0;
	aa+=cc-=bb;// aa=4+0=cc cc=0-5 bb=5 ==-1 so aa= -1
	System.out.println(aa);
	System.out.println(bb);
	System.out.println(cc);
	int a1=4,b=5,c=6,d=7;
	d*=a1+b/c;//d=d*(a1+b/c)  //  d=(7*4)+(5/6) = 28
	System.out.println(d);*/
	
	
	/*int a=10,b;
	 b=a++;
	 b=++a;
	System.out.println(b);
	System.out.println(a);
	*/
	
	//int a=10,b;
	//b=a++-5;=a=11,b=5
	//b=a++-a;=a=11,b=-1
	//b=++a-a+a++;=a=12,b=11
	//b=--a+a++-a++-a;=a=11,b=-3
	//b=a--+--a+a--+a++;=a=8,b=33
	//b=a--*a/3+a++%a*5/a--;=a=9,b=34
	//b=--a*a+--a/a--%a++/a--+--a+a*a++%--a+a--;
	//b=a+++a;=a++ +a=  a=11,b=21
	//b=a++-++a;=a=12 ,b=-2
	//b=a+++ ++a;//a++ + ++a= a=12,b=22
	//System.out.println(a);
	//System.out.println(b);
	
	/*int a=10;
	a= a++;
	System.out.println(a);
	int n,i=5;
	n=- -i--;//n= -(-5),i=4
	System.out.println(n);
	System.out.println(i);
	int x=10;
	System.out.println(x++);//10
	System.out.println(x);//11
	int y=10;
	System.out.println(++y);//11
	System.out.println(y);//11*/
	
	//int a=10,b=5;
//boolean c=a++<--b &&++a!=b--;//a=11,b=4,c=false
	//boolean c=a++>--b&&++a==b--;//a=12,b=3,c=false
	//boolean c=a++<--b||++a!=b--;//a=12,b=3,c=true
	//boolean c=a++>--b||++a!=b--;//a=11,b=4,c=true
	
	int a=10,b=5;
	//int c=a<b?a==b?8:6:0;
	//int c=a>b?a==b?8:6:0;
    int c=a++<--b?a==b?a++:b--:--b+a++;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
}
}
