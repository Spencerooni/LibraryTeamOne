package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.views.Homepage;
import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by benl on 03/11/2016.
 */
@Path("media")
public class MediaResource {

    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View Homepage() {

        List<Media> medias = Media.medias;

        return new Homepage(medias);
    }

}