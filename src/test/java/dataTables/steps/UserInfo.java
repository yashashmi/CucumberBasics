package dataTables.steps;

public class UserInfo {

	private String userName;
	private String password;
	private String confirmPassword;

	public UserInfo(String userName, String password, String confirmPassword) {
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

}
