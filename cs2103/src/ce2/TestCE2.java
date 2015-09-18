package ce2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCE2 {
	
	String testMsg = "test1";
	private String fileName = "textfile.txt";
	
	
	@Test
	public void testAdd() {
		ArrayList<String> lst = new ArrayList<String>();
		String[] cmds = {"add",testMsg};
		TextBuddypp.add(cmds, fileName , lst);
		assertEquals(testMsg, lst.get(0));
	}
	
	@Test
	public void testDelete() {
		ArrayList<String> lst = new ArrayList<String>();
		ArrayList<String> lst2 = new ArrayList<String>();
		lst.add(testMsg);
		lst2.add(testMsg);
		lst2.add("potato");
		String[] cmds = {"delete", "2"};
		TextBuddypp.delete(cmds, fileName , lst2);
		assertEquals(lst, lst2);
	}
	
	@Test
	public void testClear() {
		ArrayList<String> lst = new ArrayList<String>();
		ArrayList<String> lst2 = new ArrayList<String>();
		lst2.add(testMsg);
		lst2.add("potato");
		TextBuddypp.clear(fileName , lst2);
		assertEquals(lst, lst2);
	}
	
	
}
