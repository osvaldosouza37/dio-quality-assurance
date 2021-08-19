package br.com.github.osvaldo.estados;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import br.com.github.osvaldo.countries.Country;
@Entity(name = "State")
@Table(name = "estado")
public class State {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private String uf;

  private Integer ibge;

  /* 1st
  @Column(name = "pais")
  private Integer countryId;*/

  // 2nd - @ManyToOne
  @ManyToOne
  @JoinColumn(name = "pais", referencedColumnName = "id")
  private Country country;

  @Column(name = "ddd")
  private String ddd;

  public State() {
  }

  /**
   *
   * @param id
   * @param name
   * @param uf
   * @param ibge
   * @param country
   * @param ddd
   */
  public State(Long id, String name, String uf, Integer ibge,
               Country country, String ddd) {
    this.id = id;
    this.name = name;
    this.uf = uf;
    this.ibge = ibge;
    this.country = country;
    this.ddd = ddd;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }

  public String getDdd() {
    return ddd;
  }

  public Country getCountry() {
    return country;
  }

  /*public Integer getCountryId() {
      return countryId;
  }*/
}