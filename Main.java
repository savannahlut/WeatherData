import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Double> temps = new ArrayList<Double>();
        //temps.add(99.1);
        double[] temperatures = {99.1, 142, 85, 85.1, 84.6, 94.3, 124.9, 98, 101, 102.5};
        for(double n : temperatures) temps.add(n); 
        WeatherData michigan = new WeatherData(temps);
        System.out.println(temps);
        michigan.cleanData(85.0, 120.0);
        System.out.println(temps);

        ArrayList<Double> hola = new ArrayList<Double>();
        double[] clima = {};
        for(double n : clima) hola.add(n); 
        WeatherData puertoRico = new WeatherData(temps);
        System.out.println(hola);
        System.out.println(puertoRico.longestHeatWave(100.5));
    }
}