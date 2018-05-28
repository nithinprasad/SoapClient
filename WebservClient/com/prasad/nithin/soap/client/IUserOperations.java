package com.prasad.nithin.soap.client;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService  
@SOAPBinding(style = Style.RPC) 
public interface IUserOperations {

	@WebMethod public boolean addUser(User p);
		
	@WebMethod public boolean deleteUser(int id);
		
	@WebMethod public User getUser(int id);
		
	@WebMethod public ArrayList<User> getAllUsers();
}
