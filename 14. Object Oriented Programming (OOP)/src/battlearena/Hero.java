package battlearena;

public class Hero implements IHero{
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private boolean isWeaponEquipped = false;

    // Composition

    private Weapon weapon;


    public Hero(int healthPoints, int healthPointsRemaining, int attackDamage, boolean isWeaponEquipped, Weapon weapon) {
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPointsRemaining;
        this.attackDamage = attackDamage;
        this.isWeaponEquipped = isWeaponEquipped;
        this.weapon = weapon;
    }

    @Override
    public int getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public int getHealthPointsRemaining() {
        return this.healthPointsRemaining;
    }

    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) {
        this.healthPointsRemaining = healthPointsRemaining;
    }

    @Override
    public int getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipWeapon(){
        if (getWeapon()!= null && isWeaponEquipped()) {
            setAttackDamage(getAttackDamage()+weapon.getAttackIncrease());
            setWeaponEquipped(true);
        }
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }


    public boolean IsWeaponEquipped() {
        return this.isWeaponEquipped;
    }

    @Override
    public void setWeaponEquipped(boolean isWeaponEquipped){
       this.isWeaponEquipped = isWeaponEquipped;
    }

    @Override
    public boolean isWeaponEquipped() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWeaponEquipped'");
    }

    @Override
    public void attack() {
        System.out.println("Hero attacks for "+attackDamage+" damage");
    }

}