package battlearena;

public interface IEnemy {
     void talk();

     void attack();

     int getHealthPoints();

     int getAttackDamage();
     void setAttackDamage(int attackDamage);

     int getHealthPointsRemaining();
     void setHealthPointsRemaining();

     void specialAttack();
     int getId();
     
}