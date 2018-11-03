package tp.logic.objects;

import tp.logic.Game;

public abstract class GameObject {
    protected int x;
    protected int y;
    protected Game game;
    protected int health;
    protected int cycle;

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public abstract void update();

    public abstract void decreaseHealth(int damage);

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setGame(Game g){
        this.game = g;
    }

    public abstract String toString();
}
