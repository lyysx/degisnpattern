package structural.adapter.example;

/**
 * @author liuyangyang
 * @since 2023-02-01 22:20
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("fix by roundPeg"); 
        }
        SquarePeg smallOne = new SquarePeg(2);
        SquarePeg largeOne = new SquarePeg(20);
        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallOne);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeOne);

        if (hole.fits(smallAdapter)) {
            System.out.println("fix by smallOne");
        }
        if (!hole.fits(largeAdapter)) {
            System.out.println("not fix by largeOne");
        }
    }
}
