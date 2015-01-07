package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.Anggota;


public class Application extends Controller {

	public static void index() {
	    render();
	}
// Test Master
// Test commit branch
// Test setelah Master dan Branch	.......
	
	public static void sayHello(@Required String myName) {
		if (validation.hasErrors()){
	   		flash.error("Heit, field nama tidak boleh kosong");
	  		index();
	   	}
		render(myName);
	}
	
	public static void verifikasi1(@Required String nama, 
			                       @Required String alamat, 
			                       @Required String pendidikan){
		if (validation.hasErrors()){
			flash.error("Hei ada error");
			index();
		}
		render(nama, alamat, pendidikan);	
	}
	
	
	public static void verifikasi(Anggota agt){
		if (validation.hasErrors()){
			flash.error("Hei ada error");
			index();
		}
		render(agt);	
	}
	
	public static int sum(int x, int y){
		System.out.println("sedang menjumlahkan");
		render(x+y);
	}
}
