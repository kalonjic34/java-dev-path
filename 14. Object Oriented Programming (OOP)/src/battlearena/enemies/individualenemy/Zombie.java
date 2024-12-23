package battlearena.enemies.individualenemy;

import battlearena.enemies.Enemy;

public class Zombie extends Enemy implements IZombie{
    
    public Zombie(int healthPoints, int attackDamage){
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk(){
        System.out.println("*Grumbling...*");
    }
    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .50;
        if (didSpecialAttackWork) {
            setHealthPointsRemaining(getHealthPointsRemaining() + 2);
            System.out.println("Zombie regenerated 2 HP!");
        }
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks necks and sticks arms out");
    }
}