package fi.haagahelia.course.vaatelainaamo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.course.vaatelainaamo.domain.VaateRepository;

@Controller 
public class VaateController {
	
	@Autowired
	private VaateRepository repository;
	@RequestMapping("/vaatelainaamo")
	public String VaateLainaamo(Model model) { //lähetä "näyttöön"
		model.addAttribute("vaatteet", repository.findAll()); //model saa uuden attribuutin ja hakee kaikki tiedot tietokannasta
		return "vaatelainaamo";
	}

}
