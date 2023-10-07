package menumgmt.common;

import io.cucumber.spring.CucumberContextConfiguration;
import menumgmt.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
