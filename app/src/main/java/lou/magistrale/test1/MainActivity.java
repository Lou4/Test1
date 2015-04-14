package lou.magistrale.test1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button clickMe;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickMe = (Button) findViewById(R.id.clickMe);
        clickMe.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.textView);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clickMe:
                textView.setVisibility(View.VISIBLE);
                break;

            default:
                Toast.makeText(this, "something went wrong", Toast.LENGTH_LONG).show();
        }
    }
}
