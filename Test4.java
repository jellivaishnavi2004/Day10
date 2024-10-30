//with retrun value,with array argument


import java.util.Scanner;
class Demo{
public int[] input()
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("please type"+n+"Integer:");
for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}
return arr;
}
public int add(int[] a)
{
int sum=0;
for(int i=1;i<a.length;i++)
{
sum +=a[i];
}
return sum;
}
}
class Test4{
public static void main(String args[]){
Demo  ob=new Demo();
int[] array=new int[5];
array=ob.input();
int res=ob.add(array);
System.out.println(res);
}
}
