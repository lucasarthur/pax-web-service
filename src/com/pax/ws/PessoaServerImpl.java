package com.pax.ws;

import javax.jws.WebService;
import com.pax.model.Pessoa;

// Implementação do serviço (SIB) apontando para a interface "PessoaServer"
@WebService(endpointInterface = "com.pax.ws.PessoaServer")
public class PessoaServerImpl implements PessoaServer {

  @Override
  public Pessoa getPessoa(String nome) {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome(nome);
    pessoa.setIdade(10);

    return pessoa;
  }
}
