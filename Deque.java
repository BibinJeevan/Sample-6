import java.util.ArrayDeque;
public class Deque
{
 public static void main(String args[])
 {
  ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
  dq.add(20);
  dq.addFirst(15);
  dq.add(34);
  dq.add(45);
  dq.addLast(75);
  System.out.println(dq);
  System.out.println("Pop():"+dq.pop());
  System.out.println("Poll():"+dq.poll());
  System.out.println("Poll First():"+dq.pollFirst());
  System.out.println("Poll Last():"+dq.pollLast());
 }
}