package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	@GetMapping({ "/", "/index", "/home" })
	public String getIndex() {

		return "/index";
	}

	@GetMapping("/obj7")
	public String getObj7() {

		return "obj7";
	}

	@GetMapping("/obj12")
	public String getObj12() {

		return "obj12";
	}

	@GetMapping("/obj15")
	public String getObj15() {

		return "obj15";
	}

	@GetMapping("equipo")
	public String getEquipo() {

		return "equipo";
	}

	@GetMapping("/iniciativa")
	public String getIniciativa() {

		return "iniciativa";
	}

	@GetMapping("/queHacemos")
	public String getQueHacemos() {

		return "queHacemos";
	}

}