package com.pax.main;

import javax.xml.ws.Endpoint;
import com.pax.ws.PessoaServerImpl;

/* Programa que sobe o serviço usando o método "publish" da classe "Endpoint".
 * Dispensa o uso de um servidor dedicado
 */ 
public class PessoaServerPublisher {
  
  public static void main(String[] args) {
    try {
      // Se necessário, alterar a porta aqui
      Endpoint.publish("http://localhost:9454/ws/pessoa", new PessoaServerImpl());
      System.out.println("Service running on http://localhost:9454/ws/pessoa...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
