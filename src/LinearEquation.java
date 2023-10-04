public class LinearEquation {

    private double x1;
    private double y1;
    private double x2;
    private double y2;


    private double slope;
    private double yIntercept;

    String coordinateOne;
    String coordinateTwo;

    public LinearEquation(String coordinateOne, String coordinateTwo){
        String xOne = coordinateOne.substring(1, coordinateOne.indexOf(","));
        String yOne = coordinateOne.substring(coordinateOne.indexOf(",")+1, coordinateOne.indexOf(")"));
        String xTwo = coordinateTwo.substring(1, coordinateTwo.indexOf(","));
        String yTwo = coordinateTwo.substring(coordinateTwo.indexOf(",")+1, coordinateTwo.indexOf(")"));
        x1 = Double.parseDouble(xOne);
        x2 = Double.parseDouble(xTwo);
        y1 = Double.parseDouble(yOne);
        y2 = Double.parseDouble(yTwo);
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
        double slope = (y2 -y1)/(x2-x1);
        return slope;
    }
    public double getIntercept(){
        double yIntercept = y1/(getSlope()*x1);
        return yIntercept;
    }

    public String getEquation(){
        String equation = "y = " + getSlope() + "x " + "+ " + getIntercept();
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
                + "\nSlope of Line: " + getSlope()
                + "\nY-intercept: " + getIntercept()
                + "\nSlope intercept form: " + getEquation()
                + "\nDistance: " + getDistance();

        return result;
    }
}
