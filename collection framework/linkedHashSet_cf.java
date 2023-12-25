import java.util.Set;
import java.util.LinkedHashSet;

//elements maintain their order in LinkedHashSet
//wheares in HashSet elements are Unordered
class LearnLinkedHashSet{
    public static void main(String args[]){

    Set<Integer> linkHashSet = new LinkedHashSet<>();

    linkHashSet.add(10);
    linkHashSet.add(20);
    linkHashSet.add(30);
    linkHashSet.add(40);
    linkHashSet.add(50);

    //all methods are same as HashSet
    System.out.println(linkHashSet);

    }
}