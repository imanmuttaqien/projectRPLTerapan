package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Anggota extends Model {
	@Required
	String nama;
	@Required
	String alamat;
	@Required
	String pendidikan;
	
	public String toString() {
	      return Nama;
	   }
	
}