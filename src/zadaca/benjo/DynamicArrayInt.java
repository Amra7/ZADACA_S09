package zadaca.benjo;

/**
 * Class DynamicArrayInt
 * @author Amra
 *
 */
public class DynamicArrayInt {

	private int [] array; 
	private int size;
	private final int DEFAULT_SIZE=10;
	int counter =0;


	public DynamicArrayInt (){
		this.array =  new int[DEFAULT_SIZE];
		this.counter = 0;
	}
	
	public DynamicArrayInt(int size){
		this.array =  new int[size];
		this.counter = 0;
		
	}
	
	public void add(int value){
		if(counter==array.length){
			resize();
		}
		array[counter] = value;
		counter++;	
		
	}
	
	public void add(int index, int value){
		if(counter==size){
			resize();
		}
		for ( int i = counter+1; i>index; i--){
			array[i] = array[i-1];
		}
		array[index] = value;
		counter++;
	}

	private void resize() {
		int []temp = new int[array.length*2];
		for (int i=0; i<array.length; i++){
			temp[i]=array[i];
		}
	this.array= temp;
	}
	

	public void remove(int index){
		for( int i=index; i<counter; i++){
			array[i]=array[i+1];
		}
		counter--;
	}
	
	public int getSize(){
		return counter;
	}
	
	public boolean contains ( int value){
		boolean contains = false;
		for ( int i=0; i<counter; i++){
			if( array[i]==value){
				return true;
			}
		}
		return contains;
		
	}
	
	public String toString(){
		String str="";
		str += "[";
		for ( int i=0; i<counter; i++){
		    str += array[i];
		    if ( i!= counter -1){
				str +=", ";
			}
		}
		str += "]";
		
		return str;
	}
	
	
}