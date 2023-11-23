abstract class Printer {
    protected String model;
    protected int printedCount;
    protected int availableCount;

    Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer {
    InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount <= 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
        availableCount--;
        printedCount++;
        return true;
    }
}

class LaserPrinter extends Printer {
    LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount <= 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
        availableCount--;
        printedCount++;
        return true;
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
