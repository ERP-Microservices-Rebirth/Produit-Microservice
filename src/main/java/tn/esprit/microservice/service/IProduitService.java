package tn.esprit.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.microservice.entity.Produit;


@Service
public interface IProduitService {
	List<Produit> retrieveAllCustomers();
	Produit addCustomer(Produit produit);
	void deleteCustomer(String id);
	Produit updateCustomer(String id, Produit produit);
	Produit retrieveCustomer(String id);

}
