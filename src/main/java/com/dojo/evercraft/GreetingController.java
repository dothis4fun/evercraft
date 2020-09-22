package com.dojo.evercraft;

import java.util.Collections;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final GameUtility gameUtility;

  public GreetingController(GameUtility gameUtility) {
    this.gameUtility = gameUtility;
  }

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
    return String.format("{ \"message\": \"Hello, %s\"}", name);
  }

  @PostMapping("/gameTime")
  public ResponseEntity<Map<String, Object>> gameTime() {
    return new ResponseEntity<>(Collections.singletonMap("id", gameUtility.createNewGame("name")), HttpStatus.CREATED);
  }
}