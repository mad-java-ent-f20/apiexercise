package com.persistence;



import com.api.Planet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.net.URL;
import java.util.Properties;

/**
 * The type Swapi dao.
 */
public class PlanetDao {
    /**
     * The Logger.
     */
    Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;


    /**
     * Instantiates a new Planetdao.
     */
//    public PlanetDao() {
//        loadProperties();
//    }
    /**
     * Load up properties
     */
    String result = "";
    private String loadProperties() {
            String propFileName = "apiUri.properties";

        properties = new Properties();
        try {
            URL url = ClassLoader.getSystemResource("apiUri.properties");
            InputStream in = url.openStream();
            Reader reader = new InputStreamReader(in, "UTF-8");
            properties.load (this.getClass().getResourceAsStream(String.valueOf(reader)));
        } catch (IOException ioe) {
            logger.error("Cannot load the properties file", ioe);
        } catch (Exception e) {
            logger.error("can not find", e);
        }
        return result;
    }


    /**
     * Get planet planet.
     *
     * @return the planet
     */
    Planet getPlanet(){
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://swapi.dev/api/planets/1/");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Planet planet = null;
        try {

            planet = mapper.readValue(response, Planet.class);
        } catch (JsonProcessingException e) {
            logger.error("Json not found");
        }
        return planet;
    }

}
