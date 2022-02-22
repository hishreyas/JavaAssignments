package com.company.weekNine;

import java.awt.*;
import java.awt.event.*;

class MouseDetector extends Frame {
    TextField statusBar;

    public static void main(String[] args) {
        new MouseDetector();
    }

    MouseDetector() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
            }


            @Override
            public void mouseMoved(MouseEvent e) {
                statusBar.setText("Mouse moved at (" + e.getX() + "," + e.getY() + ")");
            }
        }
        );
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                statusBar.setText("Press at (" + e.getX() + "," + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                statusBar.setText("Entered at (" + e.getX() + "," + e.getY() + ")");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                statusBar.setText("Mouse dragged at (" + e.getX() + "," + e.getY() + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                statusBar.setText("Mouse moved at (" + e.getX() + "," + e.getY() + ")");
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(275, 300);
        setTitle("Mouse Click Position");
        statusBar = new TextField(20);
        add(statusBar);
        setVisible(true);
    }
}
