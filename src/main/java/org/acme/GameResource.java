package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/game")
public class GameResource {

    @Inject
    GameService service;

    @POST
    @Path("start")
    public GameScore start(@QueryParam("playerOne") String playerOne, @QueryParam("playerTwo") String playerTwo) {
        return service.start(playerOne, playerTwo);
    }

    @PUT
    @Path("addPoint/{player}")
    public GameScore addPoint(@PathParam("player") String forPlayer) {
        return service.addPoint(forPlayer);
    }
}
