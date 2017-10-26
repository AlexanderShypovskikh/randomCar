import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;

public class Car {

    private static final int NUM_MODELS = 100;
    private static final int MIN_YEAR = 1970;
    private static final int MAX_YEAR = 2018;
    private static final double MIN_ENGINE = 1.2;
    private static final double MAX_ENGINE = 5.0;
    private static final double A_C = 0.1;

    private String model;
    private int year;
    private double engine;
    private boolean ac;

    private static Random gen = new Random();
    static SecureRandom rnd = new SecureRandom();
    static final String AB = "0123456789abcdefghijklmnopqrstuvwxyz";

    public Car(String model, int year, double engine, boolean ac) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.ac = ac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean bc) {
        this.ac = ac;
    }

    public static Random getGen() {
        return gen;
    }

    public static void setGen(Random gen) {
        Car.gen = gen;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", ac=" + ac +
                '}';
    }



    public static Car getRandomCar(){
        String model = "model"+gen.nextInt(NUM_MODELS);
        int year = gen.nextInt(MAX_YEAR - MIN_YEAR) + MIN_YEAR;
        double engine = gen.nextDouble()*(MAX_ENGINE - MIN_ENGINE)+ MIN_ENGINE;
        boolean ac = gen.nextInt(1) == A_C;

        return new Car(model, year, engine, ac);
    }


    public static String getRandomString(int l){
        if (l < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(l);
        for( int i = 0; i < l; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

     public static double generateNumber(int number){
        Random random = new Random();
        double sum = 0;
        for(int i = 0; i < number; i++){
            sum += Math.abs(random.nextDouble())*9;
        }

        return sum;
     }

}
