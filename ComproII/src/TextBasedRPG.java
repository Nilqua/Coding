import java.util.Random;
import java.util.Scanner;

class Character {
    private String name;
    private int hp, atk, def;
    private int pos_x, pos_y;
    char marker;

    Character(String name, int hp, int atk, int def, int pos_x, int pos_y, char marker){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.marker = marker;
    }
    void printInfo(){
        System.out.println("Character name : " + name);
        System.out.println("HP : " + hp);
        System.out.println("Position : " + pos_x + " " + pos_y);
    }
    boolean checkPos(int r, int c){
        if (r == pos_y && c == pos_x){
            return true;
        } else {
            return false;
        }
    }
    void move(char action, char[][] maps){
        if (action == 'w'){
            moveUp(maps);
        } else if (action == 's'){
            moveDown(maps);
        } else if (action == 'a'){
            moveLeft(maps);
        } else if (action == 'd'){
            moveRight(maps);
        }
    }
    boolean moveUp(char[][] maps){
        int x = pos_x;
        int y = pos_y - 1;
        if (maps[y][x] == TextBasedRPG.WALL){
            return false;
        } else {
            pos_y -= 1;
            return true;
        }
    }
    boolean moveDown(char[][] maps){
        int x = pos_x;
        int y = pos_y + 1;
        if (maps[y][x] == TextBasedRPG.WALL){
            return false;
        } else {
            pos_y += 1;
            return true;
        }
    }
    boolean moveLeft(char[][] maps){
        int x = pos_x - 1;
        int y = pos_y;
        if (maps[y][x] == TextBasedRPG.WALL){
            return false;
        } else {
            pos_x -= 1;
            return true;
        }
    }
    boolean moveRight(char[][] maps){
        int x = pos_x + 1;
        int y = pos_y;
        if (maps[y][x] == TextBasedRPG.WALL){
            return false;
        } else {
            pos_x += 1;
            return true;
        }
    }
}

class Hero extends Character{
    Hero(String name, int hp, int atk, int def, int pos_x, int pos_y){
        super(name, hp, atk, def, pos_x, pos_y, 'H');
    }
}

public class TextBasedRPG{
    static char[][] maps;
    static int map_w, map_h;
    static Character[] characters;
    static char MAP_EDGE = '*', GRASS = '#', WALL = '|', PATH = ' ';
    public static void main(String[] args) {
        initializeGame();
        generateMap();

        drawMap();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Hero movement (WASD)");
            char action = sc.nextLine().toLowerCase().charAt(0);
            characters[0].move(action, maps);
            drawMap();

            System.out.println("Enemy movement (WASD)");
            action = sc.nextLine().toLowerCase().charAt(0);
            characters[1].move(action, maps);
            drawMap();
        }
    }
    static void initializeGame(){
        characters = new Character[4];
        characters[0] = new Hero("HERO", 100, 10, 10, 2, 2);
        characters[1] = new Character("ENEMY", 100, 10, 10, 5, 3, 'E');
        characters[2] = new Character("ENEMY", 100, 10, 10, 6, 8, 'E');
        characters[3] = new Character("ENEMY", 100, 10, 10, 9, 3, 'E');

    }
    static void generateMap(){
        Random random = new Random();

        map_w = 20;
        map_h = 10;
        maps = new char[map_h][map_w];
        for (int r=0; r<map_h; r+=1){
            for (int c=0; c<map_w; c+=1){
                double rand = random.nextDouble();
                if (r==0 || r==map_h-1 || c==0 || c==map_w-1){
                    maps[r][c] = MAP_EDGE;
                } else if (rand < 0.1){
                    maps[r][c] = GRASS;
                } else if (rand < 0.2){
                    maps[r][c] = WALL;
                } else {
                    maps[r][c] = PATH;
                }
            }
        }
    }
    static void drawMap(){
        for (int r=0; r<map_h; r+=1){
            for (int c=0; c<map_w; c+=1){
                boolean isDrawMap = true;
                for (Character ch : characters){
                    if (ch.checkPos(r, c)){
                        System.out.print(ch.marker);
                        isDrawMap = false;
                    }
                }

                if (isDrawMap) {
                    System.out.print(maps[r][c]);
                }
            }
            System.out.println();
        }
    }
}