package dao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class OpenHelper extends SQLiteOpenHelper {

	

	public OpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onOpen(SQLiteDatabase db) {
		super.onOpen(db);
	      if (!db.isReadOnly()) {
	    	  db.execSQL("PRAGMA foreign_keys=ON;");
	      }
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		try{
			PokemonTableDefinition pk = new PokemonTableDefinition(); pk.onCreate(db);	 		
			GymTableDefinition gy = new GymTableDefinition(); gy.onCreate(db);
			PlayerTableDefinition tr = new PlayerTableDefinition(); tr.onCreate(db);
			GameTableDefinition gm = new GameTableDefinition(); gm.onCreate(db);
			CityTableDefinition ct = new CityTableDefinition(); ct.onCreate(db);
		}catch(Exception e){
			System.out.println("onCreate Helper");
			e.printStackTrace();
		}
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		try{
			PokemonTableDefinition pk = new PokemonTableDefinition(); pk.onUpgrade(db, oldVersion, newVersion);	
			PlayerTableDefinition tr = new PlayerTableDefinition(); tr.onUpgrade(db, oldVersion, newVersion);
			GameTableDefinition gm = new GameTableDefinition(); gm.onUpgrade(db, oldVersion, newVersion);
			CityTableDefinition ct = new CityTableDefinition(); ct.onUpgrade(db, oldVersion, newVersion);
			GymTableDefinition gy = new GymTableDefinition(); gy.onUpgrade(db, oldVersion, newVersion);
		}catch(Exception e){
			System.out.println("onUpgrade Helper");
			e.printStackTrace();
		}
		
	}

}
