package com.dcazalla.simplewebproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PAIS", uniqueConstraints=@UniqueConstraint(columnNames={"DESC_PAIS"}, name="UK_PAIS"))
@SequenceGenerator(
        name="PaisSeq",
        sequenceName = "PAIS_SEQ",
        allocationSize = 1
)
public class Pais {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PaisSeq")
    @Column(name = "ID_PAIS", nullable = false, unique = true, precision = 10)
    private Integer idPais;
    
    @Column(name = "DESC_PAIS", nullable = false, length = 50)
    private String descPais;

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getDescPais() {
		return descPais;
	}

	public void setDescPais(String descPais) {
		this.descPais = descPais;
	}
    
    
    
    


}
