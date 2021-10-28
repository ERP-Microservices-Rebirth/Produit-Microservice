package tn.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import tn.esprit.microservice.entity.Produit;
import tn.esprit.microservice.repository.ProduitRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProduitMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitMicroserviceApplication.class, args);
	}
	/*@Bean
	ApplicationRunner init(ProduitRepository produitRepository) {
		Produit produit1 = new Produit("produit1","image","description","200","true","5");
		Produit produit2 = new Produit("produit2","image","description1","20","false","6");
		Produit produit3 = new Produit("produit3","image","description3","300","true,7);
		return args -> {
			Stream.of(produit1, produit2, produit3).forEach(produit -> {
				produitRepository.save(produit);
			});
		};
}*/

}
