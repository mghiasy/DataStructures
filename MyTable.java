package DataStructure;

public class MyTable {
	private Entry[] entries;
	
	public MyTable() {
		this.entries = new Entry[26];
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		int index = (int)c - 97;
		return entries[index].toString();
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		Entry e = new Entry(c,s);
		int index = (int)c - 97;
		entries[index]=e;
		
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String ret="";
		for (Entry entry : entries) {
			if (entry != null) ret += entry.toString()+"\n";
		}
		return ret;
	}
	
	
	private class Entry {
		private char key;
		private String value;

		Entry(char ch,String str){
			this.key=ch;
			this.value=str;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			return this.key + " -> "+this.value;
		}
	}
	
	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
	}

}