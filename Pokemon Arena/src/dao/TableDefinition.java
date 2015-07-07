/**
 * @author Douglas Cavalheiro (doug.cav@ig.com.br)
 */

package dao;

import java.lang.reflect.Field;

import android.database.sqlite.SQLiteDatabase;

public abstract class TableDefinition<T> {
        
        protected String TABLE_NAME;
        protected String PK;
        protected StringBuilder COLUMNS;
        protected String[] ARRAY_COLUMNS;
        protected Field[] FIELD_DEFINITION;
        protected StringBuilder CREATE_STATEMENT;
        protected StringBuilder FOREIGN_KEY;
        protected final Class<T> model;
        protected Class<?> OBJECT;
        protected TableDefinition<?> singleton;
        
        /**Creates a new instance setting a model class to build a definition table */
        public TableDefinition(Class<T> model){
                this.singleton = this;
                this.model = model;
                try {
                        OBJECT = Class.forName(model.getName());
                        createTableDefinition();
                } catch (Exception e) {
                        e.printStackTrace();
                }               
        }
        
        /**Build a DDL instruction for create table with fields*/
        public abstract void createTableDefinition() throws Exception;               
   
        
        /**Uses the create DLL to create table*/
        public abstract void onCreate(SQLiteDatabase db) throws Exception;
        
        /**Upgrade (if necessary) the table*/
        public abstract void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);
        
        public String getTableName() {
                return TABLE_NAME;
        }

        public StringBuilder getColumns() {
                return COLUMNS;
        }

        public void setColumns(StringBuilder columns) {
                this.COLUMNS = columns;
        }

        public String[] getArrayColumns() {
                return ARRAY_COLUMNS;
        }

        public Field[] getFieldDefinition() {
                return FIELD_DEFINITION;
        }
        
        public String getPK() {
                return PK;
        }

        @SuppressWarnings("rawtypes")
		public TableDefinition getInstance(){
                return singleton ;
        }
        
        

        
}
