import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
List<Double>numbers=new ArrayList<>();
numbers.add(70.0);
numbers.add(60.0);
numbers.add(90.0);
System.out.println("List:"+numbers);
double number=numbers.get(2);
System.out.println("Acessed Element:"+number);
double removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
System.out.println("List:"+numbers);

}
}