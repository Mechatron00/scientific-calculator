package com.calculator.scientificcalculator;

public class Calculator
{
    private final double pi = Math.PI;
    private final double E = Math.E;
//    private final double tau = Math.TAU;
    public double calculateUnaryNumber(double number1,String operator){
        switch (operator) {
            case "√":
                return (double)Math.sqrt(number1);

            case "3√x":
                return (double) Math.cbrt(number1);

            case "sin":
                double toRadSin = Math.toRadians(number1);
                double sinOut = Math.sin(toRadSin );
                if (Double.isInfinite(sinOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return sinOut;
            case "cos":
                double toRadCos = Math.toRadians(number1);
                double  cosOut= Math.cos(toRadCos );

                if (Double.isInfinite(cosOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return cosOut;
            case "tan":
                double toRadTan = Math.toRadians(number1);
                double  tanOut = Math.tan(toRadTan );

                if (Double.isInfinite(tanOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return tanOut;

            case "1/x":
                return (double) (1/(number1));


            case "sinh":

                double sinhOut = Math.sinh(number1);
                if (Double.isInfinite(sinhOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return sinhOut;

            case "cosh":
                double coshOut = Math.cosh(number1);
                if (Double.isInfinite(coshOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return coshOut;

            case "tanh":
                double tanhOut = Math.tanh(number1);
                if (Double.isInfinite(tanhOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return tanhOut;

            case "sinh^-1":
                double  inverseSinhOut= Math.log(number1 + Math.sqrt((number1 * number1)+1));
                if (Double.isInfinite(inverseSinhOut))
                {
                    throw new ArithmeticException("Not Defined");
                }
                else return inverseSinhOut;

            case "cosh^-1":
                if (number1 >= 1)
                {
                    double inverseCoshOut = Math.log(number1 + Math.sqrt((number1 * number1) - 1));
                    return inverseCoshOut;
                }
                else  throw new IllegalArgumentException("Input cannot be less than 1");

            case "tanh^-1":
                if (Math.abs(number1)<1)
                {
                    double inverseTanhOut = 0.5 * Math.log(((1 + number1)/(1- number1)));
                    return inverseTanhOut;
                }
                else  throw new IllegalArgumentException("Input should be less than 1");

            case "e^x":
                return (double) Math.exp(number1);
            case "x^2":
                return number1*number1;
            case "x^3":
                return number1*number1*number1;
            case "log":
                return (double) Math.log10(number1);
            case "ln":
                return (double) Math.log(number1);

            case "| x |":
                return Math.abs(number1);
            case "n!":
                int fact=1;
                for(int i=1;i<=number1;i++)
                    fact=fact*i;
                return fact;
            default:
                break;
        }
        return 0;
    }
    public double calculateBinaryNumber(double number1,double number2,String operator){
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if(number2==0)
                    return 0;
                return number1 / number2;
            case "rem":
                return number1 % number2;
            case "x^n":
                return (double) Math.pow(number1, number2);
            case "hypot":
                return Math.hypot(number1, number2);
            default:
                break;
        }
        return 0;
    }
}
