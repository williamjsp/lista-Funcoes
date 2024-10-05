package atv12;

public class Utilidades12 {
    public static void conversaoCelsius(double nFahrenheit){
        double celsius = (nFahrenheit - 32) * 5 / 9;
        System.out.println(nFahrenheit+ "º fahrenheit em celsius = "+ celsius+"º");
    }
    public static void conversaoFahrenheit(double nCelsius){
        double fahrenheit = (nCelsius * 9 / 5) + 32;
        System.out.println(nCelsius+ "º celsius em fahrenheit = "+ fahrenheit+"º");
    }

}
