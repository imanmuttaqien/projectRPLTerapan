package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Anggota extends Model {
	//@Required
	public String nama;
	//@Required
	public String alamatrumah;
	//@Required
	public String pendidikan;
	public String tgllhr;
    public String kodepos;
    @ManyToOne
    public String kelamin;
    
    public void setNama(String nama){
      this.nama=nama;
    }
	public String toString() {
	      return this.nama;
	   }
    public void setAlamat(String alamatrumah){
      this.alamatrumah=alamatrumah;
    }
	public String toString() {
	      return this.alamatrumah;
	   }
    public void setPendidikan(String pendidikan){
      this.pendidikan=pendidikan;
    }
	public String toString() {
	      return this.pendidikan;
	   }
     public void setJenisKelamin(String kelamin){
     	this.kelamin=kelamin;
     }
     	public String toString() {
     		return this.kelamin;
     	}
     public void setKodepos(String kodepos){
      this.kodepos=kodepos;
    }
	public String toString() {
	      return this.kodepos;
	   }
      public void settgllhr(String tgllhr){
       this.tgllhr=tgllhr;
    }
        public String toString() {
    	      return this.tgllhr;
           }

}
