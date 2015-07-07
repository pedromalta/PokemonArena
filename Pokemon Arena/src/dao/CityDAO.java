package dao;

import java.util.List;

import model.City;
import android.database.sqlite.SQLiteDatabase;

public class CityDAO extends DroidDao<City> {

	private CityTableDefinition tableDefinition;

	public CityDAO(SQLiteDatabase database) {
		/**
		 * Create a instance of Dao class, setting the model, definition of
		 * model and the database
		 */

		this.database = database;
		this.tableDefinition = new CityTableDefinition();

		setArrayColumns(getTableDefinition().getArrayColumns());
		setTableName(getTableDefinition().getTableName());
		setFieldDefinition(getTableDefinition().getFieldDefinition());
		//createInsertStatement(getTableDefinition().getTableName(),
		//		getTableDefinition().getArrayColumns());
		if (getInsertStatement().trim() != "") {
			statement = this.database.compileStatement(getInsertStatement());

		}
	}

	public CityTableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(CityTableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	@Override
	public City get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(City object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(City object, long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
