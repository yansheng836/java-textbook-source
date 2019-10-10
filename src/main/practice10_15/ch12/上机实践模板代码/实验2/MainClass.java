package ch12.上机实践模板代码.实验2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
	public static void main(String args[]) {
		List<Book> bookList = new LinkedList<Book>();
		String bookName[] = { "Java基础教程", "XML基础教程", "JSP基础教程", "C++基础教程", "J2ME编程", "操作系统", "数据库技术" };
		double bookPrice[] = { 29, 21, 22, 29, 34, 32, 29 };
		Book book[] = new Book[bookName.length];
		for (int k = 0; k < book.length; k++) {
			book[k] = new Book();
			book[k].setName(bookName[k]);
			book[k].setPrice(bookPrice[k]);
			bookList.add(book[k]);
		}
		Book newBook = new Book();
		newBook.setPrice(29);
		newBook.setName("Java与模式");
		Collections.sort(bookList);
		int m = -1;
		System.out.println("新书:" + newBook.getName() + "(" + newBook.getPrice() + ")与下列图书:");
		while ((m = Collections.binarySearch(bookList, newBook, null)) >= 0) {
			Book bk = bookList.get(m);
			System.out.println("\t" + bk.getName() + "(" + bk.getPrice() + ")");
			bookList.remove(m);
		}
		System.out.println("价钱相同.");
	}
}
