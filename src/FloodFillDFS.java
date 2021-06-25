public class FloodFillDFS {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int r = image.length;
        int c = image[0].length;

        if (image[sr][sc] != newColor) dfs (image, sr, sc, image[sr][sc], newColor);

        return image;
    }
    private void dfs (int[][] image, int sr, int sc, int color, int newColor) {
        int r = image.length;
        int c = image[0].length;
        //wen not to color
        if(sr<0 || sr > r-1 || sc <0 || sc>c-1 || image[sr][sc] != color) {
            return;
        }
        //new color
        image[sr][sc] = newColor;
        dfs (image, sr+1, sc,  color, newColor);
        dfs (image, sr-1, sc, color, newColor);
        dfs (image, sr, sc+1, color,newColor);
        dfs (image, sr, sc-1, color,newColor);
    }
}
