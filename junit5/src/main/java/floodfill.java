import java.util.Arrays;

public class floodfill {

    public static void main(String[] args) {
        System.out.println(Arrays
                .deepToString(
                        new floodfill().floodFill(new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }, 1, 1, 2)));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc])
            return image;
        return floodFillHelper(image, sr, sc, color, image[sr][sc]);
    }

    public int[][] floodFillHelper(int[][] image, int sr, int sc, int color, int initialColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return image;

        if (image[sr][sc] != initialColor)
            return image;

        image[sr][sc] = color;
        floodFillHelper(image, sr - 1, sc, color, initialColor);
        floodFillHelper(image, sr + 1, sc, color, initialColor);
        floodFillHelper(image, sr, sc - 1, color, initialColor);
        floodFillHelper(image, sr, sc + 1, color, initialColor);

        return image;
    }

}
