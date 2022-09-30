import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Main main = new Main();
        FileHandler fileHandler = new FileHandler();
        fileHandler.csvLesen();
        Printable printable = (w -> w.forEach(System.out::println));
        main.sortCombatType(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);
        System.out.println("\n");
        main.sortDmg(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);
        System.out.println("\n");
        main.sortName(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);


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
    private List<Weapons> sortName(List<Weapons> weaponsList)
    {
        Collections.sort(weaponsList, Comparator.comparing(p -> p.getName()));
        return weaponsList;
    }

}
