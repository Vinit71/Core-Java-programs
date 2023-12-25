import java.util.Set;
import java.util.HashSet;
class LearnHashSet{

    public static void main(String[] args){
    Set<Integer> hset = new HashSet<>();

    hset.add(10);    
    hset.add(20);    
    hset.add(30);    
    hset.add(40);    

    System.out.println(hset); //**Hash prints in random order**
    

    //remove value
    hset.remove(20);

    System.out.println(hset);

    //checks if a value is present in the queue
    System.out.println(hset.contains(30));

    //checks if set is empty or not
    System.out.println(hset.isEmpty());

    //size of the set
    System.out.println(hset.size());

    //to clear set
    hset.clear();

    System.out.println(hset);
    }
}