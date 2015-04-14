package lou.magistrale.test1;

import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by lou on 13/04/15.
 */
public class NumberPowTest extends TestCase{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }



    @SmallTest
    public void testNumberPow(){
        int result  = NumberPow.powNumber(5);
        Log.e("mydbg", "testNumberPow");
        assertEquals("FOOOO", 25, result);
    }



    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
