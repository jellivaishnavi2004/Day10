//wth retrun value,with argument


import java.util.Scanner;
class Demo{
public void displayMenu()
{
System.out.println("+-Addition");
System.out.println("-:Subtraction\n* :Multiplication");
System.out.println("/:division");
}
public void add(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a,int b)
{
int res=a-b;
return res;
}
}
class Test2{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}

