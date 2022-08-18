package data;

public  class Engine {
    private String modelNo;
    private double maxPower;
    private int maxRPM;
    private int noOfCylinders;

    public Engine(String modelNo, double maxPower, int maxRPM, int noOfCylinders) {
        this.modelNo = modelNo;
        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
        this.noOfCylinders = noOfCylinders;
    }

    public String getModelNo() {
        return modelNo;
    }
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    public double getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }
    public int getMaxRPM() {
        return maxRPM;
    }
    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }
    public int getNoOfCylinders() {
        return noOfCylinders;
    }
    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

   public void display(){

       System.out.println("modelNo = " + modelNo);
       System.out.println("maxPower = " + maxPower +"kW");
       System.out.println("maxRPM = " + maxRPM);
       System.out.println("noOfCylinders = " + noOfCylinders);
   }
}
