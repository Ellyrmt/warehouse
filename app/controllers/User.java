package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class User extends Controller{
	public Result showProfile() {
		return ok(userprofile.render());
	}
}
