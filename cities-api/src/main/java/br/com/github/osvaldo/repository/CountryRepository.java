package br.com.github.osvaldo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.github.osvaldo.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
