public class Weapons
{
    String name;
    CombatType combatType;
    DmgType damageType;
    int damage;
    int speed;
    int strength;
    int value;

    public Weapons(String name, CombatType combatType, DmgType damageType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return name +" " + combatType +" " + damageType +" " +damage +" " +speed +" " +strength +" " +value;
    }

    public String getName() {
        return name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public DmgType getDamageType() {
        return damageType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getValue() {
        return value;
    }
}
