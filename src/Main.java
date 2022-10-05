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
        Printable printable = (w -> {
            int nameWith = 0;
            int combatTypeWidth = 0;
            int damageTypeWidht = 0;
            int damageWidth = 0;
            int speedWidth = 0;
            int strengthWidth = 0;
            int valueWidth = 0;

            for (int i = 0; i < w.size(); i++) {
                nameWith = main.vergleiche(nameWith, w.get(i).name);
                combatTypeWidth = main.vergleiche(combatTypeWidth, w.get(i).combatType.toString());
                damageTypeWidht = main.vergleiche(damageTypeWidht, w.get(i).damageType.toString());
                damageWidth = main.vergleiche(damageWidth, String.valueOf(w.get(i).damage));
                speedWidth = main.vergleiche(speedWidth, String.valueOf(w.get(i).speed));
                strengthWidth = main.vergleiche(strengthWidth, String.valueOf(w.get(i).strength));
                valueWidth = main.vergleiche(valueWidth, String.valueOf(w.get(i).value));
            }
            for (int i = 0; i < w.size(); i++) {
                main.printColumn(nameWith, w.get(i).name);
                main.printColumn(combatTypeWidth, w.get(i).combatType.toString());
                main.printColumn(damageTypeWidht, w.get(i).damageType.toString());
                main.printColumn(damageWidth, String.valueOf(w.get(i).damage));
                main.printColumn(speedWidth, String.valueOf(w.get(i).speed));
                main.printColumn(strengthWidth, String.valueOf(w.get(i).strength));
                main.printColumn(valueWidth, String.valueOf(w.get(i).value));

                System.out.println();
                main.printPlus(nameWith);
                main.printPlus(combatTypeWidth);
                main.printPlus(damageTypeWidht);
                main.printPlus(damageWidth);
                main.printPlus(speedWidth);
                main.printPlus(strengthWidth);
                main.printPlus(valueWidth);

                System.out.println();
            }
        });
        main.sortCombatType(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);
      System.out.println("\n");
        main.sortDmg(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);
        System.out.println("\n");
       main.sortName(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);
        System.out.println("\n");
        main.sortDmgType(fileHandler.weaponsList);
        printable.print(fileHandler.weaponsList);

    }

    public List<Weapons> sortDmg(List<Weapons> weaponsList)
    {
      Collections.sort(weaponsList, Comparator.comparing(p -> p.getDamage()));
      return weaponsList;
    }
    public List<Weapons> sortCombatType(List<Weapons> weaponsList)
    {
        Collections.sort(weaponsList, Comparator.comparing(p -> p.getCombatType()));

        return weaponsList;
    }
   public List<Weapons> sortName(List<Weapons> weaponsList)
    {
        Collections.sort(weaponsList, Comparator.comparing(p -> p.getName()));
        return weaponsList;
    }
    public List<Weapons> sortDmgType(List<Weapons> weaponsList)
    {
        Collections.sort(weaponsList, Comparator.comparing(p -> p.getDamageType()));
        return weaponsList;
    }
    private int vergleiche(int a, String b)
    {
        if(a < b.length())
        {
            return b.length();
        }
        else
        {
            return a;
        }
    }
    private void printColumn(int maxWidth, String value)
    {
        int spaces = maxWidth-value.length();
        System.out.print(value);
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.print("|");

    }
    private void printPlus(int maxWidth)
    {
        for (int i = 0; i < maxWidth; i++) {
            System.out.print("-");
        }
        System.out.print("+");

    }


}
