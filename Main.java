public class Main {
    public static void main(String[] args) {
        int n = 90;
        Maze maze = new Maze(n);
        StdDraw.enableDoubleBuffering();
        maze.draw();
        maze.solve();
    }
}
