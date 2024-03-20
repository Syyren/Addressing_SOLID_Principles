package violated.OCP;

import java.util.ArrayList;

public class Inventory
{
    public ArrayList<Weapon> weapons;
    public ArrayList<Armor> armor;

    public ArrayList<Weapon> getWeapons()
    {
        return this.weapons;
    }
    public void addWeapon(Weapon weapon)
    {
        this.weapons.add(weapon);
    }
    public ArrayList<Armor> getArmor()
    {
        return this.armor;
    }
    public void addArmor(Armor armor)
    {
        this.armor.add(armor);
    }
}
