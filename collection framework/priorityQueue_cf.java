import java.util.PriorityQueue;
class LearnPriorityQueue{
    public static void main(String args[]){
        //it already gives the priority to the smallest element
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        pqueue.offer(50);
        pqueue.offer(20);
        pqueue.offer(30);
        pqueue.offer(10);
        pqueue.offer(40);

        System.out.println(pqueue); //smallest elements comes first

        pqueue.poll(); //remove 10 as it has the highest priority

        System.out.println(pqueue);

    }
}

//learn Comparators
//Comparator.reverseOrder() - first element will be largest other can be in order
