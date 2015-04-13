package lou.magistrale.test1;

import android.util.Log;

/**
 * Created by lou on 13/04/15.
 */
public class NumberPow {

    public NumberPow(){}

    public static int powNumber(int n){
        Log.d("mydbg", Integer.toString(n * n));
        return n*n;
    }
}
