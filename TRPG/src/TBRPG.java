import java.util.Random;
import java.util.Scanner;

class Character {
    String name;
    public int pos_x, pos_y;
    char marker;
    int hp, atk;

    Character(String name, char marker) {
        this.name = name;
        this.marker = marker;
    }

    void move(char action, char[][] map) {
        if (action == 's' && map[pos_y + 1][pos_x] == ' ') {
            if (map[pos_y + 1][pos_x] == 'E') {
                System.out.println("Detect!");
            }
            map[pos_y + 1][pos_x] = 'H';
            map[pos_y][pos_x] = ' ';
            pos_y++;
        } else if (action == 'w' && map[pos_y - 1][pos_x] == ' ') {
            if (map[pos_y - 1][pos_x] == 'E') {
                System.out.println("Detect!");
            }
            map[pos_y - 1][pos_x] = 'H';
            map[pos_y][pos_x] = ' ';
            pos_y--;
        } else if (action == 'a' && map[pos_y][pos_x - 1] == ' ') {
            if (map[pos_y][pos_x - 1] == 'E') {
                System.out.println("Detect!");
            }
            map[pos_y][pos_x - 1] = 'H';
            map[pos_y][pos_x] = ' ';
            pos_x--;
        } else if (action == 'd' && map[pos_y][pos_x + 1] == ' ') {
            if (map[pos_y][pos_x + 1] == 'E') {
                System.out.println("Detect!");
            }
            map[pos_y][pos_x + 1] = 'H';
            map[pos_y][pos_x] = ' ';
            pos_x++;
        }
    }
}

class Hero extends Character {
    Hero(String name, char marker) {
        super(name, marker);
        hp = 1000;
        atk = 50;
    }
}

class Enemy extends Character {
    Enemy(String name, char marker) {
        super(name, marker);
        hp = 100;
        atk = 10;
    }
}

public class TBRPG {
    static void printInfo(Character[] ch) {
        for (int i = 0; i < 4; i++) {
            String line = String.format("Name : %s\nHp : %d\nAtk : %d", ch[i].name, ch[i].hp, ch[i].atk);
            System.out.println(line);
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

    static void initialize(char[][] map, Character[] ch) {
        Random random = new Random();
        char edge = '*', grass = '#', wall = '|', path = ' ';
        for (int i = 0; i < 4; i++) {
            int r_y = random.nextInt(1, 9);
            int r_x = random.nextInt(1, 19);
            map[r_y][r_x] = ch[i].marker;
            ch[i].pos_y = r_y;
            ch[i].pos_x = r_x;

            System.out.println(ch[i].marker + "| x:" + ch[i].pos_x + "| y: " + ch[i].pos_y);
        }
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                double r_num = random.nextDouble();
                if (row == 0 || row == 9 || col == 0 || col == 19) {
                    map[row][col] = edge;
                } else {
                    if (map[row][col] == 'H' || map[row][col] == 'E') {
                        continue;
                    } else {
                        if (r_num < 0.05) {
                            map[row][col] = grass;
                        } else if (r_num < 0.1) {
                            map[row][col] = wall;
                        } else {
                            map[row][col] = path;
                        }
                    }
                }
            }
        }
    }

    static void atkEnemy(char action, Character[] ch, char[][] map) {
        int x = ch[0].pos_x, y = ch[0].pos_y;
        if (action == 's' && map[y + 1][x] == 'E') {
            for (int i = 1; i < 4; i++) {
                if (ch[i].pos_x == x && ch[i].pos_y == y + 1) {
                    ch[i].hp -= ch[0].atk;
                }
            }
        } else if (action == 'w' && map[y - 1][x] == 'E') {
            for (int i = 1; i < 4; i++) {
                if (ch[i].pos_x == x && ch[i].pos_y == y - 1) {
                    ch[i].hp -= ch[0].atk;
                    ch[0].hp -= ch[i].atk;
                }
            }
        } else if (action == 'a' && map[y][x - 1] == 'E') {
            for (int i = 1; i < 4; i++) {
                if (ch[i].pos_x == x - 1 && ch[i].pos_y == y) {
                    ch[i].hp -= ch[0].atk;
                    ch[0].hp -= ch[i].atk;
                }
            }
        } else if (action == 'd' && map[y][x + 1] == 'E') {
            for (int i = 1; i < 4; i++) {
                if (ch[i].pos_x == x + 1 && ch[i].pos_y == y) {
                    ch[i].hp -= ch[0].atk;
                    ch[0].hp -= ch[i].atk;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Character[] characters = new Character[4];
        char[][] map = new char[10][20];

        characters[0] = new Hero("Hero", 'H');
        characters[1] = new Enemy("Enemy", 'E');
        characters[2] = new Enemy("Enemy", 'E');
        characters[3] = new Enemy("Enemy", 'E');
        initialize(map, characters);
        draw(map);

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
            atkEnemy(action, characters, map);
            characters[0].move(action, map);
            draw(map);
            printInfo(characters);
        }
    }
}
