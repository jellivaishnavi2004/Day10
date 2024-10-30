import java.util.ArrayList;
class Main{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("dog");
animals.add("cat");
animals.add("monkey");
animals.add("lion");
animals.add("hourse");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals)
{
System.out.print(temp);
System.out.print(",");
}
}
}