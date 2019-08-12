package world.war.ants.game;

/**
 * Basically a unit object.
 */
public class Ant {
    int hp;
    int attack;
    int x;
    int y;

    public Ant(int hp, int attack, int x, int y) {
        this.hp = hp;
        this.attack = attack;
        this.x = x;
        this.y = y;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
