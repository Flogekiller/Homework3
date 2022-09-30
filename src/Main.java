import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Main main = new Main();
        FileHandler fileHandler = new FileHandler();
        fileHandler.csvLesen();
    }

    private List<Weapons> sortDmg(List<Weapons> weaponsList)
    {
      Collections.sort(weaponsList, Comparator.comparing(p -> p.getDamage()));
      return weaponsList;
    }
    private List<Weapons> sortCombatType(List<Weapons> weaponsList)
    {
        Collections.sort(weaponsList, Comparator.comparing(p -> p.getCombatType()));
        return weaponsList;
    }

}
