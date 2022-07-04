package com.example.demo.animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinoController {

	@GetMapping("/hello")
	public String helloWorld() {
		return " <html>"
				
				+ "<h1>HELLO</h1>\r\n"
				+ " <head>\r\n"
				+ "<Title> Learning Spring Boot </Title>"
				+ "     <style>\r\n"
				+ "         div {\r\n"
				+ "             width: 300px;\r\n"
				+ "             background-color: #b0e0e6;\r\n"
				+ "         }\r\n"
				+ "     </style>\r\n"
				+ " </head>\r\n"
				+ " <body>\r\n"
				+ "     <div>\r\n"
				+ "         <p> This is an example that I have created using Spring Boot.</p>\r\n"
				+ "         <p> This is a second paragraph.</p>\r\n"
				+ "     </div>\r\n"
				+ " </body>\r\n"
				+ " </html>";
}
}