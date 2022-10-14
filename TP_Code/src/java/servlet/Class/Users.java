package servlet.Class;

import java.util.ArrayList;
import java.util.List;

public class Users {
	private List<User> users = new ArrayList<User>();
	
	public Users(){
                // valeur random
		users.add(new User("user1","1234","user1@gmail.com"));
                users.add(new User("admin","admin","admin@gmail.com"));
                users.add(new User("alex","azerty","alex@gmail.com"));
		users.add(new User("ali","sesame","ali@gmail.com"));
	}
	
	public boolean appartient(String login, String MDP, String email) {
		for(User forUser : users) {
			if(forUser.getLogin().equals(login) && forUser.getMDP().equals(MDP) && forUser.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
}
