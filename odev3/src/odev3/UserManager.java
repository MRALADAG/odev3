package odev3;

public class UserManager {
	private User user;

	public void logIn(User user) {
		System.out.println(user.getUserName() + " isimli kullanýcý sisteme giriþ yaptý.");
	}

	public void logOut(User user) {
		System.out.println(user.getUserName() + " isimli kullanýcý sisteme çýkýþ yaptý.");
	}
}
