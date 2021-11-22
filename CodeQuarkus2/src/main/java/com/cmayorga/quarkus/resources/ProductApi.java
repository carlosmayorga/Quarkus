package com.cmayorga.quarkus.resources;


import com.cmayorga.quarkus.entities.Product;
import com.cmayorga.quarkus.repositories.ProductRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/products")
public class ProductApi {

    @Inject
    ProductRepository productRepository;

    @GET
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GET
    @Path("/{id}")
    public Product getProduct(@PathParam("id") Long Id){
        return productRepository.findById(Id).get();
    }

    @POST
    public Response saveProduct(Product product) {
        productRepository.save(product);
        return Response.ok().build();
    }

    @DELETE
    public Response deleteProduct(Product product){
        productRepository.delete(product);
        return Response.ok().build();
    }

}
