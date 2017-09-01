package fr.codevallee;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Element;

import java.util.Iterator;

public class Pile {
	String taille;

	List<Object> unePile = new ArrayList<Object>();

	public void push(Object Item) {
		unePile.add(Item);
	}

	public void pop() {
		//
		int lastIndex = unePile.size() - 1;
		unePile.remove(lastIndex);
	}

	public void popAll() {
		unePile.clear();
	}

	public Object peek(Object Item) {
		return unePile.get(unePile.size() - 1);
	}

	public Pile() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Pile(String taille) {
		// super();
		this.taille = taille;
	}
}
