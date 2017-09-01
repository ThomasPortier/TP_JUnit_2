package fr.codevallee;

import java.util.ArrayList;
import java.util.List;

public class Pile {
	List<String> listeDeLaPile = new ArrayList<String>();
	private int taille;

	public void push(String Item) {
		listeDeLaPile.add(Item);
	}

	public void pop() {
		listeDeLaPile.remove(taille-1);
	}

	public void popAll() {
		listeDeLaPile.clear();
	}

	public Object peek() {
		return listeDeLaPile.get(taille-1);
	}

	public Pile() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public int getTaille() {
		return taille = listeDeLaPile.size();
	}

	public Pile(int taille) {
		// super();
		this.taille = taille;
	}
}
