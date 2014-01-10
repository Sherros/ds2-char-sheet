package org.nu.ds2cs;

import android.app.Activity;
import android.os.Bundle;
import org.nu.ds2cs.data.CharSheet;
import org.nu.ds2cs.data.StartingClass;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sheet_list_item);
		
		CharSheet test = new CharSheet(getApplicationContext(), "Tester McTesterson", StartingClass.DualSwordsman);
    }
}
