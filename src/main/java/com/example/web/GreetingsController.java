package com.example.web;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Greetings;
import com.example.service.GreetingsService;

@RestController
public class GreetingsController {
  private final GreetingsService greetingsService;

  public GreetingsController(GreetingsService greetingsService) {
    this.greetingsService = greetingsService;
  }

  // http://localhost:8080/greetings?message=hello
  @GetMapping("/greetings")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void greetings(@RequestParam("message") String message) {
    Greetings greetings = Greetings.builder()
        .message(message)
        .timestamp(System.currentTimeMillis())
        .build();
    
    greetingsService.sendGreeting(greetings);
  }
  
  @ExceptionHandler
  void handleIllegalArgumentException(
    IllegalArgumentException e, HttpServletResponse response) throws IOException {
 
    response.sendError(HttpStatus.BAD_REQUEST.value());
  }
}
