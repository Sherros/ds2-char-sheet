package org.nu.ds2cs;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
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
		
		File outDir = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
		File outFile = new File(outDir, "chartest.json");
		
		try
		{
			// Very simple code to copy a picture from the application's
			// resource into the external file.  Note that this code does
			// no error checking, and assumes the picture is small (does not
			// try to copy it in chunks).  Note that if external storage is
			// not currently mounted this will silently fail.
			OutputStream os = new FileOutputStream(outFile);
			byte[] data = test.toJson().getBytes(Charset.forName("UTF-8"));
			os.write(data);
			os.close();
		}
		catch (IOException e)
		{
			// Unable to create file, likely because external storage is
			// not currently mounted.
			Log.w("ExternalStorage", "Error writing " + outFile, e);
		}
		
		File inFile = new File(outDir, "chartest.json");
		StringBuilder sb = new StringBuilder();
		// FileReader reads text files in the default encoding.
		FileReader fileReader;
		try
		{
			fileReader = new FileReader(inFile);
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null)
			{
				sb.append(line);
			}

			// Always close files.
			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch(IOException ex)
		{
			Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		CharSheet parsed = CharSheet.instantiateFromJson(sb.toString());
		
		Assert.assertEquals(test, parsed);
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