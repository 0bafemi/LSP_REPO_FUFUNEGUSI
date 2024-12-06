package org.howard.edu.lsp.finalexam.question3;

/**
 * ShapeRenderer now uses the ShapeFactory (Singleton) to create shapes
 * instead of directly instantiating them. This removes the need for if/else
 * statements and makes the code more flexible.
 */
public class ShapeRenderer {
    private ShapeFactory factory;

    public ShapeRenderer() {
        // Obtain the singleton instance of ShapeFactory
        this.factory = ShapeFactory.getInstance();
    }

    public void renderShape(String shapeType) {
        Shape shape = factory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes using the factory
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}

