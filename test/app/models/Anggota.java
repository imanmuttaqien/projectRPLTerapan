package models;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Anggota extends Model {
  String nama;
  String alamat;
}
