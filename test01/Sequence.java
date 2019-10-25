package com.peng.test01;


//外部类（集合类） + 内部类（迭代器类）

public class Sequence { // 外部类（代表一个集合类）

	private Object[] items;
	private int next = 0;
	public Sequence( int size ) {
		
		items = new Object[size];
	}

	public void add( Object x ) {
		
		if( next < items.length )
			items[next++] = x;
		
	} 
	
	// 迭代器类：实现了 Selector接口的 内部类
	private class SequenceSelector implements Selector {
		
		private int i = 0;
		public boolean end() { 
			return i == items.length; 
		}
		 public Object current() { 
			 return items[i]; 
		}
		 public void next() {
			 
		   if( i<items.length )
			   ++i;
		 }
	}
	
	public Selector selector() { 
		// 该函数也表明了：内部类也可以向上转型，这样在外部就隐藏了实现细节！
		return new SequenceSelector();
	}
	
	
	public static void main( String[] args ) {
		
		Sequence sequence = new Sequence(10);
		for( int i=0; i<10; ++i ) { // 装填元素
			   sequence.add( Integer.toString(i) );
		
		}
		
		Selector selector = sequence.selector(); // 获取iterator！
		
		while( !selector.end() ) {
			
			System.out.print( selector.current() + " " );
			selector.next();
		
		}
		
	}
}