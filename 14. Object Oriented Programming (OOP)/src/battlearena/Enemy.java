package battlearena;

public class Enemy implements IEnemy{
    private int id;
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private static int numberOfEnemies;


    public Enemy(int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints; 
        this.attackDamage = attackDamage;
        numberOfEnemies++;
        this.id = numberOfEnemies;
    }

    @Override
    public void specialAttack(){
        System.out.println("Enemy does not have a special attack");
    }

    @Deprecated
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getHealthPointsRemaining(){
        return healthPointsRemaining;
    }
    
    
    public void setHealthPointsRemaining(int healthPointsRemaining){
        this.healthPointsRemaining = healthPointsRemaining;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public int getId(){
        return id;
    }

    public static int getNumberOfEnemies(){
        return numberOfEnemies;
    }
    
    @Override
    public void talk(){
        System.out.println("I am a enemy be prepared to fight!");
    }

    @Override
    public void attack(){
        System.out.println("Enemy attacks for "+attackDamage+" damage");
    }

    @Override
    public void setHealthPointsRemaining() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHealthPointsRemaining'");
    }


}