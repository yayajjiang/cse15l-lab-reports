//compile and run commands
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
//static 
import org.junit.*;

public class MarkdownParseOtherTest {
    //declare a test method
    //@Test
    public void addition() {
        //expected and actual values
        assertEquals(2, 1 + 1);
    }

    //@Test
    public void testGetLinks() throws IOException{
        //MarkdownParse.main(["test-file.md"]);
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("https://something.com" ,"some-page.html"), links);
    }

    //@Test
    public void testGetImages() throws IOException{
        //MarkdownParse.main(["test-file.md"]);
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("some-page.html"), links);
    }

    //@Test
    public void testLinks() throws IOException{
        //MarkdownParse.main(["test-file.md"]);
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/" ,"some-page.html"), links);
    }

    //@Test
    public void testGetWithoutParen() throws IOException{
        //MarkdownParse.main(["test-file.md"]);
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents); 
        assertEquals(List.of(), links);
    }

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("snippet1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("google.com, google.com, ucsd.edu"), links);
    }

    
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("snippet2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("a.com, a.com(()), example.com"), links);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("snippet2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParseOther.getLinks(contents); 
        assertEquals(List.of("https://www.twitter.com, https://ucsd-cse15l-w22.github.io/, https://cse.ucsd.edu/"), links);
    }
}
