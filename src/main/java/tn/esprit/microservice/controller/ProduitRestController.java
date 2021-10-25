package tn.esprit.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.microservice.entity.Produit;
import tn.esprit.microservice.service.IProduitService;

@RestController
@RequestMapping(value = "/api/produit")
public class ProduitRestController {
	@Autowired
	IProduitService produitService;

	// Ajouter produit : http://localhost:8081/api/produit
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Produit> addProduit(@RequestBody Produit produit) {
		return new ResponseEntity<>(produitService.addProduit(produit), HttpStatus.OK);
	}
		
	// Supprimer Produit : http://localhost:8081/api/produit/{id}
	@DeleteMapping("/{id}")
	@ResponseBody
	public void removeProduit(@PathVariable("id") String id) {
		produitService.deleteProduit(id);
	}
		
	// Modifier Produit : http://localhost:8081/api/produit/{id}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Produit> modifyProduit(@PathVariable(value = "id") String id,
			@RequestBody Produit produit) {
		return new ResponseEntity<>(produitService.updateProduit(id,produit), HttpStatus.OK);
	}
}
