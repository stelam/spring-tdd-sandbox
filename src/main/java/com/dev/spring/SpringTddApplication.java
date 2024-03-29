package com.dev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringTddApplication {

	class Message {
		private String message;

		public Message(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	@RequestMapping(path = "/echo/{message}", method= RequestMethod.GET)
	public Message echo(@PathVariable("message") String message) {
		return new Message(message);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTddApplication.class, args);
	}
}