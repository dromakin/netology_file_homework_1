package org.dromakin;

import org.junit.jupiter.api.AfterEach;

import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameManagerTest {

    GameManager gameManager;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws GameManagerException {
        this.gameManager = new GameManager();
        this.gameManager.uninstalling(); // need to clear after running Main.java
        this.gameManager.installing();
    }

    @org.junit.jupiter.api.Test
    void installing() {
        assertTrue(Files.isDirectory(this.gameManager.getGamePath()));
    }

    @AfterEach
    void tearDown() throws GameManagerException {
        this.gameManager.uninstalling();
    }
}