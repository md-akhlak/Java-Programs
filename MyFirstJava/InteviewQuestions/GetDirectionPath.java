package InteviewQuestions;

public class GetDirectionPath {

    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            if (dir == 'S' || dir == 's') {
                y--;
            } else if (dir == 'N' || dir == 'n') {
                y++;
            } else if (dir == 'W' || dir == 'w') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        // S->south , N-> north, E->east, W->west

        String path = "SNNNS";

        System.out.println(getShortestPath(path));

    }
}
