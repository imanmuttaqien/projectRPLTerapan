package controllers;

import play.*;
import play.data.validation.Required;
import play.mvc.*;
import java.util.*;


public class Application extends Controller {

	public static void index() {
	    render();
	}
// Test
	public static void sayHello(@Required String myName) {
		if (validation.hasErrors()){
	   		flash.error("Heit, field nama tidak boleh kosong");
	  		index();
	   	}
		render(myName);
	}
}
