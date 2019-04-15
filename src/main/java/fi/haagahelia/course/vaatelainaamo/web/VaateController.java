package fi.haagahelia.course.vaatelainaamo.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.course.vaatelainaamo.domain.KayttajaRepository;
import fi.haagahelia.course.vaatelainaamo.domain.Vaate;
import fi.haagahelia.course.vaatelainaamo.domain.VaateRepository;
//pääsy Viewiin
@Controller
public class VaateController {	
	@Autowired  //injektoidaan repostori-olio (otetaan käyttöön, portti auki)
	private VaateRepository repository; 
	
    
    @RequestMapping(value="/login")
    public String login() {	
        return "login";
    }	
	
    
    //ottaa yhteyden viewiin
    @RequestMapping(value="/vaatelainaamo")
    public String vaatelainaamo (Model model){
    	model.addAttribute("vaatteet", repository.findAll());
    	return "vaatelainaamo";
    }
    
    
	//toteutettu RESTin avulla REST (RepresentationalState Transfer)
    @RequestMapping(value="/vaatteet", method=RequestMethod.GET)
    public @ResponseBody List<Vaate> vaatelainaamoRest (){
        return (List<Vaate>)repository.findAll(); 
    }
    
    @RequestMapping(value = "/lisaa")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String addVaate(Model model){ //alustetaan model, uusi student-olio
    	model.addAttribute("vaate", new Vaate()); 
        return "lisaavaate";
    }     
    
    @RequestMapping(value = "/tallenna", method = RequestMethod.POST)
    public String save(Vaate vaate){
        repository.save(vaate);
        return "redirect:vaatelainaamo";
    
	}
    
    @RequestMapping(value = "/poista/{id}", method = RequestMethod.GET)//lukee polkumuuttujan
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteVaate(@PathVariable("id") Long vaateId, Model model) {
    	repository.deleteById(vaateId);
        return "redirect:../vaatelainaamo";
    }
    
    

}


