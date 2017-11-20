package strbuildercapacity;

/**
 * This class is used to show how the capacity is changing in StringBuffer and   StringBuilder
 *  if we append the string.
 * @author Praveen
 *
 */
public class StringBuilderCapacity {

	public static void main(String[] args){
		
		//Creating object of StringBuffer class
		StringBuffer strBuffer = new StringBuffer(); 
		
		System.out.println("Showing Capacity changing for String Buffer");
		System.out.println(strBuffer.capacity()); //default Capacity is 16  
		
		strBuffer.append("Hi");  
		System.out.println(strBuffer.capacity());  //Printing Capacity after appending value
		
		strBuffer.append("I love to code in JAVA");  
		System.out.println(strBuffer.capacity());//Capacity changes formula =(initial_capacity*2)+2 
		
		
		//Creating object of StringBuilder class
		StringBuilder strBuilder = new StringBuilder();  
		
		System.out.println("Showing Capacity changing for String Builder");
		System.out.println(strBuilder.capacity());//default capacity is 16  
		
		strBuilder.append("Hi");  //Printing Capacity after appending value
		System.out.println(strBuilder.capacity());  
		
		strBuilder.append("I love to code in JAVA");  
		System.out.println(strBuilder.capacity());//Capacity changes formula=(initial_capacity*2)+2  
	}
}
