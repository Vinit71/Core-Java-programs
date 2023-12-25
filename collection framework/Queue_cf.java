import java.util.Queue;
import java.util.LinkedList;

class LearnQueue{
    public static void main(String args[]){
        Queue<Integer> ticket = new LinkedList<>(); //queue is implimented by queue

        //to add element in the queue
        ticket.offer(1);
        ticket.offer(2);
        ticket.offer(3);
        ticket.offer(4);

        //to remove elements from queue
        ticket.poll(); // 1 is removed

        //to check peak element or first element in queue
        System.out.println(ticket.peek());

        System.out.println(ticket);


    }
}

/* these methods are same as offer(), peek() and poll() but they throw exception if condition is not satisfied
  add()
  element()
  remove()
*/
