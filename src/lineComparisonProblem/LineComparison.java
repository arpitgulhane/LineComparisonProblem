package lineComparisonProblem;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("    Welcome to Line Comparison Computation Program on Master Branch      ");
        Linee line = new Linee(0, 0, 3, 4);
        Linee line2 = new Linee(0, 0, 5, 4);
        double length = line.getLength();
        double length2 = line2.getLength();
        System.out.println("Length of line 1: " + length);
        System.out.println("Length of line 2: " + length2);

        equal(length,length2);
    }
    static void equal(double length1,double length2){
        if(length1==length2){
            System.out.println("Two lines are Equal");
        }else {
            System.out.println("Two Lines are Not equal");
        }
    }
}


class Linee {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Linee(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
}

