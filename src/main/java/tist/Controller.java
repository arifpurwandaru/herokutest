package tist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/test")
public class Controller {

	@GetMapping(path="/")
	public String process() throws JsonProcessingException {
		return "helloWorld!";
	}
}
