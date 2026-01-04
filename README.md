# 3D Game Engine

A 3D Game Engine built with Java using LWJGL2 (Lightweight Java Game Library 2) and Slick-Util for OpenGL rendering and game development.

## Features

- **LWJGL 2.9.3** for OpenGL bindings and hardware-accelerated rendering
- **Slick-Util** for texture loading and image utilities
- Display management with configurable resolution (1280x720) and FPS cap (120)
- Basic game loop structure (init, update, render, cleanup)
- Modular architecture with DisplayManager and Loader classes
- Cornflower blue default background (classic XNA style)

## Libraries Used

### LWJGL2 (Lightweight Java Game Library 2)
LWJGL2 provides Java bindings to OpenGL, OpenAL, and OpenCL. This project uses:
- **org.lwjgl.lwjgl:lwjgl:2.9.3** - Core LWJGL library for OpenGL rendering
- **org.lwjgl.lwjgl:lwjgl_util:2.9.3** - LWJGL utility functions

### Slick-Util
Slick-Util is a companion library for LWJGL that provides:
- Texture loading from various image formats (PNG, JPG, etc.)
- Image manipulation utilities
- Font rendering helpers

The library is included in the `lib/` directory as it's not available in Maven Central.

## Requirements

- Java 8 or higher
- Maven 3.x

## Building

To build the project:

```bash
mvn clean compile
```

To package as JAR:

```bash
mvn clean package
```

## Running

To run the game engine directly with Maven:

```bash
mvn exec:java -Dexec.mainClass="com.thrandos.gameengine.MainGameLoop"
```

Or build and run the JAR:

```bash
mvn clean package
java -jar target/3DGameEngine-1.0-SNAPSHOT.jar
```

**Note:** Running the application requires native libraries for your platform. LWJGL2 will automatically extract and load the appropriate natives.

## Project Structure

```
3DGameEngine/
├── src/main/java/com/thrandos/gameengine/
│   ├── MainGameLoop.java      - Main game loop and entry point
│   ├── DisplayManager.java    - Display window management using LWJGL2
│   └── Loader.java            - Resource loader using Slick-Util
├── lib/
│   └── slick-util.jar         - Slick-Util library for texture loading
├── pom.xml                     - Maven configuration with LWJGL2 dependencies
└── README.md                   - This file
```

## Dependencies

- **LWJGL 2.9.3** - Lightweight Java Game Library for OpenGL
  - Provides low-level access to OpenGL, OpenAL, and input devices
  - Includes native libraries for Windows, Mac, and Linux
- **Slick-Util 1.0.0** - Utility library for game development
  - Simplifies texture and image loading
  - Compatible with LWJGL2

## Development

The engine initializes an OpenGL context through LWJGL2 and provides:
- A game loop running at up to 120 FPS
- Window creation and management
- Resource loading infrastructure
- Clean separation between initialization, update, rendering, and cleanup

Extend the `MainGameLoop` class to add your game logic in the `update()` and `render()` methods.

## License

MIT License - see LICENSE file for details
