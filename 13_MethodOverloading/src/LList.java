import java.util.LinkedList;

public class LList 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(4);
		list.addFirst(100);
		list.addLast(200);
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		} 
	}

}
