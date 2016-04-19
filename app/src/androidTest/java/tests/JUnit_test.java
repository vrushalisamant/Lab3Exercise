package tests;
import com.example.vrushalisamant.lab3exercise.MainActivity;
import com.example.vrushalisamant.lab3exercise.R;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by vrushalisamant on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }
    public void test_first(){
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(1.0,2.0),-1.0);
    }
}
