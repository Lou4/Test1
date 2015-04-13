package lou.magistrale.test1;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by lou on 13/04/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Log.d("mydbg_setUp", "Sono nella setUp() MainActivityTest");

        /*Questo metodo fa partire l'activity*/
        activity = getActivity();
    }

    @SmallTest
    public void testTextViewNotNull(){
        Log.d("mydbg_setUp", "Sono nella testTextViewNotNull() NumberAdderTest");
        TextView textView = (TextView) activity.findViewById(R.id.textView);
        assertNotNull(textView);
    }

    /*Il tutorial dice cha la teadDown qua non serve ...*/
}