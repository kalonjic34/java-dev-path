package battlearena.heros.weapons;

public class Weapon implements IWeapon {

    
    private String weaponType;
    private int AttackIncrease;


    public Weapon(String weaponType, int AttackIncrease) {
        this.weaponType = weaponType;
        this.AttackIncrease = AttackIncrease;
    }
    
    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public int getAttackIncrease() {
        return AttackIncrease;
    }


}