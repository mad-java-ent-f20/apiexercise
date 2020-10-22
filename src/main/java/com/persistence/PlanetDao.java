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
import java.io.IOException;
import java.io.InputStream;
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
    private static final String URI_PROPERTY_FILE = "/apiUri.properties";

    /**
     * Instantiates a new Swapi dao.
     */
    public PlanetDao() {
        loadProperties();
    }
    /**
     * Load up properties
     */

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("https://swapi.dev/api/planets/1/"));
        } catch (IOException ioe) {
            logger.error("loadProperties()...Cannot load the properties file", ioe);
        } catch (Exception e) {
            logger.error("loadProperties()...", e);
        }

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
