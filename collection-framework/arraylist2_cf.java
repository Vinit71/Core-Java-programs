import java.util.ArrayList;

class NumberList{

    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);

    //to check if a value is present or not in the list
    boolean check = list.contains(15);  //true or false
    System.out.println(check);

    //update an element in the list
    list.set(1, 111);

    // System.out.println(list);
    
    }
}
