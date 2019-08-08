package br.ufrn.imd.almoxarifado.enums;

public enum EstadoLote 
{
	QUARENTENA("QUARENTENA"),
	APROVADO("APROVADO"),
	REPROVADO("REPROVADO"),
	PENDENTE("PENDENTE");
	
	private final String lote;
	
	EstadoLote(String lote)
	{
		this.lote = lote;
	}
	
	public String getTipo()
	{
		return this.lote;
	}
}
