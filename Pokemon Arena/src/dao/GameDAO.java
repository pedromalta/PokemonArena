package dao;

import model.Game;

import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;

import android.database.sqlite.SQLiteDatabase;

public class GameDAO extends DroidDao<Game, Integer> {

	public GameDAO(TableDefinition<Game> tableDefinition,
			SQLiteDatabase database) {
		super(Game.class, tableDefinition, database);
	}

}
