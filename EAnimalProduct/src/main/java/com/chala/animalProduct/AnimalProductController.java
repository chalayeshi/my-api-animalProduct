package com.chala.animalProduct;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animalproduct")
public class AnimalProductController {
	
	@Autowired
    private AnimalProductService animalProductService;
	
	public AnimalProductController(AnimalProductService animalproductservice) {
		this.animalProductService=animalproductservice;
	}
	
	// Find
    @GetMapping
	List<AnimalProduct> findAll(){
		return animalProductService.findAll();
	}
    
    @Bean
	CommandLineRunner runner(AnimalProductService animalProductService) {
		return args -> {
			animalProductService.save(new AnimalProduct(1L,"Boer Goat", 11.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(2L,"Heifer Cow", 30.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(3L,"Beef Cattle", 10.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(4L,"Camels", 40.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(5L,"Fresh Egg", 5.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(6L,"Chickens", 14.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(7L,"Ostriches", 29.00, "http://localhost/animal-products", 10 ));
			animalProductService.save(new AnimalProduct(8L,"Sheep", 125.00, "http://localhost/animal-products", 10 ));
		};
    }

}
