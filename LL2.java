import java.util.*;
public class LL2
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");  
        System.out.println(list);
        
    }
}