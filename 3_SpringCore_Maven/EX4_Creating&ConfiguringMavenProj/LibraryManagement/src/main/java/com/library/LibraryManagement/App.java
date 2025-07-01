package com.library.LibraryManagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import com.library.service.BookService;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       BookService bookservice = (BookService) context.getBean("bookService");
       
       bookservice.service();
    }
}

