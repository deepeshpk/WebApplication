package sample;

public class UserDAO {

	public static UserBean login(UserBean bean) {

		String username = bean.getUsername();
		String password = bean.getPassword();

		System.out.println("Your user name is " + username);
		System.out.println("Your password is " + password);

		bean.setValid(true);

		return bean;

	}
}