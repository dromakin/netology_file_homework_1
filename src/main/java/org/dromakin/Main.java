package org.dromakin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.dromakin.FileConstants.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Create game folder
            GameManager gameManager = new GameManager();
            if (gameManager.isInstalled()) {
                // delete before installing
                gameManager.uninstalling();
            }

            gameManager.installing();

        } catch (GameManagerException e) {
            logger.error(e.getMessage(), e);
        }

    }
}