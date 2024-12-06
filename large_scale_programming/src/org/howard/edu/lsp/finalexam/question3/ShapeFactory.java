package org.howard.edu.lsp.finalexam.question3;

/**
 * A singleton factory that creates Shape objects based on a given shape type.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to enforce singleton pattern
    private ShapeFactory() { }

    /**
     * Returns the singleton instance of ShapeFactory.
     */
    public static synchronized ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Returns a Shape object based on the specified shape type.
     * @param shapeType the type of shape to create
     * @return a Shape object or null if the type is unknown
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        shapeType = shapeType.trim().toLowerCase();

        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

