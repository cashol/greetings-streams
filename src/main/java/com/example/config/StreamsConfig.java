package com.example.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}