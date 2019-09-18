import java.util.Scanner;

public class if_then_else_og_switch {

    //sodavandsautomat
    public static void main(String[] args) {
        //tekst til brugeren så han/hun ved hvad de skal gøre
        System.out.println("Tilsæt dit ønskede beløb");

        // jeg laver en scanner som tjekker hvad brugeren skriver i programmet
        Scanner penge = new Scanner(System.in);

        // her laver jeg en variabel som gør at man kan skrive et tal i programmet
        int Betalt = penge.nextInt();

        // her siger jeg at hvis man betaler for lidt så kan man ikke købe noget
        if (Betalt > 20) {
            // meget tekst
            System.out.println("Du har indbetalt " + Betalt + " kr");
            System.out.println("Du kan nu vælge og købe");
            System.out.println("1: cola 20 kr");
            System.out.println("2: sprite 20 kr");
            System.out.println("3: fanta 20 kr");
            System.out.println("Vælg så 1,2 eller 3 med hvilken sodavand du vil have");

            // her sætter jeg prisen
            int pris = 20;

            //her gør jeg igen så man kan skrive
            int sodavand = penge.nextInt();

            // Her har jeg sat en if statement der gør at hvis man tager en sodavand der ikke findes så får man en fejl
            if (sodavand < 1 || sodavand > 3) {
                System.out.println("Denne sodavand er ugyldig");
            }

            //her laver jeg et switch statement der skal bestemme hvad der sker når man vælger en sodavand
            switch (sodavand) {
                case 1:
                    Betalt = Betalt - pris;
                    System.out.println("Du har valgt og tage cola. så nu har du " + (Betalt + " kr tilbage"));
                    break;
                case 2:
                    Betalt = Betalt - pris;
                    System.out.println("Du har valgt og tage sprite. så nu har du " + (Betalt + " kr tilbage"));
                    break;
                case 3:
                    Betalt = Betalt - pris;
                    System.out.println("Du har valgt og tage fanta. så nu har du " + (Betalt + " kr tilbage"));
                    break;
            }

            // her laver jeg et if statement der skal gøre at hvis man har mere end 20 kr tilbage skal man have en mulighed for at købe en sodavand mere
            if (Betalt > 20) {
                System.out.println("Vil du have endnu en sodavand eller hvis du ikke har fået en vil du så? 1 = ja, 2 = nej");
                // hvis man siger ja til at få en sodavand mere så skal man have endnu en mulighed for at vælge hvilken sodavand man vil have
                int mere = penge.nextInt();
                switch (mere) {
                    case 1:
                        System.out.println("Du har valgt og tage endnu en sodavand vælg imellem 1,2 eller 3 igen med hvilken sodavand du vil have");
                        System.out.println("1: cola 20 kr");
                        System.out.println("2: sprite 20 kr");
                        System.out.println("3: fanta 20 kr");
                        sodavand = penge.nextInt();
                        // her laver jeg et nyt if statement der siger det samme som førhenværende if statement med fejlfinding men her står der bare noget mere bagefter.
                        if (sodavand < 1 || sodavand > 3) {
                            System.out.println("Denne sodavand er ugyldig, vi har desværre ikke dine ønskede sodavand så du får din penge tilbage");
                        }

                        // her sætter jeg et switch statement inde i en anden switch statement fordi hvis man siger ja til at få en sodavand mere så skal man have endnu en mulighed for at vælge hvilken sodavand man vil have
                        switch (sodavand) {
                            case 1:
                                Betalt = Betalt - pris;
                                System.out.println("Du har valgt og tage cola. så nu har du " + Betalt + " kr tilbage");
                                System.out.println("Her er dine byttepenge, tak for dit køb og hav en god dag");
                                break;
                            case 2:
                                Betalt = Betalt - pris;
                                System.out.println("Du har valgt og tage sprite. så nu har du " + Betalt + " kr tilbage");
                                System.out.println("Her er dine byttepenge, tak for dit køb og hav en god dag");
                                break;
                            case 3:
                                Betalt = Betalt - pris;
                                System.out.println("Du har valgt og tage fanta. så nu har du " + Betalt + " kr tilbage");
                                System.out.println("Her er dine byttepenge, tak for dit køb og hav en god dag");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Her er dine byttepenge, tak for dit køb og hav en god dag");
                        break;
                }

                // her sætter jeg et else statement som siger at hvis man har under 20 kroner tilbage skal man bare have sine penge tilbage
            } else {
                System.out.println("Her er dine byttepenge, tak for dit køb og hav en god dag");
            }
        }
        //hvis man ikke har betalt nok penge i starten vil dette ske
        else {
            System.out.println("Du har ikke betalt nok penge");
        }
    }
}
