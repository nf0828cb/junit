package junit.tutorial.ex01.e05;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		
		ItemStock itemStock = new ItemStock();
		Item cd = new Item("CD",500);
		Item dvd = new Item("DVD",1000);
		
		System.out.println("CDの在庫は" + itemStock.getNum(cd) + "枚です");
		
		itemStock.add(cd);
		System.out.println("CDの在庫は" + itemStock.getNum(cd) + "枚です");
		
		itemStock.add(cd);
		System.out.println("CDの在庫は" + itemStock.getNum(cd) + "枚です");
		
		itemStock.add(dvd);
		System.out.println("DVDの在庫は" + itemStock.getNum(dvd) + "枚です");
		
		
	}

}
