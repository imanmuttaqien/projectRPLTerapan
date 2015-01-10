package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

//import play.data.validation.Required;
//import play.db.jpa.Model;

@Entity
public class Mahasiswa extends Model {
	//@Required
	public String nama;
	//@Required
	public String alamat;
	//@Required
	public String pendidikan;
	public Date tgllhr;
    public String kodepos;
    @ManyToOne
    public JenisKelamin kelamin;
    
    public void setNama(String nama){
      this.nama=nama;
    }
	public String toString() {
	      return nama;
	   }
	
}