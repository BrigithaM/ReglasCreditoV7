package com.selsa.credito.condicion_credito;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PROSPECTO_DESCUENTO_CARGO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("CODIGO_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Código de los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private java.lang.String CODIGO_DESCUENTO_PROSPECTO;
	@org.kie.api.definition.type.Label("CODIGO_BASE_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Base utilizada para calcular los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private java.lang.String CODIGO_BASE_DESCUENTO_PROSPECTO;
	@org.kie.api.definition.type.Label("PORCENTAJE_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Porcentaje para calcular los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private Double PORCENTAJE_DESCUENTO_PROSPECTO;
	@org.kie.api.definition.type.Label("VALOR_ABSOLUTO_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Valor absoluto de los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private java.lang.Integer VALOR_ABSOLUTO_DESCUENTO_PROSPECTO;
	@org.kie.api.definition.type.Label("VALOR_CALCULADO_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Valor calculado de los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private java.lang.Integer VALOR_CALCULADO_DESCUENTO_PROSPECTO;
	@org.kie.api.definition.type.Label("VALOR_APLICADO_DESCUENTO_PROSPECTO")
	@org.kie.api.definition.type.Description("Valor realmente aplicado a los descuentos y/o cargos que se incluyeron en la simulación del prospecto que se sugiere al cliente")
	private java.lang.Integer VALOR_APLICADO_DESCUENTO_PROSPECTO;

	@org.kie.api.definition.type.Label("TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO")
	@org.kie.api.definition.type.Description("Si es obligatorio o no el cargo o descuento")
	private java.lang.String TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO;

	public PROSPECTO_DESCUENTO_CARGO() {
	}

	public java.lang.String getCODIGO_DESCUENTO_PROSPECTO() {
		return this.CODIGO_DESCUENTO_PROSPECTO;
	}

	public void setCODIGO_DESCUENTO_PROSPECTO(
			java.lang.String CODIGO_DESCUENTO_PROSPECTO) {
		this.CODIGO_DESCUENTO_PROSPECTO = CODIGO_DESCUENTO_PROSPECTO;
	}

	public java.lang.String getCODIGO_BASE_DESCUENTO_PROSPECTO() {
		return this.CODIGO_BASE_DESCUENTO_PROSPECTO;
	}

	public void setCODIGO_BASE_DESCUENTO_PROSPECTO(
			java.lang.String CODIGO_BASE_DESCUENTO_PROSPECTO) {
		this.CODIGO_BASE_DESCUENTO_PROSPECTO = CODIGO_BASE_DESCUENTO_PROSPECTO;
	}

	public java.lang.Integer getVALOR_ABSOLUTO_DESCUENTO_PROSPECTO() {
		return this.VALOR_ABSOLUTO_DESCUENTO_PROSPECTO;
	}

	public void setVALOR_ABSOLUTO_DESCUENTO_PROSPECTO(
			java.lang.Integer VALOR_ABSOLUTO_DESCUENTO_PROSPECTO) {
		this.VALOR_ABSOLUTO_DESCUENTO_PROSPECTO = VALOR_ABSOLUTO_DESCUENTO_PROSPECTO;
	}

	public java.lang.Integer getVALOR_CALCULADO_DESCUENTO_PROSPECTO() {
		return this.VALOR_CALCULADO_DESCUENTO_PROSPECTO;
	}

	public void setVALOR_CALCULADO_DESCUENTO_PROSPECTO(
			java.lang.Integer VALOR_CALCULADO_DESCUENTO_PROSPECTO) {
		this.VALOR_CALCULADO_DESCUENTO_PROSPECTO = VALOR_CALCULADO_DESCUENTO_PROSPECTO;
	}

	public java.lang.Integer getVALOR_APLICADO_DESCUENTO_PROSPECTO() {
		return this.VALOR_APLICADO_DESCUENTO_PROSPECTO;
	}

	public void setVALOR_APLICADO_DESCUENTO_PROSPECTO(
			java.lang.Integer VALOR_APLICADO_DESCUENTO_PROSPECTO) {
		this.VALOR_APLICADO_DESCUENTO_PROSPECTO = VALOR_APLICADO_DESCUENTO_PROSPECTO;
	}

	public java.lang.String getTIPO_DESCUENTO_OBLIGATORIO_PROSPECTO() {
		return this.TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO;
	}

	public void setTIPO_DESCUENTO_OBLIGATORIO_PROSPECTO(
			java.lang.String TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO) {
		this.TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO = TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO;
	}

	public java.lang.Double getPORCENTAJE_DESCUENTO_PROSPECTO() {
		return this.PORCENTAJE_DESCUENTO_PROSPECTO;
	}

	public void setPORCENTAJE_DESCUENTO_PROSPECTO(
			java.lang.Double PORCENTAJE_DESCUENTO_PROSPECTO) {
		this.PORCENTAJE_DESCUENTO_PROSPECTO = PORCENTAJE_DESCUENTO_PROSPECTO;
	}

	public PROSPECTO_DESCUENTO_CARGO(
			java.lang.String CODIGO_DESCUENTO_PROSPECTO,
			java.lang.String CODIGO_BASE_DESCUENTO_PROSPECTO,
			java.lang.Double PORCENTAJE_DESCUENTO_PROSPECTO,
			java.lang.Integer VALOR_ABSOLUTO_DESCUENTO_PROSPECTO,
			java.lang.Integer VALOR_CALCULADO_DESCUENTO_PROSPECTO,
			java.lang.Integer VALOR_APLICADO_DESCUENTO_PROSPECTO,
			java.lang.String TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO) {
		this.CODIGO_DESCUENTO_PROSPECTO = CODIGO_DESCUENTO_PROSPECTO;
		this.CODIGO_BASE_DESCUENTO_PROSPECTO = CODIGO_BASE_DESCUENTO_PROSPECTO;
		this.PORCENTAJE_DESCUENTO_PROSPECTO = PORCENTAJE_DESCUENTO_PROSPECTO;
		this.VALOR_ABSOLUTO_DESCUENTO_PROSPECTO = VALOR_ABSOLUTO_DESCUENTO_PROSPECTO;
		this.VALOR_CALCULADO_DESCUENTO_PROSPECTO = VALOR_CALCULADO_DESCUENTO_PROSPECTO;
		this.VALOR_APLICADO_DESCUENTO_PROSPECTO = VALOR_APLICADO_DESCUENTO_PROSPECTO;
		this.TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO = TIPO_DESCUENTO_OBLIGATORIO_PROSPECTO;
	}

}