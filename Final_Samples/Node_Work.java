
public class Node_Work {

	/**
	 * @param args
	 */
	public static int rand(){
		int c = 0;
		c = (int) Math.random() * 10;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start, tail, next;
		start = null;
		tail = start;
		for(int t = 0; t < 10; t++){
		next = new Node(rand(), null);
		tail.setNext(next);
		tail = next;
		}
		
	
		
		while(start != null){
			
			System.out.println(start.getItem());
			start.getNext();
		}
	}

}
