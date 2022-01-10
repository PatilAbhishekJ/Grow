package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args){
        List<String> linkedList=new LinkedList<String>();
        System.out.println("Initial nodes: "+linkedList);
        linkedList.add("Rahul");
        linkedList.add("Mayank");
        linkedList.add("Pujara");
        linkedList.add("Virat");
        System.out.println("List after adding nodes:"+linkedList);

        linkedList.add(1,"Rohit");
        linkedList.add(2,"Shubman");
        System.out.println("List after adding nodes:"+linkedList);
    }
}
