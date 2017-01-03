package com.tej.stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NewSessionBean
 */
@Stateful
public class LibrarySessionBean implements LibrarySessionBeanRemote {

	boolean b=false;
	String s=b;
	List<String> bookSelf;
    public LibrarySessionBean() {
        bookSelf = new ArrayList<String>();
    }

	@Override
	public void addBook(String bookName) {
		bookSelf.add(bookName);
		
	}

	@Override
	public List<String> getBooks() {
		return bookSelf;
	}

}
