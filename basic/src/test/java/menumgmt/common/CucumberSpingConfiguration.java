package menumgmt.common;

import io.cucumber.spring.CucumberContextConfiguration;
import menumgmt.BasicApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BasicApplication.class })
public class CucumberSpingConfiguration {}
