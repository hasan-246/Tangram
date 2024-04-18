package com.example.tangramtest;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Pane rootPane;
    @FXML
    private Rectangle rectangle;
    @FXML
    private Polygon large1;
    @FXML
    private Polygon large2;
    @FXML
    private Polygon small1;
    @FXML
    private Polygon small2;
    @FXML
    private Polygon mid;
    @FXML
    private Polygon parallelogram;

    private double startX;
    private double startY;
    private double initialTranslateX;
    private double initialTranslateY;

    @FXML
    private void initialize() {
        makeDraggable(rectangle);
        makeDraggable(large1);
        makeDraggable(large2);
        makeDraggable(small1);
        makeDraggable(small2);
        makeDraggable(mid);
        makeDraggable(parallelogram);
    }


    private void makeDraggable(Node node) {
        node.setOnMousePressed(e -> {
            startX = e.getSceneX() - node.getTranslateX();
            startY = e.getSceneY() - node.getTranslateY();

            if (e.getButton() == MouseButton.SECONDARY) {
                // Right mouse button (secondary) pressed, perform rotation
                node.setRotate((node.getRotate() + 45) % 360);
            }
        });

        node.setOnMouseDragged(e -> {
            node.setTranslateX(e.getSceneX() - startX);
            node.setTranslateY(e.getSceneY() - startY);
        });
    }
}
