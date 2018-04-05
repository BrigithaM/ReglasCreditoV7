package com.selsa.credito.condicion_credito;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ATRIBUTOS_CUPO_LINEA implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "CODIGO_LINEA_ANALISIS")
	private java.lang.String CODIGO_LINEA_ANALISIS;

	@org.kie.api.definition.type.Label(value = "CLASE_CUPO")
	private java.lang.String CLASE_CUPO;

	@org.kie.api.definition.type.Label(value = "TIPO_SALDO_OBLIGACION")
	private java.lang.String TIPO_SALDO_OBLIGACION;

	@org.kie.api.definition.type.Label(value = "CONCEPTO_SALDO_OBLIGACION")
	private java.lang.String CONCEPTO_SALDO_OBLIGACION;

	public ATRIBUTOS_CUPO_LINEA() {
	}

	public java.lang.String getCODIGO_LINEA_ANALISIS() {
		return this.CODIGO_LINEA_ANALISIS;
	}

	public void setCODIGO_LINEA_ANALISIS(java.lang.String CODIGO_LINEA_ANALISIS) {
		this.CODIGO_LINEA_ANALISIS = CODIGO_LINEA_ANALISIS;
	}

	public java.lang.String getCLASE_CUPO() {
		return this.CLASE_CUPO;
	}

	public void setCLASE_CUPO(java.lang.String CLASE_CUPO) {
		this.CLASE_CUPO = CLASE_CUPO;
	}

	public java.lang.String getTIPO_SALDO_OBLIGACION() {
		return this.TIPO_SALDO_OBLIGACION;
	}

	public void setTIPO_SALDO_OBLIGACION(java.lang.String TIPO_SALDO_OBLIGACION) {
		this.TIPO_SALDO_OBLIGACION = TIPO_SALDO_OBLIGACION;
	}

	public java.lang.String getCONCEPTO_SALDO_OBLIGACION() {
		return this.CONCEPTO_SALDO_OBLIGACION;
	}

	public void setCONCEPTO_SALDO_OBLIGACION(
			java.lang.String CONCEPTO_SALDO_OBLIGACION) {
		this.CONCEPTO_SALDO_OBLIGACION = CONCEPTO_SALDO_OBLIGACION;
	}

	public ATRIBUTOS_CUPO_LINEA(java.lang.String CODIGO_LINEA_ANALISIS,
			java.lang.String CLASE_CUPO,
			java.lang.String TIPO_SALDO_OBLIGACION,
			java.lang.String CONCEPTO_SALDO_OBLIGACION) {
		this.CODIGO_LINEA_ANALISIS = CODIGO_LINEA_ANALISIS;
		this.CLASE_CUPO = CLASE_CUPO;
		this.TIPO_SALDO_OBLIGACION = TIPO_SALDO_OBLIGACION;
		this.CONCEPTO_SALDO_OBLIGACION = CONCEPTO_SALDO_OBLIGACION;
	}

}