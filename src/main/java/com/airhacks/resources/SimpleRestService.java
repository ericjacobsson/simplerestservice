package com.airhacks.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class SimpleRestService {

    @Path("/")
    @GET
    public String GetRootResource(){
        return "hello world, from " + System.getenv("HOSTNAME");
    }
}
