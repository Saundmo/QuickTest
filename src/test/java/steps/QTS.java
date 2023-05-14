package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import java.util.List;
import java.util.Map;

public class QTS {

    @Given("^User enters Credentials to LogIn$")
    public void user_enters_credentials_to_log_in(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.entries();
        System.out.println("The user name is:" + data.get(1).get("username"));
        System.out.println("The Password is:" + data.get(0).get("password"));
        System.out.println("User notes:" + data.get(0).get("comment"));
    }
}
