public class Car {
    
    //Instance Variables
    private int startMiles;
    private int endMiles;
    private double gallons;

    public Car(){
        //Default Contructor
    }

    public Car(int pStartMiles, int pEndMiles, double pGallons){
        this.startMiles = pStartMiles;
        this.endMiles = pEndMiles;
        this.gallons = pGallons;
    }

    //Setter Method
    public void setGallons(double newGallons){
        this.gallons = newGallons;
    }

    //Getter Method
    public double getGallons(){
        return this.gallons;
    }

    public int getStartMiles(){
        return this.startMiles;
    }

    public int getEndMiles(){
        return this.endMiles;
    }

    public double getMPG(){
        int totalMiles = this.endMiles - this.startMiles;
        double milesPerGallon = totalMiles / this.gallons;
        return milesPerGallon;
    }


}
