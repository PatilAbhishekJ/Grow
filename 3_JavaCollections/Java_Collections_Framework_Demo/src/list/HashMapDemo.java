package list;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        Map<Integer,String> studentMap=new java.util.HashMap<Integer,String>();
        studentMap.put(1,"Shami");
        studentMap.put(2,"Bumrah");
        studentMap.put(3,"Ishant");
        studentMap.put(4,"Siraj");

        for(Map.Entry m: studentMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
