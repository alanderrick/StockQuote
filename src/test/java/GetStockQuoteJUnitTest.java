package test.java;

import main.java.GetStockQuote;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Alan Derrick
 * Date: 10/21/12
 * Time: 12:05 PM
 * Purpose: basic test for GetStockQuote
 */
public class GetStockQuoteJUnitTest {

    @Test
            public void basicTest() throws  Exception{
                String symbol = "\"GOOG\"";  // the symbol is returned quoted.
                String quote = GetStockQuote.getQuote(symbol);
                assertTrue("String returned from yahoo starts with symbo", quote.startsWith(symbol));
            }
}
