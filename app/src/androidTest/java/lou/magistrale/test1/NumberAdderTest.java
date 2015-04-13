package lou.magistrale.test1;

import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by lou on 13/04/15.
 */
public class NumberAdderTest extends TestCase {

    /*Viene chiamato sempre prima di eseguire un test*/
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Log.d("mydbg_setUp", "Sono nella setUp() NumberAdderTest");

    }

    @SmallTest
    public void testNumberAdder(){
        int result = NumberAdder.addNumber(2,3);
        Log.d("mydbg_setUp", "Sono nella testNumberAdder() NumberAdderTest");
        assertEquals(5, result);
    }

    /*viene chiamata sempre quando i test hanno finito*/
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        Log.d("mydbg_tearDown", "Sono nella tearDown() NumberAdderTest");

    }
}
