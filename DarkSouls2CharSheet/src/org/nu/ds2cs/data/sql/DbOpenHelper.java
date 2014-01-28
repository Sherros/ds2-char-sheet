package org.nu.ds2cs.data.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *
 * @author peter
 */
public class DbOpenHelper extends SQLiteOpenHelper
{
	private static final int SqliteVersion = 3;
	private static final String DatabaseName = "nu_ds2_cs";
	
	private static final String AttributesTableName = "Attributes";
	private static final String CharacterSheetTableName = "CharacterSheet";
	
	private static final String AttributesTableCreate = "CREATE TABLE IF NOT EXISTS " + AttributesTableName + "( "
			+ "id INTEGER PRIMARY KEY ASC, "
			+ "agility INTEGER, "
			+ "attunement INTEGER, "
			+ "dexterity INTEGER, "
			+ "endurance INTEGER, "
			+ "faith INTEGER, "
			+ "intelligence INTEGER, "
			+ "resistance INTEGER, "
			+ "strength INTEGER, "
			+ "vigor INTEGER, "
			+ "vitality INTEGER);";
	private static final String CharacterSheetTableCreate = "CREATE TABLE IF NOT EXISTS " + CharacterSheetTableName + "( "
			+ "id INTEGER PRIMARY KEY ASC, "
			+ "name TEXT, "
			+ "humanity INTEGER, "
			+ "attributesId INTEGER, "
			+ "startingClass TEXT, "
			+ "startingLevel INTEGER, "
			+ "startingAttributesId INTEGER, "
			+ "FOREIGN KEY (attributesId) REFERENCES " + AttributesTableName + "(id), "
			+ "FOREIGN KEY (startingAttributesId) REFERENCES " + AttributesTableName + "(id)";

    DbOpenHelper(Context context) {
        super(context, DatabaseName, null, SqliteVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(AttributesTableCreate);
		db.execSQL(CharacterSheetTableCreate);
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}