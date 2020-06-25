package com.pax.client;

import com.pax.model.Pessoa;
import com.pax.ws.PessoaServer;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

// Client que se comunica com o serviço e faz o request de dois objetos "Pessoa"
public class PessoaClient {
  
  public static void main(String[] args) {
    try {
      System.out.println("Connecting to server...");
      // URL do documento WSDL do serviço
      URL url = new URL("http://localhost:9454/ws/pessoa?wsdl");
      QName qname = new QName("http://ws.pax.com/", "PessoaServerImplService");
      Service ws = Service.create(url, qname);
      PessoaServer pessoaServer = ws.getPort(PessoaServer.class);

      Pessoa pessoa0 = pessoaServer.getPessoa("Lucas");
      Pessoa pessoa1 = pessoaServer.getPessoa("Michelle");

      System.out.println("\n" + pessoa0 + " hashCode: " + pessoa0.hashCode());
      System.out.println(pessoa1 + " hashCode: " + pessoa1.hashCode());
      System.out.println("\nDisconnecting from server...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}