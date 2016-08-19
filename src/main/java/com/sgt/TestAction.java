package com.sgt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by tanght on 16/8/18.
 */
@Path("testAction")
public class TestAction {

    @GET
    @Path("hello/{name}")
    @Produces("application/json")
    public String hello(@PathParam("name") String name){

        System.out.println("hello jaxrs from " + name);

        return "hello jaxrs";
    }
}
