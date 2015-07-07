package dao;

import model.Gym;

import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;

import android.database.sqlite.SQLiteDatabase;

public class GymDAO extends DroidDao<Gym, Integer> {

	public GymDAO(TableDefinition<Gym> tableDefinition,
			SQLiteDatabase database) {
		super(Gym.class, tableDefinition, database);
	}
	
	

}
