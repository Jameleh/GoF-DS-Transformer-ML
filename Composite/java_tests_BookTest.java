import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void shouldReturnBookChapters(){
        Chapter firstChapter = new Chapter("First Chapter");
        Chapter secondChapter = new Chapter("Second Chapter");
        Chapter thirdChapter = new Chapter("Third Chapter");
        Chapter summary = new Chapter("Summary");
        summary.addData(firstChapter);
        summary.addData(secondChapter);
        summary.addData(thirdChapter);

        Page pageOne = new Page("Page one", 1);
        Page pageTwo = new Page("Page two", 2);
        Page pageThree = new Page("Page three", 3);
        Page pageFour = new Page("Page four", 4);
        Page pageFive = new Page("Page five", 5);
        Page pageSix = new Page("Page six", 6);

        firstChapter.addData(pageOne);
        firstChapter.addData(pageTwo);
        secondChapter.addData(pageThree);
        secondChapter.addData(pageFour);
        thirdChapter.addData(pageFive);
        thirdChapter.addData(pageSix);

        Book book = new Book();
        book.setAuthor("Lucas Piazzi");
        book.setAuthor("Composite Design Pattern");
        book.setChapters(summary);

        assertEquals("Summary \n" +
                "  First Chapter \n" +
                "  Page one - Page number: 1 \n" +
                "  Page two - Page number: 2 \n" +
                "  Second Chapter \n" +
                "  Page three - Page number: 3 \n" +
                "  Page four - Page number: 4 \n" +
                "  Third Chapter \n" +
                "  Page five - Page number: 5 \n" +
                "  Page six - Page number: 6 \n ", book.getChapters());

    }

    @Test
    public void shouldReturnNoChaptersException(){
        try {
            Book book = new Book();
            book.getChapters();
            fail();
        } catch (NullPointerException e ) {
            assertEquals("The book has no chapters", e.getMessage());
        }
    }

}