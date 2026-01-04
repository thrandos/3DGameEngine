package com.thrandos.gameengine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

/**
 * Manages the game display window using LWJGL2
 */
public class DisplayManager {
    
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int FPS_CAP = 120;
    
    /**
     * Creates a display window
     */
    public static void createDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.setTitle("3D Game Engine");
            Display.create();
            GL11.glViewport(0, 0, WIDTH, HEIGHT);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Updates the display
     */
    public static void updateDisplay() {
        Display.sync(FPS_CAP);
        Display.update();
    }
    
    /**
     * Closes the display
     */
    public static void closeDisplay() {
        Display.destroy();
    }
    
    /**
     * Checks if the close button was requested
     * @return true if close was requested
     */
    public static boolean isCloseRequested() {
        return Display.isCloseRequested();
    }
}
