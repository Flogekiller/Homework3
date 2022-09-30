import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileHandler
{
    public List<Weapons> weaponsList = new ArrayList<>();
   public void csvLesen()
    {
        String[] splittet;
        File file = new File("C:\\Users\\flori\\Documents\\Schule\\3.Klasse\\POS\\Hausübung3\\Homework3\\src\\Weapons.csv");
        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                splittet = line.split(";");
                Weapons weapons = new Weapons(splittet[0], CombatType.valueOf(splittet[1]), DmgType.valueOf(splittet[2]), Integer.parseInt(splittet[3]), Integer.parseInt(splittet[4]), Integer.parseInt(splittet[5]), Integer.parseInt(splittet[6]));
                weaponsList.add(weapons);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void csvLesenMitStream()
    {
        String path = "C:\\Users\\flori\\Documents\\Schule\\3.Klasse\\POS\\Hausübung3\\Homework3\\src\\Weapons.csv";
        try {

            Files.lines(Path.of(path)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
