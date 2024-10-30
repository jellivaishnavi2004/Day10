import java.util.ArrayList;
class Main{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("java");
languages.add("kotlin");
languages.add("c++");
languages.add("python");
System.out.println("ArrayList:"+languages);
languages.set(2,"java script");
languages.add(1,"c");
System.out.println("Modified ArrayList:"+languages);

}
}