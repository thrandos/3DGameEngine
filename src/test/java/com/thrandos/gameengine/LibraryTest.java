package com.thrandos.gameengine;

/**
 * Simple test to verify LWJGL2 and Slick-Util libraries are accessible
 */
public class LibraryTest {
    
    public static void main(String[] args) {
        System.out.println("Testing library accessibility...\n");
        
        // Test LWJGL2 classes
        testLWJGL();
        
        // Test Slick-Util classes
        testSlickUtil();
        
        System.out.println("\nAll library tests completed successfully!");
    }
    
    private static void testLWJGL() {
        try {
            // Try to load LWJGL classes (avoiding Display which has static initializer requiring natives)
            Class<?> gl11Class = Class.forName("org.lwjgl.opengl.GL11");
            Class<?> lwjglUtilClass = Class.forName("org.lwjgl.util.vector.Vector3f");
            Class<?> bufferUtilsClass = Class.forName("org.lwjgl.BufferUtils");
            
            System.out.println("✓ LWJGL2 Core classes loaded successfully");
            System.out.println("  - GL11: " + gl11Class.getName());
            System.out.println("  - Vector3f: " + lwjglUtilClass.getName());
            System.out.println("  - BufferUtils: " + bufferUtilsClass.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("✗ Failed to load LWJGL2 classes: " + e.getMessage());
            System.exit(1);
        }
    }
    
    private static void testSlickUtil() {
        try {
            // Try to load Slick-Util classes
            Class<?> textureClass = Class.forName("org.newdawn.slick.opengl.Texture");
            Class<?> textureLoaderClass = Class.forName("org.newdawn.slick.opengl.TextureLoader");
            
            System.out.println("\n✓ Slick-Util classes loaded successfully");
            System.out.println("  - Texture: " + textureClass.getName());
            System.out.println("  - TextureLoader: " + textureLoaderClass.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("✗ Failed to load Slick-Util classes: " + e.getMessage());
            System.exit(1);
        }
    }
}
