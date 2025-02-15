package com.leet;

import java.util.*;

class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int startingPixel = image[sr][sc];

        if (startingPixel == color) {
            return image;
        }

        return mark(image, sr, sc, color, startingPixel);
    }


    private int[][] mark(int[][] image, int sr, int sc, int color, int orgColor) {
        // Base case: Check if the current pixel is out of bounds or not the original color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orgColor) {
            return image;
        }

        // Change the color of the current pixel to the target color
        image[sr][sc] = color;

        // Recursively call the helper function for all four directions

        // Move left
        mark(image, sr, sc - 1, color, orgColor);

        // Move right
        mark(image, sr, sc + 1, color, orgColor);

        // Move up
        mark(image, sr - 1, sc, color, orgColor);

        // Move down
        mark(image, sr + 1, sc, color, orgColor);

        return image;
    }


    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();

        int [][] finalImage=floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        System.out.println(Arrays.deepToString(finalImage));
    }
}