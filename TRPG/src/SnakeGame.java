import java.util.Random;
import java.util.Scanner;

class Snake {
    char marker;
    String name;
    int x, y;

    Snake(String name, char marker) {
        this.marker = marker;
        this.name = name;
    }

    boolean gameOver(char action, char[][] map){
        if (action == 's' && map[y + 1][x] == '#') {
            return true;
        } else if (action == 'w' && map[y - 1][x] == '#') {
           return true;
        } else if (action == 'a' && map[y][x - 1] == '#') {
           return true;
        } else if (action == 'd' && map[y][x + 1] == '#') {
            return true;
        }
        return false;
    }
    boolean move(char action, char[][] map) {
        boolean status = false;
        if (action == 's' && map[y + 1][x] != '*') {
            if (map[y + 1][x] == 'a') {
                status = true;
            }
            map[y + 1][x] = '#';
            map[y][x] = ' ';
            y++;
        } else if (action == 'w' && map[y - 1][x] != '*') {
            if (map[y - 1][x] == 'a') {
                status = true;
            }
            map[y - 1][x] = '#';
            map[y][x] = ' ';
            y--;
        } else if (action == 'a' && map[y][x - 1] != '*') {
            if (map[y][x - 1] == 'a') {
                status = true;
            }
            map[y][x - 1] = '#';
            map[y][x] = ' ';
            x--;
        } else if (action == 'd' && map[y][x + 1] != '*') {
            if (map[y][x + 1] == 'a') {
                status = true;
            }
            map[y][x + 1] = '#';
            map[y][x] = ' ';
            x++;
        }
        return status;
    }
}

class Apple {
    int x, y;

    Apple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Apple() {
    }
}

public class SnakeGame {
    static void randomApple(char[][] map, Snake ss) {
        Random random = new Random();
        boolean success = false;
        while (!success) {
            int ran_y = random.nextInt(1, 9);
            int ran_x = random.nextInt(1, 19);
            if (ran_x != ss.x || ran_y != ss.y) {
                map[ran_y][ran_x] = 'a';
                success = true;
            }
        }
    }

    static void initialize(char[][] map, Snake ss, Apple aa) {
        Random random = new Random();
        int r_y = random.nextInt(1, 9);
        int r_x = random.nextInt(1, 19);
        map[r_y][r_x] = ss.marker;
        ss.x = r_x;
        ss.y = r_y;
        randomApple(map, ss);
        
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                if (row == 0 || row == 9 || col == 0 || col == 19) {
                    map[row][col] = '*';
                } else {
                    if (map[row][col] == '#' || map[row][col] == 'a') {
                        continue;
                    } else {
                        map[row][col] = ' ';
                    }
                }
            }
        }
    }

    static void draw(char[][] map) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] map = new char[10][20];
        Snake s = new Snake("Gimji", '#');
        Apple a = new Apple();
        initialize(map, s, a);
        draw(map);
        char pv_action = ' ';
        while (true) {
            char action = ' ';
            boolean success = false;
            System.out.println("Enter W A S D");
            while (!success) {
                try {
                    action = scan.nextLine().toLowerCase().charAt(0);
                    success = true;
                } catch (Exception ex) {
                    System.out.println("Please Enter W A S D");
                }
            }
            pv_action = action;
            if (s.move(action, map)) {
                randomApple(map, s);
                if (pv_action == 'w') {
                    map[s.y + 1][s.x] = '#';
                } else if (pv_action == 's') {
                    map[s.y - 1][s.x] = '#';
                } else if (pv_action == 'a') {
                    map[s.y][s.x + 1] = '#';
                } else if (pv_action == 'd') {
                    map[s.y][s.x - 1] = '#';
                }
            }
            if (s.gameOver(action, map)){
                System.out.println("Game Over");
                break;
            }
            draw(map);
        }
    }
}
