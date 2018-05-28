package com.prasad.nithin.soap.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

@WebService(endpointInterface="com.prasad.nithin.soap.client.IUserOperations",targetNamespace="np")
public class UserOperations implements IUserOperations {
	private static Map<Integer, User> users = new HashMap<Integer, User>();

	@Override
	public boolean addUser(User p) {
		System.out.println("Adding User Method");
		if (users.get(p.getId()) != null)
			return false;
		users.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		System.out.println("deleteUser Method");
		if (users.get(id) == null)
			return false;
		users.remove(id);
		return true;
	}

	@Override
	public User getUser(int id) {
		System.out.println("getUser Method");
		return users.get(id);
	}

	@Override
	public ArrayList<User> getAllUsers() {
		System.out.println("getAllUsers Method");
		Set<Integer> ids = users.keySet();
		ArrayList<User> list=new ArrayList<>();
		for (Integer id : ids) {
			list.add(users.get(id));
		}
		System.out.println(list.toString());
		return list;
	}
}
