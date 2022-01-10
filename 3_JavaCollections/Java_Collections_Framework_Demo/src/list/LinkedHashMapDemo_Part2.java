package list;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo_Part2{
    public static void main(String[] args){
        Map<Integer, Book> map=new LinkedHashMap<Integer,Book>();
        Book b1=new Book(001,"Philosopher's Stone","JK Rowl","ABC",1996);
        Book b2=new Book(002,"Chamber of Secrets","JK Rowl","ABC",1997);
        Book b3=new Book(003,"Prisoner of Azkaban","JK Rowl","ABC",1998);
        Book b4=new Book(004,"Goblet of Fire","JK Rowl","ABC",1998);
        Book b5=new Book(005,"Order of Phenoix","JK Rowl","ABC",1999);
        Book b6=new Book(006,"Half Blood Prince","JK Rowl","ABC",2000);
        Book b7=new Book(007,"Deathly Hallows","JK Rowl","ABC",2001);

        map.put(2,b2);
        map.put(3,b3);
        map.put(7,b7);
        map.put(6,b6);
        map.put(5,b5);
        map.put(1,b1);
        map.put(4,b4);

        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println("Book no. "+ key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
