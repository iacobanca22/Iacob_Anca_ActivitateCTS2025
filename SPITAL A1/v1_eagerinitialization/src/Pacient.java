public class Pacient {
    private boolean patRabatabil;
    private boolean dejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    private static final Pacient instanta= new Pacient();

    private Pacient(){
        this.patRabatabil=false;
        this.dejunInclus=false;
        this.papuciCamera=false;
        this.halatInterior=false;
    }


public boolean getPatRabatabil(){
        return patRabatabil;
}
public void setPatRabatabil(boolean patRabatabil){
    this.patRabatabil=patRabatabil;
}
public boolean getDejunInclus(){
    return dejunInclus;

}
public void setDejunInclus(boolean dejunInclus){
    this.dejunInclus=dejunInclus;
}
public boolean getPapuciCamera(){

        return papuciCamera;
}
public void setPapuciCamera(boolean papuciCamera) {
    this.papuciCamera = papuciCamera;
}
public boolean getHalatInterior(){

        return halatInterior;
}
public void setHalatInterior(boolean halatInterior) {
    this.halatInterior = halatInterior;
}
public static Pacient getInstanta() {
    return instanta;
}
}