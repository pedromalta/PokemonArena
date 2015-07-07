package dao;

import model.Gym;

import android.database.sqlite.SQLiteDatabase;

public class GymTableDefinition extends TableDefinition<Gym>{

	public GymTableDefinition() {
		super(Gym.class);		
	}
	
	public void createTableDefinition() throws Exception {

	}

	/** Uses the create DLL to create table */
	public void onCreate(SQLiteDatabase db) throws Exception {
		if (CREATE_STATEMENT != null) {
			db.execSQL(CREATE_STATEMENT.toString());
		} else {
			throw new Exception("Table not created, the Create DDL not found");
		}
	}

	/** Upgrade (if necessary) the table */
	public void onUpgrade(SQLiteDatabase db, int oldVersion,
			int newVersion) {
		try {
			db.execSQL("DROP TABLE IF EXISTS " + this.TABLE_NAME);
			onCreate(db);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
