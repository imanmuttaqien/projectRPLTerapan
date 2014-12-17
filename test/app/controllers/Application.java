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
	
	public static void verifikasi(@Required Anggota agt){
		if (validation.hasErrors()){
			flash.error("Hei ada error");
			index();
		}
		render(agt);	
	}
}
