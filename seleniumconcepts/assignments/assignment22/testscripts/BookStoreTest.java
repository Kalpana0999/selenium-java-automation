package com.delta.kalpana.seleniumconcepts.assignments.assignment22.testscripts;

import com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages.BookStoreApplicationPage;
import com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages.BookStoreApplicationLoginPage;
import com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages.AddBookFromBookStore;
import com.delta.kalpana.seleniumconcepts.assignments.assignment22.pages.DeleteAddedBook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTest extends BaseClass {

    @Test
    public void testBookStoreApp() {
        BookStoreApplicationPage bookStoreApplicationPage = new BookStoreApplicationPage(driver);
        bookStoreApplicationPage.goToBookStoreApplication();

        BookStoreApplicationLoginPage bookStoreApplicationLoginPage= new BookStoreApplicationLoginPage(driver);
        bookStoreApplicationLoginPage.loginToBookStoreApp("Kalpana","Kalpana@7");

        AddBookFromBookStore addBookFromBookStore = new AddBookFromBookStore(driver);
        addBookFromBookStore.addBooksToCollection();

        Assert.assertEquals(addBookFromBookStore.actualBook, addBookFromBookStore.expectedBook);

        DeleteAddedBook deleteAddedBook = new DeleteAddedBook(driver);
        deleteAddedBook.deleteBook();
    }
}
