package odev3;

public class UserManager {
	private User userName;
	
	public void logIn(String userName) {
		System.out.println(userName + " isimli kullan�c� sisteme giri� yapt�.");
	}

	public void logOut(String userName) {
		System.out.println(userName + " isimli kullan�c� sisteme ��k�� yapt�.");
	}
}
