import java.util.ArrayDeque;
//this is double ended queue
class LearnArrayDeque{
    public static void main(String args[]){
        ArrayDeque<Integer> deq = new ArrayDeque<>();

        //to add/offer elemets
        deq.offerFirst(10); //adds element at starting of the queue

        deq.offer(20);  //this will also add at last
        deq.offer(30);  //this will also add at last

        deq.offerLast(40); // adds element at end of the queue

        System.out.println(deq);

        //remove/poll elements
        deq.pollFirst(); //remove element from start
        deq.pollLast(); //remove element from end

        //to peak 
        System.out.println(deq.peekFirst()); //show first element in queue
        System.out.println(deq.peekLast()); //show last element in queue


    }
}