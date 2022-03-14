/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    @DisplayName("return object")
    void returnObjectTest () throws IOException {
        Quot quot= App.gsonQuote(1,"quotes.json");
        assertNotNull(quot);
    }

    @Test
    @DisplayName("return specific quote")
    void returnQTest() throws IOException {
        Quot quot=App.gsonQuote(0,"quotes.json");
        Quot quotExp=new Quot("Marilyn Monroe","I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.");

        assertEquals(quotExp.toString(),quot.toString());
    }

    @Test
    @DisplayName("lab9")
    void test(){

    }
}
