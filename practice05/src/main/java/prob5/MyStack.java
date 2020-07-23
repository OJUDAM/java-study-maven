package prob5;

public class MyStack<T> {
	private T type;
	private int top;
	int size;
	private String[] buffer;
	private String[] temp;
	
	public MyStack(int size){
		this.size = size;
		buffer = new String[size];
	}
	
	public void push(T t) throws MyStackException{
		if(top==size) {
			size++;
			temp  = new String[size];
			for(int i=0;i<buffer.length;i++) {
				temp[i] = buffer[i];
			}
			buffer = new String[size];
			for(int i=0;i<buffer.length;i++) {
				buffer[i] = temp[i];
			}
			temp=null;
		}
		buffer[top++] = t.toString();
		
	}
	
	public String pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException("Stack is Empty");
		}
		return buffer[--top];
	}
	public boolean isEmpty() {
		if(top==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}