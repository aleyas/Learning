package first;

import junit.framework.TestCase;
import org.junit.Test;

public class ConverterTest extends TestCase {
    @Test
    public void testConcatenate() {
        assertEquals("onetwo", new Converter().concatenate("one","two"));
    }
    @Test
    public void testBackingNumber() {
        assertEquals(131, new Converter().backingNumber("131"));
    }
}