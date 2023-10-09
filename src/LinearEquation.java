
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class LinearEquation {
    NumberFormat formatter = new DecimalFormat("#0.0");
    NumberFormat formatter2 = new DecimalFormat("#0.00");


    private int x1;
    private int y1;
    private int x2;
    private int y2;


    private double slope;
    private double yIntercept;

    private double xThree;

    String coordinateOne;
    String coordinateTwo;



    public LinearEquation(String coordinateOne, String coordinateTwo){
        String xOne = coordinateOne.substring(1, coordinateOne.indexOf(","));
        String yOne = coordinateOne.substring(coordinateOne.indexOf(",")+1, coordinateOne.indexOf(")"));
        String xTwo = coordinateTwo.substring(1, coordinateTwo.indexOf(","));
        String yTwo = coordinateTwo.substring(coordinateTwo.indexOf(",")+1, coordinateTwo.indexOf(")"));
        x1 = Integer.parseInt(xOne);
        x2 = Integer.parseInt(xTwo);
        y1 = Integer.parseInt(yOne);
        y2 = Integer.parseInt(yTwo);
    }

    public String getCoordinateOne(){
        String c1 = "("+x1+","+y1+")";
        return c1;
    }
    public String getCoordinateTwo(){
        String c2 = "("+x1+","+y1+")";
        return c2;
    }

    public double getSlope(){
        double slope = (double)(y2 -y1)/(x2-x1);
        return slope;
    }
    public double getIntercept(){
        double yIntercept = y1-(getSlope()*x1);
        return yIntercept;
    }
    public String fractionSlope(){
         double numerator = getSlope()*10;
         int denominator = 10;
         String fractionSlope = (int)(numerator) + "/" + denominator;
         return fractionSlope;
    }

    public String getEquation(){
        String equation = "y = " + fractionSlope() + "x " + "+ " + formatter.format(getIntercept());
        return equation;
    }

    public double getDistance(){
        double height = y2 - y1;
        double length = x2 -x1;
        Math.abs(height);
        Math.abs(length);
        double distance = Math.hypot(height, length);
        return distance;
    }

    public String toString(){
        String result = "First Pair: (" + x1 + "," + y1 + ")"
                + "\nSecond Pair: (" + x2 + "," + y2 + ")"
                + "\nSlope of Line: " + formatter.format(getSlope())
                + "\nY-intercept: " + formatter.format(getIntercept())
                + "\nSlope intercept form: " + getEquation()
                + "\nDistance: " + formatter2.format(getDistance());

        return result;
    }

    public String getValue(double xThree){
        double thirdx = xThree;
        String m = formatter.format(getSlope());
        double slope1 = Double.parseDouble(m);
        double result = slope1*xThree + getIntercept();
        String finalCoordinate = "(" + xThree + "," + result + ")";
        return finalCoordinate;
    }

}
