package odev3;

public class UserManager {
	private User user;

	public void logIn(User user) {
		System.out.println(user.getUserName() + " isimli kullan�c� sisteme giri� yapt�.");
	}

	public void logOut(User user) {
		System.out.println(user.getUserName() + " isimli kullan�c� sisteme ��k�� yapt�.");
	}
}
