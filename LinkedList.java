import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
List<String>names=new LinkedList<>();
names.add("vaishu");
names.add("chinnu");
names.add("chitti");
System.out.println("List:"+names);
String name=names.get(3);
System.out.println("Acessed Element:"+name);

String removedName=names.remove(1);
System.out.println("Removed element:"+removedName);

}
}