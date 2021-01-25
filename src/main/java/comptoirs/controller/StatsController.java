package comptoirs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import comptoirs.dao.CategorieRepository;

@Controller
@RequestMapping(path = "/comptoirs/stats") 
public class StatsController {

	@Autowired 
	private CategorieRepository dao;
	
	@GetMapping(path = "produitsPourCategorie")
	/**
	 * Affiche la page des statistiques "unités vendues par produit
	 * en lui transmettant la liste des catégories
	 */
	public	String montreStatsProduits(Model model) {
		model.addAttribute("categories", dao.findAll());
		return "statsProduitsPourCategorie";
	}	
}
	