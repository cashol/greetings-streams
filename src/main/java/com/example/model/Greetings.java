package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Greetings {
  private String message;
  private long timestamp;

  /*
  public Greetings(String message, long timestamp) {
    super();
    this.message = message;
    this.timestamp = timestamp;
  }
  */
}
