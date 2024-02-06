import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Task2 {
    PriorityQueue<Character> queue = new PriorityQueue<>();

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean isFull(){
        Iterator<Character> iterator = queue.iterator();
        int count = 0;
        while (iterator.hasNext()){
            count++;
        }
        return count == queue.size();
    }

    public void insertWithPriority(Character character){
        queue.add(character);
    }

    public void pullHighestPriorityElement(){
        queue.poll();
    }

    public Character peek(){
        return queue.peek();
    }

    public void show(){
        Iterator<Character> iterator = queue.iterator();
        Arrays.sort(queue.toArray());
        int priority=0;
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " : priority " + priority);
            priority++;
        }
    }
}
