import java.util.ArrayList;
class StudentsRec{
    public static void main(String st[]){
        // String[] studentName = new String[10];
        // studentName[0] = "Vinit";
        // studentName[1] = "Ajay";
        // System.out.println(studentName[0]);

        //============ArrayList============= 
        ArrayList<Integer> list = new ArrayList<>();
        


        //######## Add method #########
        //this method adds the element at the end of the array
        list.add(1);   //n =10 (Size of the array)
        //size = n + n/2 + 1;
        list.add(3);
        
        //this overloaded method adds element at specific location
        list.add(1, 2);
        //  System.out.println(list);

         ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(4);
         list2.add(5);

         //this method merge two lists
         list.addAll(list2);
        //  System.out.println(list); 



        //########## get method ###########
         //to get a specific element from the list
         System.out.println(list.get(1));



        //########## remove method ###########
        //to remove an element from a index
        list.remove(2);

        //to remove a specific value
        list.remove(Integer.valueOf(4));
        System.out.println(list);
    }
}