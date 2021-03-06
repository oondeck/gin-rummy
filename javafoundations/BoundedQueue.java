/* Olivia Ondeck and Ngina Kariuki 
 * CS230: Assignment 7-Task 2: While My Guitar Gently Weeps
 * 1 April 2016
 * BoundedQueue.java
 * Inherits from CircularArrayQueue.java
 * Methods: constructor, isFull, enqueue overriding CircularArrayQueue's enqueue
 * */
package javafoundations;

public class BoundedQueue<T> extends CircularArrayQueue<T> {
  
  private int capacity; //indicates how full the queue can get
  
  //constructor: creates BoundedQueue with a given capacity 
  public BoundedQueue (int c) {
    capacity=c;
  }
  
  //predicate method indicating whether the queue is at capacity 
  public boolean isFull() {
    return this.size()==capacity; 
  }
  
  /*overrides CircularArrayQueue enqueue method by only
   * enqueuing when the queue has empty slots */
  public void enqueue (T element) {
    if (!isFull()) super.enqueue(element);
    else System.out.println("Queue is at capacity, element was not added.");
  }
  
  public String toString() {
    return super.toString();
  }
  
  //testing method 
  public static void main (String[] args) {
    
    BoundedQueue<String> q1 = new BoundedQueue<String>(2);
    q1.enqueue("comp");
    q1.enqueue("me");
    q1.dequeue();
    q1.enqueue("cmop");
    q1.enqueue("Two");
    System.out.println(q1 + "\n");
    q1.enqueue("Three"); //should not allow enqueuing!
    System.out.println(q1);
    
  }
  
  
  
  
  
  
  
}