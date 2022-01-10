package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args){
        Set<String> setOfAussies=new HashSet<String>();
        setOfAussies.add("DavidWarner");
        setOfAussies.add("MarcusHarris");
        setOfAussies.add("MarnusLabushagne");
        setOfAussies.add("SteveSmith");
        setOfAussies.add("TravisHead");
        setOfAussies.add("CameronGreen");

        Iterator itr=setOfAussies.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
