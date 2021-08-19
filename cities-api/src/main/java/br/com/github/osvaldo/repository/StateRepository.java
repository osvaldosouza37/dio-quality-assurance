package br.com.github.osvaldo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.github.osvaldo.estados.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
