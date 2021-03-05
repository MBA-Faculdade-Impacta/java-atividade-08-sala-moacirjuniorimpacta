package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa{
  private String documento;
  private String tipo;

  public void setDocumento(String documento){
    this.documento = documento;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getDocumento(){
    return this.documento;
  }

  public String getTipo(){
    return this.tipo;
  }
}