package models;
import java.util.Date;

import javax.persistence.Entity;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class sum extends Model {
	@Required
	@MaxSize(25) 
	public int x;
	@Required
	@MaxSize(25)
	public int y;
	
public int toInt() {
	      return x+y;
	   }
}