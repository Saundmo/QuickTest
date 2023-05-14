package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestHooks {
    @Before
    public void beforeDisplayMessage(Scenario sc){
        System.out.println(sc.getName());
    }

    @After
    public void afterDisplayMessage(){
        System.out.println("Test Completed");
    }
}
