package org.emudhra.com.Jersey2AdvanceCodingExample;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {

	@GET
	@Path("/get/{prodId}/{prodName}/{prodCost}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@BeanParam Product product) {
		return product;
	}
}
