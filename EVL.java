
public class EVL<T> {
	Listenelement first = null; //zeiger auf erstes listenelement
	int size = 0; //anzahl der listenelemente
	
	
	class Listenelement{
		T data;
		Listenelement next = null;
		
		Listenelement(T o){
			data = o;
		}
		
		public String toString() {
			String s = (String)this.data;
			return s;
		}
	}
	
	
	public void appendLast(T o) {
		Listenelement l = new Listenelement(o);
		if (0==size) {
			first = l;
		}
		else {
			Listenelement tmp = first;
			while(null != tmp.next)
				tmp = tmp.next;
			tmp.next = l;
		}
		size++;
	}
	public String toString() {
		String s = "{";
		Listenelement tmp = first;
		while (null != tmp) {
			if (tmp!= first)
				s = s + ",";
			
			s = s + tmp.data;
			tmp = tmp.next;
		}
		s = s + "}";
		return s;
	}
	
	
	public Listenelement getFirst() {
		return first;
	}
	
	public Listenelement getLast() {
		Listenelement tmp = first;
		while (null!=tmp.next)
			tmp = tmp.next;
		return tmp;
	}
	
	public Listenelement removeLast() {
		Listenelement tmp = first;
		while ((tmp.next).next!=null) 
			tmp = tmp.next;
		Listenelement a = tmp.next;
		tmp.next = null;
		size--;
		return a;
		
	}
	public boolean contains(T e) {
		boolean x = false;
		Listenelement tmp = first;
		while (null!=tmp.next) {
			if (e.equals(tmp.data))
				x = true;
			tmp = tmp.next;
		}
		return x;
	}
	public int size() {
		return this.size;
	}
	
}
