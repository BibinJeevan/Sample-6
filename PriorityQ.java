import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQ
{
 public static void main(String args[])
 {
  PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
  pq.add(10);
  pq.add(30);
  pq.add(40);
  pq.add(80);
  pq.remove(40);
  System.out.println("After Remove:"+pq);
  System.out.println("Poll method:"+pq.poll());
  System.out.println("Final Queue:"+pq);
  System.out.println("Peek method:"  +pq.peek());
 }
}