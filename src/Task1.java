import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task1 {

    Queue<Character> queue = new PriorityQueue<>();


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

    public void enqueue(Character character){
        queue.add(character);
    }

    public void dequeue(Character character){
        queue.remove(character);
    }

    public void show(){
        Iterator<Character> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
