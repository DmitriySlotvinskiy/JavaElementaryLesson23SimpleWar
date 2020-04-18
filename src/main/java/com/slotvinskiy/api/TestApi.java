package com.slotvinskiy.api;

import com.google.gson.Gson;
import com.slotvinskiy.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {

    @GET
    public Response test() {

        Person person = new Person("Alex", 22);
        Gson gson = new Gson();
        String json = gson.toJson(person, Person.class);

        return Response.status(Response.Status.OK)
                .type(MediaType.APPLICATION_JSON)
                .entity(json)
                .build();
    }

}