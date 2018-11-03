package tp.logic.objects;

import tp.logic.Game;

public class CommonZombie extends Zombie{
    private static final int HEALTH = 5;
    private static final int FREQUENCY = 2;
    private static final int DAMAGE = 1;

    public CommonZombie(){
        super(FREQUENCY, DAMAGE);
        super.health = HEALTH;
        super.cycle = 0;
    }

    public CommonZombie(int x, int y, Game game){
        super(FREQUENCY, DAMAGE);
        super.game = game;
        super.x = x;
        super.y = y;
        super.health = HEALTH;
        super.cycle = 0;
    }
}
