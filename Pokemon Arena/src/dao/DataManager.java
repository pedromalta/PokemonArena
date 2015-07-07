package dao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.os.SystemClock;

/**
 * @author pedromalta
 *
 */
public class DataManager {

	private Context context;
	private SQLiteDatabase database;
	private PlayerDAO trainersDAO;
	private PokemonDAO pokemonDAO;
	private GameDAO gameDAO;
	private CityDAO cityDAO;
	private GymDAO gymDAO;
	
	public DataManager(Context context){
		setContext(context);
		SQLiteOpenHelper openHelper = new OpenHelper(context, "POKEDATABASE", null, 2);
		setDatabase(openHelper.getWritableDatabase());
		
		//this.pokemonDAO = new PokemonDAO(new PokemonTableDefinition(), database);
		//this.gymDAO = new GymDAO(new GymTableDefinition(), database);
		//this.trainersDAO = new TrainersDAO(new TrainersTableDefinition(), database);
		//this.gameDAO = new GameDAO(new GameTableDefinition(), database);
		//this.cityDAO = new CityDAO(new CityTableDefinition(), database);
	}
	
	private void openDb(){
		if(! getDatabase().isOpen()){
			setDatabase(SQLiteDatabase.openDatabase(Environment.getDataDirectory() + "/data/net.clubedocomputador.PokemonArena/databases/POKEDATABASE", null, SQLiteDatabase.OPEN_READWRITE));
		}
	}
	
	public void closeDb() {
		if (getDatabase().isOpen()) {
			getDatabase().close();
	    }
	}

	@SuppressWarnings("unused")
	private void resetDb() {      
		closeDb();
	    SystemClock.sleep(500);
	    openDb();
	}
	
//################## TRAINERS #######################################
/*	
	public Trainers getTrainer(Long id){		
		return getTrainersDAO().get(id);
	}
	
	public Trainers getTrainerByName(String name){
		String[] names = new String[]{name};
		
		return getTrainersDAO().getByClause("name", names);
				//getByClause(" name ='"+name+"'", null, null, null, "1");
	}
	
	public List<Trainers> getTrainersList(){
		return getTrainersDAO().getAll();
	}
	
	public boolean deleteTrainer(Long id){
		if (id == null || id == 0)
			return false;
		boolean result = false;
		getDatabase().beginTransaction();
		result = getTrainersDAO().delete(id);
		getDatabase().setTransactionSuccessful();
		getDatabase().endTransaction();
		return result;
	}
	
	
	public long saveTrainer(Trainers trainer){
		long result = 0;		
		try {
			getDatabase().beginTransaction();
			result = getTrainersDAO().save(trainer);
			getDatabase().setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Erro salvar Trainer");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean updateTrainer(Trainers trainer){
		if (trainer == null || trainer.getId() == 0)
			return false;
		boolean result = false;
		try {
		getDatabase().beginTransaction();
		getTrainersDAO().update(trainer, trainer.getId());
		getDatabase().setTransactionSuccessful();
		result = true;
		} catch (Exception e) {
			System.out.println("Erro update Trainer");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	//################## GAME #######################################	
	
	public long saveGame(Game game){
		long result = 0;		
		try {
			getDatabase().beginTransaction();
			result = getGameDAO().save(game);
			getDatabase().setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Erro salvar Game");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean deleteGame(Long id){
		if (id == null || id == 0)
			return false;
		boolean result = false;
		getDatabase().beginTransaction();
		result = getGameDAO().delete(id);
		getDatabase().setTransactionSuccessful();
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean updateGame(Game game){
		if (game == null || game.getId() == 0)
			return false;
		boolean result = false;
		try {
		getDatabase().beginTransaction();
		getGameDAO().update(game, game.getId());
		getDatabase().setTransactionSuccessful();
		result = true;
		} catch (Exception e) {
			System.out.println("Erro update Game");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public Game getGame(Long id){		
		return getGameDAO().get(id);
	}	
	
	
	//################## GYM #######################################	
	
	public long saveGym(Gym gym){
		long result = 0;		
		try {
			getDatabase().beginTransaction();
			result = getGymDAO().save(gym);
			getDatabase().setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Erro salvar Gym");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean deleteGym(Long id){
		if (id == null || id == 0)
			return false;
		boolean result = false;
		getDatabase().beginTransaction();
		result = getGymDAO().delete(id);
		getDatabase().setTransactionSuccessful();
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean updateGym(Gym gym){
		if (gym == null || gym.getId() == 0)
			return false;
		boolean result = false;
		try {
		getDatabase().beginTransaction();
		getGymDAO().update(gym, gym.getId());
		getDatabase().setTransactionSuccessful();
		result = true;
		} catch (Exception e) {
			System.out.println("Erro update Gym");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public Gym getGym(Long id){		
		return getGymDAO().get(id);
	}	
	
	//################## CITY #######################################	
	
	public long saveCity(City city){
		long result = 0;		
		try {
			getDatabase().beginTransaction();
			result = getCityDAO().save(city);
			getDatabase().setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Erro salvar Gym");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean deleteCity(Long id){
		if (id == null || id == 0)
			return false;
		boolean result = false;
		getDatabase().beginTransaction();
		result = getCityDAO().delete(id);
		getDatabase().setTransactionSuccessful();
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean updateCity(City city){
		if (city == null || city.getId() == 0)
			return false;
		boolean result = false;
		try {
		getDatabase().beginTransaction();
		getCityDAO().update(city, city.getId());
		getDatabase().setTransactionSuccessful();
		result = true;
		} catch (Exception e) {
			System.out.println("Erro update City");
			e.printStackTrace();
		}		
		getDatabase().endTransaction();
		return result;
	}
	
	public City getCity(Long id){		
		return getCityDAO().get(id);
	}	
	
*/	
	
	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}
	public SQLiteDatabase getDatabase() {
		return database;
	}
	public void setDatabase(SQLiteDatabase database) {
		this.database = database;
	}
	public PlayerDAO getTrainersDAO() {
		return trainersDAO;
	}

	public void setTrainersDAO(PlayerDAO trainersDAO) {
		this.trainersDAO = trainersDAO;
	}
	public PokemonDAO getPokemonDAO() {
		return pokemonDAO;
	}
	public void setPokemonDAO(PokemonDAO pokemonDAO) {
		this.pokemonDAO = pokemonDAO;
	}

	public GameDAO getGameDAO() {
		return gameDAO;
	}

	public CityDAO getCityDAO() {
		return cityDAO;
	}

	public void setCityDAO(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	public GymDAO getGymDAO() {
		return gymDAO;
	}

	public void setGymDAO(GymDAO gymDAO) {
		this.gymDAO = gymDAO;
	}

	public void setGameDAO(GameDAO gameDAO) {
		this.gameDAO = gameDAO;
	}
	
	
	
}

