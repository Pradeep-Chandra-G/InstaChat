package app.pradeep.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The main class for the Chat App application.
 */
@SpringBootApplication
@RestController
public class ChatAppApplication{

	@RequestMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(ChatAppApplication.class, args);
	}

}
