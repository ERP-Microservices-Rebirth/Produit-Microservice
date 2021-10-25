package tn.esprit.microservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.microservice.entity.Produit;

@Repository
public interface ProduitRepository extends MongoRepository<Produit,String>  {

}
