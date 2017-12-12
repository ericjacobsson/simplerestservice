package com.airhacks.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.ws.http.HTTPException;

@Path("/test")
public class SimpleRestService {

    @Path("/")
    @GET
    public String GetRootResource(){
        return "hello world!! From " + System.getenv("HOSTNAME") + System.lineSeparator();
    }

    @Path("/ping")
    @GET
    public String GetPing() {
        //throw new HTTPException(500);
        return "pong";
    }
}
