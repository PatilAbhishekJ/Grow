package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<String> fruitList=new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Pineapple");
        fruitList.add("Banana");

        for(String fruit:fruitList)
            System.out.println("Names of fruits are: "+fruit);
    }
}
