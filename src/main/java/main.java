public class main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        switch(args[0]) {
            case "add":
                System.out.println(calc.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "subtract":
                System.out.println(calc.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "multiply":
                System.out.println(calc.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "divide":
                System.out.println(calc.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "fibonacci":
                System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(args[1])));
                break;
            case "binary":
                System.out.println(calc.intToBinaryNumber(Integer.parseInt(args[1])));
                break;
            default:
                System.out.println("Default");
                System.out.println(args[1]);
                break;
        }
    }
}
