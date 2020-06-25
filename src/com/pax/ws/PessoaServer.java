package com.pax.ws;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.pax.model.Pessoa;

// Interface do serviço (SEI) com um método que retorna um objeto "Pessoa"
@WebService
@SOAPBinding(style = Style.RPC)
public interface PessoaServer {
  
  @WebMethod
  Pessoa getPessoa(String nome);
}
