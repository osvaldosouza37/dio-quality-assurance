package br.com.github.osvaldo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.github.osvaldo.countries.Country;
import br.com.github.osvaldo.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	@Autowired
	private CountryRepository repository;
	/*
	@GetMapping
	public List<Country> countries(){
		return repository.findAll();
	}
	
	páginação 
	http://localhost:8080/countries?page=0&size=10&sort=name,asc
	*/
	@GetMapping
	public Page<Country> countries(Pageable page){
		return repository.findAll(page);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getOne(@PathVariable Long id) {
		
		Optional<Country> optional = repository.findById(id);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
}
