package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli); // [Yildiz, Ali] add() Queue'dan geldiginden sona ekler
		ciftBasli.addLast("Emine"); // [Yildiz, Ali, Emine] addLast ile Emine sona eklendi
		System.out.println(ciftBasli); // Deque'den gelen ozellik
		
		System.out.println(ciftBasli.pop()); // Yildiz / ilk elemanı siler ve sildiği elemanı consolda gösterir.
		
		System.out.println(ciftBasli); // [Ali, Emine]
		
		ciftBasli.push("Seyfullah"); // push methodu ile Seyfullah başa eklendi
		
		System.out.println(ciftBasli); // [Seyfullah, Ali, Emine]
		
	
		ciftBasli.add(null); // add ile sona null eklendi
		System.out.println(ciftBasli);
		
		ciftBasli.addFirst(null); // addFirst ile başa null eklendi
		System.out.println(ciftBasli);

	}

}