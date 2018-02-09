import java.util.*;

public class inventory {
	public static boolean bucket = false;
	public static boolean key = false;
	public static boolean empty = true;
	public static List<String> items = new ArrayList<String>();
	
	public static void setBucket(boolean _item) {
		main.numberItems++;
		bucket = _item;
		items.add("Bucket");
	}
	
	public static void setKey(boolean _item) {
		main.numberItems++;
		key = _item;
		items.add("Key");
	}
	
	public static List<String> getList() {
		
		items.clear();
		if(bucket)
			items.add("Bucket");
		if(key)
			items.add("Key");
		
		return items;
	}
}
