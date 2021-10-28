package tn.esprit.microservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "produits")
public class Produit {
	@Id
	private String id;

	@Field(value = "nom_produit")
	private String nom_produit;

	private String image;
	
	@Field(value = "description")
	private String description;

	@Field(value = "PrixActuel")
	private String PrixActuel;
	
	@Field(value = "disponible")
	private String disponible;

	@Field(value = "quantite")
	private String quantite;

	public Produit( String nom_produit, String image, String description, String prixActuel,
			String disponible, String quantite) {
		super();
		this.nom_produit = nom_produit;
		this.image = image;
		this.description = description;
		PrixActuel = prixActuel;
		this.disponible = disponible;
		this.quantite = quantite;
	}

	public Produit() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrixActuel() {
		return PrixActuel;
	}

	public void setPrixActuel(String prixActuel) {
		PrixActuel = prixActuel;
	}

	public String isDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom_produit=" + nom_produit + ", image=" + image + ", description="
				+ description + ", PrixActuel=" + PrixActuel + ", disponible=" + disponible + ", quantite=" + quantite
				+ "]";
	}

	public Produit(String nom_produit, String description, String prixActuel, String disponible, String quantite) {
		super();
		this.nom_produit = nom_produit;
		this.description = description;
		PrixActuel = prixActuel;
		this.disponible = disponible;
		this.quantite = quantite;
	}

	public Produit(String id, String nom_produit, String image, String description, String prixActuel,
			String disponible, String quantite) {
		super();
		this.id = id;
		this.nom_produit = nom_produit;
		this.image = image;
		this.description = description;
		PrixActuel = prixActuel;
		this.disponible = disponible;
		this.quantite = quantite;
	}
	
	
}
