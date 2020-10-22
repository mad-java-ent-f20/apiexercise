package com.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Planet.
 */
public class Planet{

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("climate")
    private String climate;

    @JsonProperty("rotation_period")
    private String rotationPeriod;

    @JsonProperty("url")
    private String url;

    @JsonProperty("population")
    private String population;

    @JsonProperty("orbital_period")
    private String orbitalPeriod;

    @JsonProperty("surface_water")
    private String surfaceWater;

    @JsonProperty("diameter")
    private String diameter;

    @JsonProperty("gravity")
    private String gravity;

    @JsonProperty("name")
    private String name;

    @JsonProperty("residents")
    private List<String> residents;

    @JsonProperty("terrain")
    private String terrain;

    /**
     * Get films list.
     *
     * @return the list
     */
    public List<String> getFilms(){
        return films;
    }

    /**
     * Get edited string.
     *
     * @return the string
     */
    public String getEdited(){
        return edited;
    }

    /**
     * Get created string.
     *
     * @return the string
     */
    public String getCreated(){
        return created;
    }

    /**
     * Get climate string.
     *
     * @return the string
     */
    public String getClimate(){
        return climate;
    }

    /**
     * Get rotation period string.
     *
     * @return the string
     */
    public String getRotationPeriod(){
        return rotationPeriod;
    }

    /**
     * Get url string.
     *
     * @return the string
     */
    public String getUrl(){
        return url;
    }

    /**
     * Get population string.
     *
     * @return the string
     */
    public String getPopulation(){
        return population;
    }

    /**
     * Get orbital period string.
     *
     * @return the string
     */
    public String getOrbitalPeriod(){
        return orbitalPeriod;
    }

    /**
     * Get surface water string.
     *
     * @return the string
     */
    public String getSurfaceWater(){
        return surfaceWater;
    }

    /**
     * Get diameter string.
     *
     * @return the string
     */
    public String getDiameter(){
        return diameter;
    }

    /**
     * Get gravity string.
     *
     * @return the string
     */
    public String getGravity(){
        return gravity;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Get residents list.
     *
     * @return the list
     */
    public List<String> getResidents(){
        return residents;
    }

    /**
     * Get terrain string.
     *
     * @return the string
     */
    public String getTerrain(){
        return terrain;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "films=" + films +
                ", edited='" + edited + '\'' +
                ", created='" + created + '\'' +
                ", climate='" + climate + '\'' +
                ", rotationPeriod='" + rotationPeriod + '\'' +
                ", url='" + url + '\'' +
                ", population='" + population + '\'' +
                ", orbitalPeriod='" + orbitalPeriod + '\'' +
                ", surfaceWater='" + surfaceWater + '\'' +
                ", diameter='" + diameter + '\'' +
                ", gravity='" + gravity + '\'' +
                ", name='" + name + '\'' +
                ", residents=" + residents +
                ", terrain='" + terrain + '\'' +
                '}';
    }
}