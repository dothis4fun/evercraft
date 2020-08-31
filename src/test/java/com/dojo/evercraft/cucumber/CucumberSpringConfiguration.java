package com.dojo.evercraft.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
properties = {"$bossServerUrl=http://localhost:8089"})
public class CucumberSpringConfiguration {
}
