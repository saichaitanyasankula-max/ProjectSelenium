package collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Qpractice {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue();
		
		//The default capicity of the priority Que is 11
		
		//in this priority Que we are going to have the head and tail
		
		//head is going to conatiain the lowest value which is going to have the highest priority
		
		//addition - oofer,add
		pq.offer(11);
		pq.offer(12);
		pq.offer(8);
		pq.offer(6);
		pq.add(20);
		
		System.out.println(pq);
		
		while(!pq.isEmpty())
		{
			System.out.println(pq);
			break;
		}
		
		
		//retrivel - peek
		System.out.println(pq.peek());
		
		//if the priority collection is empty we are going to ge the null value
		
		//removal - poll,remove
		// if we are removing the element when the priority is empty then we will get the exception
//		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
//		
//		System.out.println(p.remove());
		//in the priority queue if we add the elements it is going to start from the tail, and when we are removing it starts from head
		
		ArrayDeque<String> ad=new ArrayDeque();
		
		//in this array deque we can add and delete the elements in head and as well as tail also
		//in array deque we are having extra methods
		//addition-offer,offerFirst,OfferLast,add,addFirst,addLast
		System.out.println("================Adding the elements==============");
		ad.offer("Kiwi");
		ad.add("Apple");
		ad.addFirst("Banana");
		ad.offerFirst("Grapes");
		ad.addLast("orange");
		ad.offerLast("PineApple");
		
		System.out.println(ad);
		
		System.out.println("================retriving the elements==============");
		System.out.println(ad);
		//retrivel - peek,peekfirst,peeklast
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println("================Removing the elements==============");
		//remove - poll,pollFirst,pollLast,remove,removeFirst,removeLast
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		System.out.println(ad);
		//ArrayDeque - insertion order is maintained
		
		
		
		
		
		
		
		
	}
}
