
public class Main {
    public static void main(String[] args) {

////1   Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.
        String name = "Jonas";
        String surname = "Jonaitis";
        int nameA = name.length();
        int surnameA = surname.length();

        if (nameA < surnameA) {
            System.out.println(name);
        } else {
            System.out.println(surname);
        }

        System.out.println("..............");
//
////2   Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)
//
        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        System.out.println("................");

//
////3   Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        char nameletter = name.charAt(0);
        char surnameletter = surname.charAt(0);

        String total2 = "" + nameletter + surnameletter;


        System.out.println(total2);

        System.out.println("..............");
//
//        //4 Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        String name4 = "Tomas";
        String surname4 = "Hanksas";

        String subname = name4.substring(name4.length() - 3) + surname4.substring(surname4.length() - 3);
        System.out.println(subname);

        System.out.println("..................");

////5   Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String name5 = "An American in Paris";

        System.out.println(name5.replace("a", "*").replace("A", "*"));

        System.out.println("...................");
//
////6   Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.

        String name6 = "An American in Paris";

        System.out.println(name6.replaceAll("[aeiyouAEIYOU]", ""));

        String name62 = "Breakfast at Tiffany's";
        System.out.println(name62.replaceAll("[aeiyouAEIYOU]", ""));

        String name63 = "2001: A Space Odyssey";
        System.out.println(name63.replaceAll("[aeiyouAEIYOU]", ""));

        String name64 = "It's a Wonderful Life";
        System.out.println(name64.replaceAll("[aeiyouAEIYOU]", ""));

        System.out.println("......................");

        //7 Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

        String StarWars = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";
        System.out.println(StarWars);
        System.out.println(StarWars.substring(StarWars.length() - 14, StarWars.length() - 13));

        System.out.println(StarWars.replaceAll("[^0-9]", ""));


        System.out.println("..................");


        //8 Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės. Pakartokite kodą su stringu “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.
        String name8 = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        String name9 = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";


    }
}