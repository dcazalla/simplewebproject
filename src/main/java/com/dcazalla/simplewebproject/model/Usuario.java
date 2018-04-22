package com.dcazalla.simplewebproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.dcazalla.simplewebproject.model.base.EntidadBase;

@Entity
@Table(name = "USUARIO", uniqueConstraints=@UniqueConstraint(columnNames={"NOMBRE"}, name="UK_NOMBRE"))
@SequenceGenerator(
        name="UsuarioSeq",
        sequenceName = "USUARIO_SEQ",
        allocationSize = 1
)
public class Usuario extends EntidadBase{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UsuarioSeq")
	@Column(name = "ID_USUARIO", nullable = false, unique = true, precision = 10)
	private Integer idUsuario;

	@Column(name = "NOMBRE", nullable = false, length = 50)
	private String nombre;

	@Column(name = "PASSWORD", nullable = false, length = 50)
	private String password;

	
}
