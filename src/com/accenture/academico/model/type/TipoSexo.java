package com.accenture.academico.model.type;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="tipoSexo")
public enum TipoSexo {

	MASCULINO,
	FEMININO,
	OUTROS;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
