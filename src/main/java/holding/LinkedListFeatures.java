package holding;
//: holding/LinkedListFeatures.java
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

/*
 * Deque:poll(),element,peek(),push(),pop(),getFirst(),getLast(),removeFirst(),removeLast(),pollFirst(),pollLast(),addFirst(),addLast(),
 */
public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
    print(pets);
    // Identical: getFirst()和element完全一样，返回列表的头（第一个元素）而并不移除，如果list为空抛出NoSuchElementException
    print("pets.getFirst(): " + pets.getFirst());
    print("pets.element(): " + pets.element());
    // Only differs in empty-list behavior:   列表为空返回null;
    print("pets.peek(): " + pets.peek());
    System.out.println("****************************************************************");
    // Identical; remove and return the first element:
    print("pets.remove(): " + pets.remove());
    print("pets.removeFirst(): " + pets.removeFirst());
    // Only differs in empty-list behavior:
    print("pets.poll(): " + pets.poll());    
    print(pets);
    System.out.println("****************************************************************");
    pets.addFirst(new Rat());
    print("After addFirst(): " + pets);
    pets.offer(Pets.randomPet());
    print("After offer(): " + pets);
    pets.add(Pets.randomPet());
    print("After add(): " + pets);
    pets.addLast(new Hamster());
    print("After addLast(): " + pets);
    print("pets.removeLast(): " + pets.removeLast());
    
  }
} /* Output:
[Rat, Manx, Cymric, Mutt, Pug]
pets.getFirst(): Rat
pets.element(): Rat
pets.peek(): Rat
pets.remove(): Rat
pets.removeFirst(): Manx
pets.poll(): Cymric
[Mutt, Pug]
After addFirst(): [Rat, Mutt, Pug]
After offer(): [Rat, Mutt, Pug, Cymric]
After add(): [Rat, Mutt, Pug, Cymric, Pug]
After addLast(): [Rat, Mutt, Pug, Cymric, Pug, Hamster]
pets.removeLast(): Hamster
*///:~
