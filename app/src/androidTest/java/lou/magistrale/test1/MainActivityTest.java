package lou.magistrale.test1;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lou on 13/04/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private TextView textView;
    private Button clickMe;
    private View decorView ;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Log.d("mydbg_setUp", "Sono nella setUp() MainActivityTest");

        setActivityInitialTouchMode(true);  //TODO: capire sta funzione cosa fa

        /*Questo metodo fa partire l'activity*/
        activity = getActivity();
        textView = (TextView) activity.findViewById(R.id.textView);
        clickMe = (Button) activity.findViewById(R.id.clickMe);

        decorView = activity.getWindow().getDecorView(); //Recuperiamo la rootView dell'activity

    }

    @SmallTest
    public void testPrecondition(){
        assertNotNull("MainActivity is null", activity);
        assertNotNull("textView is null", textView);
        assertNotNull("button is null", clickMe);


    }


    /*controlliamo che le caratteristiche del bottone siano come me le aspetto*/
    @MediumTest
    public void testButton_integrity(){
        ViewAsserts.assertOnScreen(decorView, clickMe);

        final ViewGroup.LayoutParams layoutParams = clickMe.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals("height non è wrap_content", layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals("width non è wrap_content", layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    @MediumTest
    public void testTextView_integrity(){
        ViewAsserts.assertOnScreen(decorView, textView);    //Controlliamo che esista
        assertTrue(View.INVISIBLE == textView.getVisibility());  //Controlliamo che inizialmente sia GONE.
    }

    @MediumTest
    public void testButton_behavior(){
        TouchUtils.clickView(this, clickMe);
        String labelExpeted = activity.getResources().getString(R.string.hello_world);
        String actualLable = textView.getText().toString();

        assertEquals(labelExpeted, actualLable);    //Controlliamo che dopo il click del bottone la textView abbia la lable che mi aspetto
        assertTrue("La textView non è VISIBLE", View.VISIBLE == textView.getVisibility());   //Controlliamo che la view sia visibile

    }

    /*Il tutorial dice cha la teadDown qua non serve ...*/
}