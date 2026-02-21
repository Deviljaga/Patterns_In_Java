import java.util.*;

public class Collection {
    public static void main(String[] args) {
    //     ArrayList<Integer> intA = new ArrayList<>();
    //     intA.add(123);
    //     intA.add(124);
    //     intA.add(125);
    //     intA.add(126);
    //     intA.add(127);
    //     System.out.println(intA);
    //     intA.remove(Integer.valueOf(126));
    //     System.out.println(intA);
    //     System.out.println(intA.contains(129));
    //    intA.clear();
    //    System.out.println(intA);
    //    intA.add(345);
    //    System.out.println(intA);
    
    
    // Stack<Integer> Int= new Stack<>();
    // Int.push(1);
    // Int.push(2);
    // Int.push(3);
    // Int.push(4);
    // System.out.println(Int);
    
    // System.out.println(Int.peek());
    // Int.pop();
    // System.out.println(Int);


    // Queue<Integer> queue = new LinkedList<>();
    // queue.offer(1);
    // queue.offer(2);
    // queue.offer(3);
    // queue.offer(4);
    // System.out.println(queue);
    // System.out.println(queue.peek());
    // queue.poll();
    // System.out.println(queue);

    // ArrayDeque<Integer> adq = new ArrayDeque<>();
    // adq.offer(123);
    // adq.offer(140);
    // adq.offerFirst(1);
    // adq.offerLast(2);
    // System.out.println(adq);


    //  Set<Integer> set = new HashSet<>();
    //  set.add(45);
    //  set.add(26);
    //  set.add(36);
    //  set.add(48);
    //  set.add(48);
    //  System.out.println(set);
    //  System.out.println(set.size());
    //  System.out.println(set.isEmpty());
    //  System.out.println(set.remove(26));
    //  System.out.println(set);


    // Set<Integer> set = new TreeSet<>();
    // set.add(45);
    //  set.add(26);
    //  set.add(36);
    //  set.add(48);
    //  set.add(48);
    //  System.out.println(set);
    //  System.out.println(set.size());
    //  System.out.println(set.isEmpty());
    //  System.out.println(set.remove(26));
    //  System.out.println(set);


    // Map<String, Integer> numbers = new HashMap<>();
    // numbers.put("us", 11);
    // numbers.put("andaman", 12);
    // numbers.put("india", 13);
    // numbers.put("china", 14);
    // System.out.println(numbers);

    // Map<String, Integer> numbers = new TreeMap<>();
    // numbers.put("us", 11);
    // numbers.put("andaman", 12);
    // numbers.put("india", 13);
    // numbers.put("china", 14);
    // System.out.println(numbers);

    int[] numbers = {1,2,3,5,6,9,2,4,0};
    Arrays.sort(numbers);
    for(int i : numbers) {
        System.out.println(i+"  ");
    }

    }
}
