/*
Alessandro Cartegni
APCS2 PD3
HW#32: ArrayPriorityQueue
2017-04-20
*/
import java.util.*;

public class ArrayPriorityQueue<E> {

  private ArrayList< Pdata<E> > data;

  public ArrayPriorityQueue() {
    data = new ArrayList< Pdata<E> >();
  }

  // Traverses through the whole list and adding to the spot proper spot in its priority rating
  public void add(Pdata d) {
    for (int i = 0; i < data.size(); i++) {
      if (d.getPriority() <= (data.get(i).getPriority()) ) {
        data.add(i, d);
        return;
      }
    }
    data.add(d);
  } //O(n)

  //checks the end of the ArrayList
  public E peakMin() {
    return data.get(data.size() - 1).getData();
  } //O(1)

  // removes from the back of the ArrayList
  public E removeMin() {
    E ret = peakMin();
    data.remove(data.size() - 1);
    return ret;
  } //O(1)


  public boolean isEmpty() {
    return data.size() == 0;
  } //O(1)

  public int size() {
    return data.size();
  } //O(1)

  public String toString() {
    String ret = "[";
    for (Pdata x : data) {
      ret += x.getData() + ", ";
    }
    ret += "]";
    return ret;
  } //O(1)

  public static void main(String[] args) {
    ArrayPriorityQueue<Integer> mwahInt = new ArrayPriorityQueue<Integer>();
    for (int i = 0; i <= 20; i++) {
      Pdata as = new Pdata<Integer>((int)(Math.random() * 100), (int)(Math.random() * 100));
      System.out.println(as + " ");
      mwahInt.add(as);
    }
    System.out.println(mwahInt);
    System.out.println("checking removing");
    int siz = mwahInt.size();
    for (int i = 0; i < siz; i++) {
      System.out.print(mwahInt.removeMin() + " ");
    }
    System.out.println();
    //checks if anything still exists in the arrayList
    System.out.println(mwahInt);

    // testing String implementation
    System.out.println(" ---------- String implementation ----------- ");
    ArrayPriorityQueue<String> mwahStr = new ArrayPriorityQueue<String>();
    for (int i = 0; i <= 20; i++) {
      Pdata as = new Pdata<String>((int)(Math.random() * 100), "data" + i);
      System.out.println(as + " ");
      mwahStr.add(as);
    }
    System.out.println(mwahStr);
    System.out.println("checking removing");
    int sizStr = mwahStr.size();
    for (int i = 0; i < sizStr; i++) {
      System.out.print(mwahStr.removeMin() + " ");
    }
    System.out.println();
    //checks if anything still exists in the ArrayList
    System.out.println(mwahStr);

  } //end of main

} //end of ArrayPriorityQueue

//pdata class for storing priority and data
class Pdata<T> {

  //the higher the number the greater the priority
  public int priority;
  public T data;

  public Pdata(int priority, T data) {
    this.priority = priority;
    this.data = data;
  }

  //accessor for data
  public T getData() {
    return data;
  }

  //mutator for Data
  public T setData(T newData) {
    T oldData = data;
    data = newData;
    return oldData;
  }

  //accessor for priority
  public int getPriority() {
    return priority;
  }

  //mutator for priority
  public int setPriority(int newP) {
    int oldP = priority;
    priority = newP;
    return oldP;
  }

  public String toString() {
    return "priority: " + priority + " data: " + data;
  }
} //end of Pdata class
