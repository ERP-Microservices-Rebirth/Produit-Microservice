package tn.esprit.microservice.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.microservice.entity.Produit;
import tn.esprit.microservice.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService {

	private static final Logger l = LogManager.getLogger(ProduitServiceImpl.class);

	@Autowired
	ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduit() {
		// TODO Auto-generated method stub
		List<Produit> produits = produitRepository.findAll();
		System.out.println("ttttttttt"+produits);
		for (Produit produit : produits) {
			l.info("user +++" + produit);
		}
		return produits;
	}


	@Override
	public Produit addProduit(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(String id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);		
	}

	@Override
	public Produit updateProduit(String id, Produit produit) {
		// TODO Auto-generated method stub
		if (produitRepository.findById(id).isPresent()) {
			Produit produitExistant = produitRepository.findById(id).get();
			produitExistant.setNom_produit(produit.getNom_produit());
			produitExistant.setDescription(produit.getDescription());
			produitExistant.setPrixActuel(produit.getPrixActuel());
			produitExistant.setQuantite(produit.getQuantite());
			return produitRepository.save(produitExistant);
		} else return null;
	}

	@Override
	public Produit retrieveProduit(String id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();
	}
}
