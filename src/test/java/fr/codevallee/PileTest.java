package fr.codevallee;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PileTest {
	Pile unePile;

	@Before
	public void initialition() {
		unePile = new Pile();
	}

	@Test
	public void pushTest() throws Exception {
		int tailleAvant = unePile.getTaille();
		unePile.push("StringA");
		assertEquals(tailleAvant+1,unePile.getTaille());
	}
	
	@Test
	public void popTest() throws Exception {
		unePile.push("StringA");
		unePile.push("StringB");
		int tailleAvant = unePile.getTaille();
		unePile.pop();
		assertEquals(tailleAvant-1, unePile.getTaille());
	}

	@Test
	public void popAllTest() throws Exception {
		unePile.push("StringA");
		unePile.push("StringB");
		unePile.popAll();
		assertEquals(0,unePile.getTaille());
	}

	@Test
	public void peekTest() throws Exception {
		unePile.push("StringA");
		unePile.push("StringB");
		assertEquals(unePile.listeDeLaPile.get(unePile.getTaille()-1),unePile.peek());
	}

}

/*
 * @Test(expected = PeekException.class) public void peekEmptyPileTest() throws
 * Exception { assertNotNull(pile.peek()); }
 * 
 * 
 * 
 * 
 * @Test(expected = TailleException.class) public void limitedPushushTest()
 * throws Exception { pile.push("String1"); pile.push("String2");
 * pile.push("String3"); }
 * 
 * @Test public void popAllTest() throws Exception { pile.push("String1");
 * pile.push("String2"); pile.popAll(); assertEquals(pile.getSize(), 0, 0.0); }
 */