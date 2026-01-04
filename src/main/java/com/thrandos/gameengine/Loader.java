package com.thrandos.gameengine;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Handles loading of textures and models using Slick-Util
 */
public class Loader {
    
    /**
     * Loads a texture from the resources folder
     * 
     * NOTE: This is a placeholder implementation. The current Slick-Util library
     * is a minimal interface-only implementation. For actual texture loading,
     * either use the full Slick-Util library or implement custom texture loading
     * using LWJGL's texture utilities.
     * 
     * @param fileName The name of the texture file
     * @param fileExtension The file extension (e.g., "PNG", "JPG")
     * @return The loaded texture, or null if loading fails
     */
    public Texture loadTexture(String fileName, String fileExtension) {
        try {
            InputStream in = getClass().getResourceAsStream("/textures/" + fileName + "." + fileExtension.toLowerCase());
            if (in == null) {
                System.err.println("Could not find texture: " + fileName);
                return null;
            }
            Texture texture = TextureLoader.getTexture(fileExtension, in);
            System.out.println("Loaded texture: " + fileName + " (ID: " + texture.getTextureID() + ")");
            return texture;
        } catch (IOException e) {
            System.err.println("Failed to load texture: " + fileName);
            e.printStackTrace();
            return null;
        } catch (UnsupportedOperationException e) {
            // This is expected with the minimal Slick-Util implementation
            // To enable texture loading, replace lib/slick-util.jar with the full library
            System.out.println("Note: Texture loading placeholder called for: " + fileName);
            System.out.println("      For actual texture loading, use the full Slick-Util library");
            return null;
        }
    }
    
    /**
     * Cleanup loaded resources
     */
    public void cleanup() {
        // Cleanup code for VBOs, VAOs, textures, etc.
        System.out.println("Loader resources cleaned up");
    }
}
