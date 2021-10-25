package tn.esprit.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.microservice.entity.Produit;


@Service
public interface IProduitService {
	List<Produit> retrieveAllProduit();
	Produit addProduit(Produit produit);
	void deleteProduit(String id);
	Produit updateProduit(String id, Produit produit);
	Produit retrieveProduit(String id);

}
