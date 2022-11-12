package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	@GetMapping({ "/", "/index", "/home" })
	public String getIndex() {

		return "/index";
	}

	@GetMapping("/obj1")
	public String getObj1() {

		return "obj1";
	}

	@GetMapping("/obj2")
	public String getObj2() {

		return "obj2";
	}
	
	@GetMapping("/obj3")
	public String getObj3() {

		return "obj3";
	}
	
	@GetMapping("/obj4")
	public String getObj4() {

		return "obj4";
	}
	
	@GetMapping("/obj5")
	public String getObj5() {

		return "obj5";
	}
	
	@GetMapping("/obj6")
	public String getObj6() {

		return "obj6";
	}
	
	@GetMapping("/obj7")
	public String getObj7() {

		return "obj7";
	}
	
	@GetMapping("/obj8")
	public String getObj8() {

		return "obj8";
	}
	
	@GetMapping("/obj9")
	public String getObj9() {

		return "obj9";
	}
	
	@GetMapping("/obj10")
	public String getObj10() {

		return "obj10";
	}
	
	@GetMapping("/obj11")
	public String getObj11() {

		return "obj11";
	}

	@GetMapping("/obj12")
	public String getObj12() {

		return "obj12";
	}
	
	@GetMapping("/obj13")
	public String getObj13() {

		return "obj13";
	}

	@GetMapping("/obj14")
	public String getObj14() {

		return "obj14";
	}

	@GetMapping("/obj15")
	public String getObj15() {

		return "obj15";
	}
	
	@GetMapping("/obj16")
	public String getObj16() {

		return "obj16";
	}
	
	@GetMapping("/obj17")
	public String getObj17() {

		return "obj17";
	}
	
	@GetMapping("/obj18")
	public String getObj18() {

		return "obj18";
	}

	@GetMapping("equipo")
	public String getEquipo() {

		return "equipo";
	}

	@GetMapping("/queHacemos")
	public String getQueHacemos() {

		return "queHacemos";
	}
	
	@GetMapping("/minas")
	public String getMinas() {

		return "minas";
	}
	
	@GetMapping("/quimica")
	public String getQuimica() {

		return "quimica";
	}

}