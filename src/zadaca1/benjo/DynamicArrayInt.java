package zadaca1.benjo;

/**
 * Class DynamicArrayInt
 * @author Amra
 *
 */
public class DynamicArrayInt {

	private int [] array; 
	private int size;     // size of array that we define
	private final int DEFAULT_SIZE=10;
	int counter =0;       // number of elements in array


	/**
	 * Constructor for {@link DynamicArrayInt}
	 */
	public DynamicArrayInt (){
		this.array =  new int[DEFAULT_SIZE];
		this.counter = 0;
	}
	
	/**
	 * Constructor for {@link DynamicArrayInt} if we want specify size of array.
	 * @param size - size of array.
	 */
	public DynamicArrayInt(int size){
		this.array =  new int[size];
		this.counter = 0;
		
	}
	
	/**
	 * Adds value in array ( at the end of array list)
	 * @param value -  value that we want to add.
	 */
	public void add(int value){
		if(counter==array.length){
			resize();
		}
		array[counter] = value;
		counter++;	
		
	}
	
	/**
	 * Adds value in array of index that we forwarded.
	 * @param index - index of element in array.
	 * @param value - value that we forward.
	 */
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

	/**
	 * Private method that id called from method add(int index, int value).
	 * It resize array into double size of array.
	 */
	private void resize() {
		int []temp = new int[array.length*2];
		for (int i=0; i<array.length; i++){
			temp[i]=array[i];
		}
	this.array= temp;
	}
	

	/**
	 * Method that removes element form index we forwarded.
	 * @param index - index taht we want to remove.
	 */
	public void remove(int index){
		for( int i=index; i<counter; i++){
			array[i]=array[i+1];
		}
		counter--;
	}
	
	/**
	 * Method that counts number of elements in array.
	 * @return - number of elements in array.
	 */
	public int getSize(){
		return counter;
	}
	
	/**
	 * Method that checks if array contains value we forwarded.
	 * @param value - value we forwarded.
	 * @return true if contains value or return false if it does not contains value.
	 */
	public boolean contains ( int value){
		boolean contains = false;
		for ( int i=0; i<counter; i++){
			if( array[i]==value){
				return true;
			}
		}
		return contains;
		
	}
	
	/**
	 * Method that returns all elements of array converted to String.
	 */
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