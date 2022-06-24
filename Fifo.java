import java.util.*;
public class Fifo extends AbstractIntegerBuffer {
	
	Fifo(int s){
		arr = new Integer[s];
	}
	
	Fifo(){
		Random r = new Random();
		int x = r.nextInt(3, 101);
		arr = new Integer[x];
	}
	
	public Integer pop() {
		// throws exception wenn stack schon leer ist
		if (size<1) throw new ArrayIndexOutOfBoundsException();
		
		Integer x = arr[0];
		for(int i=0; i<size; i++) 
			arr[i] = arr[i+1];
		
		size--;
		arr[size] = 0;
		return x;
	}
	public int front() {
		if (this.size()==0) throw new NoSuchElementException();
		return arr[0];
		// p
	}
}