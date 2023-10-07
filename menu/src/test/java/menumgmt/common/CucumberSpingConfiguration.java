package menumgmt.common;

import io.cucumber.spring.CucumberContextConfiguration;
import menumgmt.MenuApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MenuApplication.class })
public class CucumberSpingConfiguration {}
