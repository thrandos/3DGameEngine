package com.thrandos.gameengine;

import org.lwjgl.opengl.GL11;

/**
 * Main game loop class that initializes and runs the 3D game engine
 * Uses LWJGL2 for OpenGL rendering and Slick-Util for utilities
 */
public class MainGameLoop {
    
    private Loader loader;
    
    public static void main(String[] args) {
        MainGameLoop gameLoop = new MainGameLoop();
        gameLoop.run();
    }
    
    /**
     * Runs the main game loop
     */
    public void run() {
        DisplayManager.createDisplay();
        init();
        
        while (!DisplayManager.isCloseRequested()) {
            update();
            render();
            DisplayManager.updateDisplay();
        }
        
        cleanup();
        DisplayManager.closeDisplay();
    }
    
    /**
     * Initialize game resources
     */
    private void init() {
        // Set clear color to cornflower blue
        GL11.glClearColor(0.39f, 0.58f, 0.93f, 1.0f);
        
        // Initialize loader for Slick-Util texture loading
        loader = new Loader();
        
        System.out.println("========================================");
        System.out.println("3D Game Engine initialized successfully!");
        System.out.println("Using LWJGL2 version 2.9.3");
        System.out.println("Using Slick-Util for texture loading");
        System.out.println("========================================");
    }
    
    /**
     * Update game logic
     */
    private void update() {
        // Game logic updates go here
    }
    
    /**
     * Render the scene
     */
    private void render() {
        // Clear the screen
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        
        // Rendering code goes here
    }
    
    /**
     * Cleanup resources before exit
     */
    private void cleanup() {
        System.out.println("Cleaning up resources...");
        if (loader != null) {
            loader.cleanup();
        }
    }
}
