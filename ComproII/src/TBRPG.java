import java.util.Random;
import java.util.Scanner;

class Character {
    private String name;
    private int pos_x, pos_y;
    char marker;

    Character(String name, char marker) {
        this.name = name;
        this.marker = marker;
    }
}

class Hero extends Character {
    Hero(String name, char marker) {
        super(name, marker);
    }
}

class Enemy extends Character {
    Enemy(String name, char marker) {
        super(name, marker);
    }
}

class Map {
    char[][] rpg_map = new char[10][20];
    char edge = '*', grass = '#', wall = '|', path = ' ';

    Map(Character[] ch) {
        initialize(ch);
        draw();
    }

    void initialize(Character[] ch) {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int r_x = random.nextInt(1, 19);
            int r_y = random.nextInt(1, 9);
            rpg_map[r_x][r_y] = ch[i].marker;
        }
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                double r_num = random.nextDouble();
                if (row == 0 || row == 9 || col == 0 || col == 19) {
                    rpg_map[row][col] = edge;
                } else {
                    if (rpg_map[row][col] == ' ') {
                        if (r_num < 0.1) {
                            rpg_map[row][col] = grass;
                        } else if (r_num < 0.2) {
                            rpg_map[row][col] = wall;
                        } else {
                            rpg_map[row][col] = path;
                        }
                    }
                }
            }
        }
    }

    void draw() {
        for (char[] i : rpg_map) {
            for (char j : i) {
                System.out.println(j);
            }
            System.out.println();
        }
    }
}

public class TBRPG {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    static Character[] characters;
    static Map map;

    // Initialize
    static void initialize() {
        characters = new Character[4];
        characters[0] = new Hero("Hero", 'H');
        characters[1] = new Enemy("Enemy", 'E');
        characters[2] = new Enemy("Enemy", 'E');
        characters[3] = new Enemy("Enemy", 'E');
        map = new Map(characters);
    }
}
