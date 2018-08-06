package first;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ScanIntTest {

    @Test
    public void testScanInputAsString() throws Exception {

        Assert.assertEquals(1234 , new ScanInt().scanInputAsString(new Converter(), "1234"));
    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testForExeption(){
        thrown.expect(NumberFormatException.class);
        new ScanInt().scanInputAsString( new Converter(),"Test12");

    }



    @Test(expected = NumberFormatException.class)
    public void testWrongInput() {
        new ScanInt().scanInputAsString( new Converter(),"Test12");
    }

}