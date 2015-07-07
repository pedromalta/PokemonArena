package util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import model.Player;
import android.content.ContextWrapper;

public class PersistUtil {

	private String name = "savegame.sav";

	public void saveGame(ContextWrapper context) {
		try {
			// use buffering
			OutputStream file = new FileOutputStream(context.getFilesDir() + "/" + name);
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try {
				output.writeObject(BDtemp.players);
			} finally {
				output.close();
			}
		} catch (Exception e){
			System.out.println("erro!! ao salvar");
			e.printStackTrace();
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadGame(ContextWrapper context){
		try {
			// use buffering
			InputStream file = new FileInputStream(context.getFilesDir() + "/" + name);
			InputStream buffer = new BufferedInputStream(file);
			ObjectInput input = new ObjectInputStream(buffer);
			try {
				BDtemp.players = (ArrayList<Player>) input.readObject();
			} finally {
				input.close();
			}
		} catch (Exception e){
			System.out.println("erro!! ao carregar");
			//e.printStackTrace();
		}
	}

}
