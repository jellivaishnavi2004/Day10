// no arguments,no return value



class Demo{
public void displayMenu()
{
System.out.println("+-Addition");
System.out.println("-:Subtraction\n* :Multiplication");
System.out.println("/:division");
}
}
class Test{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
}
}

