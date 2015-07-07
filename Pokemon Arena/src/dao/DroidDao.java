/**
 * @author Douglas Cavalheiro (doug.cav@ig.com.br)
 */
package dao;

import java.lang.reflect.Field;
import java.util.List;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;


public abstract class DroidDao<T> {
        
        //protected TableDefinition<T> tableDefinition;
        protected String insertStatement;                 
        protected String tableName;
        protected String[] arrayColumns;
        protected Field[] fieldDefinition;
        protected SQLiteDatabase database;
        protected SQLiteStatement statement;
        protected Class<T> model;
        


        /**Delete object*/
        public boolean delete(int id) {
                boolean result = false;
                if(id > 0){
                        try{
                                database.delete(getTableName(), BaseColumns._ID + " = ?", 
                                                new String[] { String.valueOf(id) } );
                                result = true;
                        }catch(Exception e){
                                e.printStackTrace();                            
                        }                       
                }
                return result;
        }

        /**Get a object by id */
        public abstract T get(long id);
        /*{
                T object = null;
                Cursor cursor = database.query(getTableName(), getArrayColumns(), 
                                BaseColumns._ID + " = ?", new String[]{String.valueOf(id)}, null, null, "1");
                if(cursor.moveToFirst()){
                        try {
                                object = dao.buildDataFromCursor(cursor);
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
                if(! cursor.isClosed()){
                        cursor.close();
                }               
                return object;
        }

*/
        /**List all items */
        public abstract List<T> getAll();               
        /*        List<T> objectList = new ArrayList<T>();
                Cursor cursor = database.query(getTableName(), getArrayColumns(), 
                                null, null, null, null, "1");
                if(cursor.getCount() > 0){
                        if(cursor.moveToFirst()){
                                try {
                                        do{
                                                T object = buildDataFromCursor(cursor);
                                                if(object != null){
                                                        objectList.add(object);
                                                }
                                        }
                                        while(cursor.moveToNext());
                                        
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                }               
                if(! cursor.isClosed()){
                        cursor.close();
                }               
                return objectList;
        }
        
        /**List items by clause
        public List<T> getAllbyClause(String clause, String[] clauseArgs, String groupBy, String having, String orderBy) {              
                List<T> objectList = new ArrayList<T>();
                Cursor cursor = database.query(getTableName(), getArrayColumns(), 
                                clause, clauseArgs, groupBy, having, orderBy);
                if(cursor.moveToFirst()){
                        try {
                                do{
                                        T object = buildDataFromCursor(cursor);
                                        if(object != null){
                                                objectList.add(object);
                                        }
                                }
                                while(cursor.moveToNext());
                                
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
                if(! cursor.isClosed()){
                        cursor.close();
                }               
                return objectList;
        }


        /**Get an Object by clause
        public T getByClause(String clause, String[] clauseArgs, String groupBy, String having, String orderBy) {
                T object = null;
                Cursor cursor = database.query(getTableName(), getArrayColumns(), 
                                clause, clauseArgs, groupBy, having, orderBy);
                if(cursor.moveToFirst()){
                        try {
                                object = buildDataFromCursor(cursor);
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
                if(! cursor.isClosed()){
                        cursor.close();
                }               
                return object;
        }
		*/
        /**Saves the Object */
        public abstract Integer save(T object) throws Exception;
        /*{
                statement.clearBindings();
                
                for(int e = 0; e < getArrayColumns().length; e++){
                        for(int i = 0; i < object.getClass().getDeclaredMethods().length; i++){
                                Method method = object.getClass().getDeclaredMethods()[i];
                                if(method.getName().equalsIgnoreCase("get"+getArrayColumns()[e])){
                                        i = object.getClass().getDeclaredMethods().length;
                                        Type type = method.getReturnType();     
                                        try{
                                                if(type == int.class){
                                                        Integer output = (Integer) method.invoke(object);                                               
                                                        statement.bindLong(e+1, output.longValue());
                                                }else if(type == Long.class || type == Short.class || type == long.class){
                                                        Long output = (Long) method.invoke(object);
                                                        statement.bindLong(e+1, output);
                                                }else if(type == Double.class || type == double.class || type == float.class){
                                                        Double output = (Double) method.invoke(object);
                                                        statement.bindDouble(e+1, output);
                                                }else if(type == String.class){
                                                        String output = (String) method.invoke(object);
                                                        statement.bindString(e+1, output);
                                                }else if(type == byte[].class){
                                                        byte[] output = (byte[]) method.invoke(object);
                                                        statement.bindBlob(e+1, output);
                                                }else{
                                                        statement.bindNull(e+1);
                                                }                                               
                                                                                                
                                        }catch(Exception ex){
                                                throw new Exception(" Failed to invoke the method "+method.getName()+", cause:"+ex.getMessage());
                                        }
                                }
                        }

                }
                
                
                return statement.executeInsert();
        }


        /**Update the Object */
        public abstract boolean update(T object, long id) throws Exception;
        /*
                final ContentValues values = new ContentValues();
                
                for(int e = 0; e < getArrayColumns().length; e++){
                        for(int i = 0; i < object.getClass().getDeclaredMethods().length; i++){
                                Method method = object.getClass().getDeclaredMethods()[i];
                                if(method.getName().equalsIgnoreCase("get"+getArrayColumns()[e])){
                                        i = object.getClass().getDeclaredMethods().length;
                                        String outputMethod = method.invoke(object).toString();
                                        values.put(getArrayColumns()[e], outputMethod );
                                }
                        }                       
                }       
                database.update(getTableName(), values, BaseColumns._ID + " = ?", 
                                new String[]{String.valueOf(id)});
        }
            

        /**Build a insert statement to the model
        private void createInsertStatement(String tableName, String[] columns){
                StringBuffer values = new StringBuffer();
                StringBuffer tableColumns = new StringBuffer();
                
                for(int i = 0; i < columns.length; i++){
                        if(i > 0){
                                if(i < columns.length){
                                        values.append(",");
                                        tableColumns.append(",");
                                }
                        }
                        values.append("?");
                        tableColumns.append(columns[i]);
                }               
                setInsertStatement("insert into " + tableName + "(" + tableColumns + ") " + "values ( " + values + ")");
        }
        
        /**Transforms the row in a Object */
        //public abstract T buildDataFromCursor(Cursor cursor) throws Exception;
        /*{
                T object = null;
                
                Field[] fields = getFieldDefinition();                          
                if(cursor != null){
                        object = this.model.newInstance();
                        
                        if(cursor.getColumnName(0).equalsIgnoreCase("_id")){
                                Method[] methods = object.getClass().getMethods();                                      
                                for (int e = 0; e < methods.length; e++){
                                        if(methods[e].getName().trim().equalsIgnoreCase("setId")){      
                                                methods[e].invoke(object, cursor.getLong(0));
                                                e = methods.length;                                             
                                        }                                               
                                }
                        }
                        
                        Method[] methods = object.getClass().getMethods();
                        
                        for(int i = 1; i < cursor.getColumnCount(); i++){                               
                                
                                try{                                            
                                                                                                        
                                        for (int e = 0; e < methods.length; e++){                                                       
                                                
                                                if(methods[e].getName().trim().equalsIgnoreCase("set"+fields[i-1].getName())){                                                  
                                                        Method method = methods[e]; 
                                                        e = methods.length;
                                                        Type type = method.getParameterTypes()[0];                                
                                                        if(type == int.class){
                                                                method.invoke(object, Long.valueOf(cursor.getLong(i)).intValue() );
                                                        }else if(type == Long.class || type == long.class){
                                                                method.invoke(object, cursor.getLong(i));
                                                        }else if(type == Double.class || type == double.class){
                                                                method.invoke(object, cursor.getDouble(i));
                                                        }else if(type == float.class){
                                                                method.invoke(object, cursor.getFloat(i));
                                                        }else if(type == String.class){
                                                                method.invoke(object, cursor.getString(i));
                                                        }else if(type == Short.class){
                                                                method.invoke(object, cursor.getShort(i));
                                                        }else{
                                                                method.invoke(object, cursor.getBlob(i));
                                                        }
                                                }
                                        }
                                }catch(Exception e){
                                        throw new Exception(" Failed to cast a object, maybe a method not declared, cause:"+e.getMessage()); 
                                }                                                                                               
                        }
                }
                if(object.getClass().getDeclaredFields().length == 0){
                        throw new Exception("Cannot be cast a no field object!");
                }
                return (T) object;
        }*/

		public String getInsertStatement() {
			return insertStatement;
		}



		public void setInsertStatement(String insertStatement) {
			this.insertStatement = insertStatement;
		}



		public String getTableName() {
			return tableName;
		}



		public void setTableName(String tableName) {
			this.tableName = tableName;
		}



		public String[] getArrayColumns() {
			return arrayColumns;
		}



		public void setArrayColumns(String[] arrayColumns) {
			this.arrayColumns = arrayColumns;
		}



		public Field[] getFieldDefinition() {
			return fieldDefinition;
		}



		public void setFieldDefinition(Field[] fieldDefinition) {
			this.fieldDefinition = fieldDefinition;
		}



		public SQLiteDatabase getDatabase() {
			return database;
		}



		public void setDatabase(SQLiteDatabase database) {
			this.database = database;
		}



		public SQLiteStatement getStatement() {
			return statement;
		}



		public void setStatement(SQLiteStatement statement) {
			this.statement = statement;
		}   

}