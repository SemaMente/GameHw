package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println("The user named " + user.getFirstName() + " has been added.");

	}

	@Override
	public void update(User user) {
		System.out.println("The user named " + user.getFirstName() + " has been updated.");

	}

	@Override
	public void delete(User user) {
		System.out.println("The user named " + user.getFirstName() + " has been deleted.");

	}

}
