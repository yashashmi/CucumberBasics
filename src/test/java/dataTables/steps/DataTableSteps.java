package dataTables.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.*;

public class DataTableSteps {

	@When("I use this as simple DataTable")
	public void i_enter_user_details_as(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> userInfo = dataTable.asLists();

		// userInfo.get(0).get(0) - This would be the header of columns

		System.out.println("****I use this as simple DataTable****\n");
		
		System.out.println("The first userName: " + userInfo.get(1).get(0));
		System.out.println("The first password: " + userInfo.get(1).get(1));
		System.out.println("The first confirm password: " + userInfo.get(1).get(2));

		System.out.println("The second userName: " + userInfo.get(2).get(0));
		System.out.println("The second password: " + userInfo.get(2).get(1));
		System.out.println("The second confirm password: " + userInfo.get(2).get(2));
	}

	@When("I use this DataTable with Custom Type")
	public void i_use_this_data_table_with_custom_type(List<UserInfo> userInfo) {
		
		
		System.out.println("\n\n****I use this DataTable with Custom Type****\n");
		System.out.println("The first userName: " + userInfo.get(0).getUserName());
		System.out.println("The first password: " + userInfo.get(0).getPassword());
		System.out.println("The first confirm password: " + userInfo.get(0).getConfirmPassword());

		System.out.println("The second userName: " + userInfo.get(1).getUserName());
		System.out.println("The second password: " + userInfo.get(1).getPassword());
		System.out.println("The second confirm password: " + userInfo.get(1).getConfirmPassword());
	}

	@DataTableType
	public UserInfo getEntries(Map<String, String> entry) {
		return new UserInfo(entry.get("userName"), entry.get("password"), entry.get("confirmPassword"));
	}

	@When("I use this DataTable but columns transposed")
	public void i_use_this_data_table_but_columns_transposed(@Transpose List<UserInfo> userInfo) {

		System.out.println("\n\n****I use this DataTable but columns transposed****\n");
		System.out.println("The first userName: " + userInfo.get(0).getUserName());
		System.out.println("The first password: " + userInfo.get(0).getPassword());
		System.out.println("The first confirm password: " + userInfo.get(0).getConfirmPassword());

		System.out.println("The second userName: " + userInfo.get(1).getUserName());
		System.out.println("The second password: " + userInfo.get(1).getPassword());
		System.out.println("The second confirm password: " + userInfo.get(1).getConfirmPassword());
	}

}
