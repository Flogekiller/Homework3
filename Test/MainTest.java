import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void TestsortDmg()
    {
        List<Weapons> weaponsList = new ArrayList<>();
        Weapons weapons = new Weapons("Test", CombatType.MELEE, DmgType.BLUNT, 12 ,10, 10, 10 );
        Weapons weapons2 = new Weapons("Test", CombatType.MELEE, DmgType.BLUNT, 10 ,10, 10, 10 );
        weaponsList.add(weapons);
        weaponsList.add(weapons2);
        List<Weapons> weaponsList2 = new ArrayList<>();

            if(weaponsList.get(0).getDamage() < weaponsList.get(1).getDamage())
            {

                weaponsList2.add(weaponsList.get(0));
                weaponsList2.add(weaponsList.get(1));
            }
            else
            {
                weaponsList2.add(weaponsList.get(1));
                weaponsList2.add(weaponsList.get(0));
            }


            Main main = new Main();
            assertEquals(main.sortDmg(weaponsList), weaponsList2);
    }

    @Test
    public void testSortCombatType()
    {
        List<Weapons> weaponsList = new ArrayList<>();
        Weapons weapons = new Weapons("Test", CombatType.RANGED, DmgType.BLUNT, 12 ,10, 10, 10 );
        Weapons weapons2 = new Weapons("Test", CombatType.MELEE, DmgType.BLUNT, 10 ,10, 10, 10 );
        weaponsList.add(weapons);
        weaponsList.add(weapons2);
        List<Weapons> weaponsList2 = new ArrayList<>();

        if(weaponsList.get(0).getCombatType().compareTo(weaponsList.get(1).getCombatType()) < 1)
        {

            weaponsList2.add(weaponsList.get(0));
            weaponsList2.add(weaponsList.get(1));
        }
        else
        {
            weaponsList2.add(weaponsList.get(1));
            weaponsList2.add(weaponsList.get(0));
        }


        Main main = new Main();
        assertEquals(main.sortCombatType(weaponsList), weaponsList2);
    }
    @Test
    public void testSortDamgeType()
    {
        List<Weapons> weaponsList = new ArrayList<>();
        Weapons weapons = new Weapons("Test", CombatType.RANGED, DmgType.BLUNT, 12 ,10, 10, 10 );
        Weapons weapons2 = new Weapons("Test", CombatType.MELEE, DmgType.MISSILE, 10 ,10, 10, 10 );
        weaponsList.add(weapons);
        weaponsList.add(weapons2);
        List<Weapons> weaponsList2 = new ArrayList<>();

        if(weaponsList.get(0).getDamageType().compareTo(weaponsList.get(1).getDamageType()) > 1)
        {

            weaponsList2.add(weaponsList.get(0));
            weaponsList2.add(weaponsList.get(1));
        }
        else
        {
            weaponsList2.add(weaponsList.get(1));
            weaponsList2.add(weaponsList.get(0));
        }


        Main main = new Main();
        assertEquals(main.sortCombatType(weaponsList), weaponsList2);
    }
    @Test
    public void testSortName()
    {
        List<Weapons> weaponsList = new ArrayList<>();
        Weapons weapons = new Weapons("B", CombatType.RANGED, DmgType.BLUNT, 12 ,10, 10, 10 );
        Weapons weapons2 = new Weapons("A", CombatType.MELEE, DmgType.BLUNT, 10 ,10, 10, 10 );
        weaponsList.add(weapons);
        weaponsList.add(weapons2);
        List<Weapons> weaponsList2 = new ArrayList<>();

        if(weaponsList.get(0).getName().compareTo(weaponsList.get(1).getName()) > 1)
        {

            weaponsList2.add(weaponsList.get(0));
            weaponsList2.add(weaponsList.get(1));
        }
        else
        {
            weaponsList2.add(weaponsList.get(1));
            weaponsList2.add(weaponsList.get(0));
        }


        Main main = new Main();
        assertEquals(main.sortCombatType(weaponsList), weaponsList2);
    }
}