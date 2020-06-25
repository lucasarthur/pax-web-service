package com.pax.model;

import java.io.Serializable;
import java.util.Objects;

// Bean "Pessoa" com atributos "nome" e "idade"
public class Pessoa implements Serializable {
  private static final long serialVersionUID = -5001682719093288967L;
  private String nome;
  private int idade;

  public Pessoa() {}

  @Override
  public String toString() {
    return this.getNome() + ", " + this.getIdade() + " anos.";
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    Pessoa pessoa = (Pessoa) obj;
    return this.getIdade() == pessoa.getIdade() && this.getNome().equals(pessoa.getNome());
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.getNome(), this.getIdade());
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNome() {
    return this.nome;
  }
  public int getIdade() {
    return this.idade;
  }
}
