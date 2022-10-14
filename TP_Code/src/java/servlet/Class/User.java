package servlet.Class;

public class User {
	private String login;
	private String MDP;
	private String email;
	
	public User(String login, String MDP, String email){
		this.login = login;
		this.MDP = MDP;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMDP() {
		return MDP;
	}
	public void setMDP(String mDP) {
		MDP = mDP;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", MDP=" + MDP + ", email=" + email + "]";
	}
}
