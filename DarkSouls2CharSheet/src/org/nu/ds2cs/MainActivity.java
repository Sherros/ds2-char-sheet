package org.nu.ds2cs;

import android.app.Activity;
import android.content.res.Resources;
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
		setContentView(R.layout.character_sheet);
		
		/*
		CharSheet test = testMethod();
		List<String> testList = new ArrayList();
		testList.add(test.getName());
		testList.add(String.valueOf(test.getSoulLevel()));
		
		List<String>[] testArr = new List[1];
		testArr[0] = testList;
		
		ListAdapter listAdapter = new ArrayAdapter<List<String>>(this, R.layout.character_list_item, testArr);
		setContentView(R.layout.character_list);
		ListView listView = (ListView)findViewById(R.id.characterList);
		listView.setAdapter(listAdapter);
		*/
		
		/*
        setContentView(R.layout.sheet_list_item);
		
		Resources res = getResources();
		startingLevel = res.getInteger(res.getIdentifier(startingClass.key + "_level", "integer", context.getPackageName()));
		int[] startingAttributes = res.getIntArray(res.getIdentifier(startingClass.key + "_attributes", "array", context.getPackageName()));
		CharSheet test = new CharSheet("Tester McTesterson", StartingClass.DualSwordsman, startingLevel, startingAttributes);
		
		TextView name = (TextView)findViewById(R.id.charName);
		TextView level = (TextView)findViewById(R.id.soulLevel);
		
		name.setText(test.getName());
		level.setText(String.valueOf(test.getSoulLevel()));
		*/
    }
	
	public CharSheet testMethod()
	{
		Resources res = getResources();
		int startingLevel = res.getInteger(res.getIdentifier(StartingClass.DualSwordsman.key + "_level", "integer", getPackageName()));
		int[] startingAttributes = res.getIntArray(res.getIdentifier(StartingClass.DualSwordsman.key + "_attributes", "array", getPackageName()));
		CharSheet test = new CharSheet("Tester McTesterson", StartingClass.DualSwordsman, startingLevel, startingAttributes);
		return test;
	}
}