package br.com.github.osvaldo.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class Country {

	@Id
	private long id;
	
	@Column(name ="nome")
	private String name;
	
	@Column(name ="nome_pt")
	private String PortugueseName;
	
	@Column(name ="sigla")
	private String code;
	
	private Integer bacen;

	public Country() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortugueseName() {
		return PortugueseName;
	}

	public void setPortugueseName(String portugueseName) {
		PortugueseName = portugueseName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBacen() {
		return bacen;
	}

	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
}
