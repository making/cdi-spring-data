package com.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Random;

@Path("hello")
@RequestScoped
@Controller
public class HelloController {
    @Inject
    Models models;

    @Inject
    PointService pointService;

    @GET
    public String hello() {
        Point point = new Point();
        point.setValue(new Random().nextInt());
        pointService.create(point);

        models.put("points", pointService.findAll());
        return "hello.xhtml";
    }
}
