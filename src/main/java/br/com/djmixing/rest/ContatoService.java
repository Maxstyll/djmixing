package br.com.djmixing.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/contato")
public class ContatoService {

@GET
@Path("/{param}")
public Response getMsg(@PathParam("param") String msg) {
  String output = "Parâmetro recebido " + msg;
  return Response.status(200).entity(output).build();
}

}