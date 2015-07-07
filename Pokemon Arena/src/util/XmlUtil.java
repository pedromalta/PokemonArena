package util;

import java.io.FileReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map.Entry;

import model.Attack;
import model.Specie;

import org.xmlpull.v1.XmlSerializer;

import android.os.Environment;
import android.util.Xml;
import enums.Attacks;
import enums.Types;

public class XmlUtil {
	
	
	public String XmlSpecies(List<Specie> species){
        XmlSerializer serializer = Xml.newSerializer();
        StringWriter writer = new StringWriter();
        try {
            serializer.setOutput(writer);
            serializer.startDocument("UTF-8", true);
            serializer.startTag("", "species");
            for (Specie spc: species){
                serializer.startTag("", "specie");
	                serializer.attribute("", "id", spc.getId().toString());
	                
	                serializer.startTag("", "name");
	                	serializer.text(spc.getName());
	                serializer.endTag("", "name");
	                
	                serializer.startTag("", "image");
	                	serializer.text(spc.getImage().toString());
	                serializer.endTag("", "image");
	                
	                serializer.startTag("", "pointCost");
	                	serializer.text(spc.getPointCost().toString());
	                serializer.endTag("", "pointCost");
	                
	                serializer.startTag("", "stats");
		                serializer.startTag("", "maxHP");
		                	serializer.text(spc.getMaxHP().toString());
		                serializer.endTag("", "maxHP");
		                serializer.startTag("", "maxAttack");
	                		serializer.text(spc.getMaxAttack().toString());
	                	serializer.endTag("", "maxAttack");
	                	serializer.startTag("", "maxDefense");
	                		serializer.text(spc.getMaxDefense().toString());
	                	serializer.endTag("", "maxDefense");
	                	serializer.startTag("", "maxSpeed");
	                		serializer.text(spc.getMaxSpeed().toString());
	                	serializer.endTag("", "maxSpeed");
	                	serializer.startTag("", "maxSpecial");
	                		serializer.text(spc.getMaxSpecial().toString());
	                	serializer.endTag("", "maxSpecial");
	                serializer.endTag("", "stats");
	
	                
	                serializer.startTag("", "types");
		                for (Types type: spc.getTypes()){
		                	serializer.startTag("", "type");
		                		serializer.text(type.name());
		                	serializer.endTag("", "type");
		                }
	                serializer.endTag("", "types");
	                
	                serializer.startTag("", "attacks");
	                	for (Entry<Integer, Attacks> ma: spc.getMappedAttacks().entrySet()){
	                		serializer.startTag("", "attack");
	                		serializer.attribute("", "id", ma.getValue().toString());
	                		serializer.attribute("", "level", ma.getKey().toString());
	                		serializer.endTag("", "attack");
	                	}
	                serializer.endTag("", "attacks");
	                
	                if (spc.getEvolution() != null){
		                serializer.startTag("", "evolution");
		                	serializer.attribute("", "id", spc.getEvolution());
		                	serializer.startTag("", "level");
		                		serializer.text(spc.getEvolutionLevel().toString());
		                	serializer.endTag("", "level");	                	
		                serializer.endTag("", "evolution");
	                }
	            serializer.endTag("", "specie");
            }
            serializer.endTag("", "species"); 
            serializer.endDocument();
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }
	
	public String XmlAttacks(List<Attack> attacks){
        XmlSerializer serializer = Xml.newSerializer();
        StringWriter writer = new StringWriter();
        try {
            serializer.setOutput(writer);
            serializer.startDocument("UTF-8", true);
            serializer.startTag("", "attacks");
            for (Attack atk: attacks){
                serializer.startTag("", "attack");
	                serializer.attribute("", "id", atk.getId().toString());
	                
	                serializer.startTag("", "name");
	                	serializer.text(atk.getName());
	                serializer.endTag("", "name");
	                
	                serializer.startTag("", "type");
	                	serializer.text(atk.getType().name());
	                serializer.endTag("", "type");
	                
	                serializer.startTag("", "accuracy");
                		serializer.text(atk.getAccuracy().toString());
                	serializer.endTag("", "accuracy");
                	
	                serializer.startTag("", "base");
                		serializer.text(atk.getBase().name());
                	serializer.endTag("", "base");
                	
                	serializer.startTag("", "pp");
            			serializer.text(atk.getPp().toString());
            		serializer.endTag("", "pp");
            		
            		serializer.startTag("", "critical");
            			serializer.text(atk.getCritical().toString());
            		serializer.endTag("", "critical");
                	
            		if (atk.getModifier() != null){
	            		serializer.startTag("", "modifier");
	            			serializer.text(atk.getModifier().name());
	            		serializer.endTag("", "modifier");
            		}
            		
            		if (atk.getStatusChange() != null){
	            		serializer.startTag("", "statusChange");
	            			serializer.text(atk.getStatusChange().name());
	            		serializer.endTag("", "statusChange");
	            		
	            		serializer.startTag("", "statusChangeMeter");
	        				serializer.text(atk.getStatusChangeMeter().toString());
	        			serializer.endTag("", "statusChangeMeter");
            		}
                          
	            serializer.endTag("", "attack");
            }
            serializer.endTag("", "attacks"); 
            serializer.endDocument();
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }
	
	public Specie objectSpecies(Integer id, String fileName){
		try{
			FileReader f = new FileReader(Environment.getExternalStorageDirectory().getPath() + "/" + fileName);
	    	f.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return new Specie();
	}

}
