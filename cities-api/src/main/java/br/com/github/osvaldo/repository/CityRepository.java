package br.com.github.osvaldo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.github.osvaldo.cidades.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
