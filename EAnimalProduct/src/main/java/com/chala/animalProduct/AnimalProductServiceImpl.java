package com.chala.animalProduct;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chala.animalProduct.ExceptionHandler.ResourceNotFoundException;

@Service
@Transactional
public class AnimalProductServiceImpl implements AnimalProductService{
	
	AnimalProductRepository animalProductRepository;
	
	public AnimalProductServiceImpl(AnimalProductRepository animalProductRepository) {
		this.animalProductRepository=animalProductRepository;
	}

	@Override
	public List<AnimalProduct> findAll() {
		return (List<AnimalProduct>) animalProductRepository.findAll();
	}

	@Override
	public AnimalProduct findOne(Long id) {
		return animalProductRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Animal Product not found"));
	}

	
	
	
	@Override
	public AnimalProduct save(AnimalProduct animalProduct) {
		return animalProductRepository.save(animalProduct);
	}



}
