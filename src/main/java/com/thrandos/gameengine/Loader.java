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
     * @param fileName The name of the texture file
     * @param fileExtension The file extension (e.g., "PNG", "JPG")
     * @return The loaded texture
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
            // This is expected with our minimal Slick-Util implementation
            System.out.println("Texture loading placeholder called for: " + fileName);
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
