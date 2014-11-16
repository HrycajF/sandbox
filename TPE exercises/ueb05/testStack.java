package ueb05;

import org.junit.Test;
import static org.junit.Assert.*;

public class testStack {
	
	@Test
	public void testStack() {
		Stack s = new StackImpl(100);
		
		assertEquals(0, s.size());
		
		s.push("Ich");
		s.push("bin");
		s.push("ein");
		s.push("Stack");
		
		assertEquals(4, s.size());
		
		assertEquals("Stack", s.peek());
		assertEquals("Stack", s.pop());
		
		assertEquals("ein", s.peek());
		assertEquals("ein", s.pop());
		
		assertEquals("bin", s.peek());
		assertEquals("bin", s.pop());
		
		assertEquals("Ich", s.peek());
		assertEquals("Ich", s.pop());
		
		assertNull(s.pop());
	}

}
