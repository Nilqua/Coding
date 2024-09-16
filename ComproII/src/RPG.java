import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Map {
    char[][] map;
    int[] current_pos = { 1, 1 };
    Random random = new Random();
    int row, col;

    Map(char[][] in, int x, int y, int n, int k) {
        map = in.clone();
        map[1][1] = 'o';
        map[x][y] = 'x';
        row = n;
        col = k;
    }

    void Print() {
        System.out.println();
        for (char[] i : map) {
            for (char j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void GenApple(int x, int y) {
        map[x][y] = 'x';
    }

    void Move(char in, int x, int y) {
        switch (in) {
            case 'W', 'w':
                if (current_pos[0] - 1 == 0) {
                    return;
                } else {
                    if (map[current_pos[0]][current_pos[1]] == 'x') {
                        GenApple(x, y);
                    }
                    map[current_pos[0]][current_pos[1]] = ' ';
                    map[current_pos[0] - 1][current_pos[1]] = 'o';
                    current_pos[0] -= 1;
                }
                break;
            case 'A', 'a':
                if (current_pos[1] - 1 == 0) {
                    return;
                } else {
                    if (map[current_pos[0]][current_pos[1]] == 'x') {
                        GenApple(x, y);
                    }
                    map[current_pos[0]][current_pos[1]] = ' ';
                    map[current_pos[0]][current_pos[1] - 1] = 'o';
                    current_pos[1] -= 1;
                }
                break;
            case 'S', 's':
                if (current_pos[0] == row) {
                    return;
                } else {
                    if (map[current_pos[0]][current_pos[1]] == 'x') {
                        GenApple(x, y);
                    }
                    map[current_pos[0]][current_pos[1]] = ' ';
                    map[current_pos[0] + 1][current_pos[1]] = 'o';
                    current_pos[0] += 1;
                }
                break;
            case 'D', 'd':
                if (current_pos[1] == col) {
                    return;
                } else {
                    if (map[current_pos[0]][current_pos[1]] == 'x') {
                        GenApple(x, y);
                    }
                    map[current_pos[0]][current_pos[1]] = ' ';
                    map[current_pos[0]][current_pos[1] + 1] = 'o';
                    current_pos[1] += 1;
                }
                break;
        }
    }
}

public class RPG {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // Creating map
        int n = 0, k = 0;
        boolean success = false;
        while (!success) {
            try {
                n = scan.nextInt();
                k = scan.nextInt();
                success = true;
            } catch (Exception ex) {
                System.out.println("Please Enter Int");
                scan.nextLine();
            }
        }
        char[][] map = new char[n][k];
        ArrayList<String> line = new ArrayList<>();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String n_line = scan.nextLine();
            line.add(n_line);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                map[i][j] = line.get(i).charAt(j);
            }
        }
        Map t = new Map(map, random.nextInt(n - 1), random.nextInt(k - 1), n, k);

        while (true) {
            t.Print();
            System.out.println("Enter W A S D to move");
            success = false;
            char input = ' ';
            while (!success) {
                try {
                    input = scan.nextLine().charAt(0);
                    if (input != 'W' && input != 'A' && input != 'S' && input != 'D' && input != 'w' && input != 'a'
                            && input != 's' && input != 'd') {
                        System.out.println("Please Enter W A S D");
                        continue;
                    }
                    success = true;
                } catch (Exception ex) {
                    System.out.println("Please Enter W A S D");
                    scan.nextLine();
                }
            }
            t.Move(input, random.nextInt(n - 1), random.nextInt(k - 1));
        }
    }
}