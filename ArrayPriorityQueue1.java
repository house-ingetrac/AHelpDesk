/*
Team YEA -- Henry Zheng, Jesse Sit, Fabiola Radosov
APCS2 pd3
HW32 -- Getting Past the Velvet Rope
2017-04-20
*/

import java.util.ArrayList;
    
public class ArrayPriorityQueue1<T> implements Comparable<T>{
    
    ArrayList<T> PQueue;
    
    public ArrayPriorityQueue(){
	PQueue = new ArrayList<T>();
    }

    public void add (T x){
	if (isEmpty() || x.compareTo(PQueue.get(PQueue.size() - 1)) < 0){
	    PQueue.add(x);
	}
	else{
	    for (int i = 0; i < PQueue.size(); i++){
		if (x.compareTo(PQueue.get(i)) >= 0){
		    PQueue.add(i, x);
		    break;
		}
	    }
	}
    }

    public boolean isEmpty(){
	return PQueue.size() == 0;
    }

    public T peekMin(){
	return PQueue.get(PQueue.size() - 1);
    }

    public T removeMin(){
	return TPQueue.remove(PQueue.size() - 1);
    }

    public String toString(){
	String retStr = "";
	for (int x = 0; x < PQueue.size(); x++){
	    retStr += PQueue.get(x) + ", ";
	}
	return retStr;
    }	
    
    public static void main(String[] args){
	ArrayPriorityQueue<T> yea = new ArrayPriorityQueue<T>();
	System.out.println(yea.isEmpty());
	yea.add(0);
	yea.add(2);
	yea.add(3);
	yea.add(2);
	yea.add(1);
	System.out.println(yea);
	System.out.println(yea.peekMin());
	System.out.println(yea.removeMin());
	System.out.println(yea);
    }
}
