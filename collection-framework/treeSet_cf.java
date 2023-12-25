import java.util.Set;
import java.util.TreeSet;

//In TreeSet all 'elements are unique' and in sorted form
class LearnTreeSet{
public static void main(String args[]){

    Set<Integer> tset = new TreeSet<>();

    tset.add(10);
    tset.add(20);
    tset.add(30);
    tset.add(30); //duplicate element will not print or available
    tset.add(50);

    System.out.println(tset);
}
}