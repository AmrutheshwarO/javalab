import java.util.*;
public class Prog12_LL{
    LinkedList<String> names= new LinkedList<>();
    public void addName(String str){
        names.add(str);
    }
    public void disp(){
        Iterator iterator= names.iterator();
        if(names.isEmpty()){
            System.out.println("Linked list is empty.");
        }
        else{
            while(iterator.hasNext()){
                String str= iterator.next().toString();
                if(str.length()>=5)
                    System.out.println(str);
            }
        }
    }
}