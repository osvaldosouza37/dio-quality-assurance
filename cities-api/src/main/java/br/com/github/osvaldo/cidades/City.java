package br.com.github.osvaldo.cidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private Integer uf;

  private Integer ibge;

  public City() {
  }

  /**
   *
   * @param id
   * @param name
   * @param uf
   * @param ibge
   */
  public City(final Long id, final String name, final Integer uf, final Integer ibge) {
    this.id = id;
    this.name = name;
    this.uf = uf;
    this.ibge = ibge;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }
}