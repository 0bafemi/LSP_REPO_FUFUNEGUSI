package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    void testRenderCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.getShape("circle");
        assertNotNull(circle, "Factory should return a circle instance");
        assertTrue(circle instanceof Circle, "Returned shape should be a Circle");
    }

    @Test
    void testRenderRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.getShape("rectangle");
        assertNotNull(rectangle, "Factory should return a rectangle instance");
        assertTrue(rectangle instanceof Rectangle, "Returned shape should be a Rectangle");
    }

    @Test
    void testRenderTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.getShape("triangle");
        assertNotNull(triangle, "Factory should return a triangle instance");
        assertTrue(triangle instanceof Triangle, "Returned shape should be a Triangle");
    }

    @Test
    void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.getShape("hexagon");
        assertNull(unknown, "Factory should return null for unknown shape types");
    }
}

