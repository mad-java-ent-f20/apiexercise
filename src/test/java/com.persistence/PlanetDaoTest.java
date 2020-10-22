package com.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanetDaoTest {

    @Test
    void getPlanetSuccess() {
        PlanetDao dao = new PlanetDao();
        assertEquals("Tatooine", dao.getPlanet().getName());
    }
}
