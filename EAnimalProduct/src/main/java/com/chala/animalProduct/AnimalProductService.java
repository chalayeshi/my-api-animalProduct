package com.chala.animalProduct;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

@Validated
public interface AnimalProductService {
	
	AnimalProduct findOne(@Min(value = 1L, message = "Invalid product ID.") Long id);
	
	AnimalProduct save(AnimalProduct animalProduct);

	@NotNull List<AnimalProduct> findAll();
	

}
