package varA1_builder;
public class PacientExtraoptiuni {
    boolean micDejun;
    boolean patRabatabil;
    boolean halataInterior;

    public PacientExtraoptiuni(){
        super();
        this.micDejun = false;
        this.patRabatabil = false;
        this.halataInterior = false;
    }
    public PacientExtraoptiuni(boolean micDejun, boolean patRabatabil, boolean halataInterior){
        super();
        this.micDejun = micDejun;
        this.patRabatabil = patRabatabil;
        this.halataInterior = halataInterior;
    }

    public boolean isHalataInterior() {
        return halataInterior;
    }
    public void setHalataInterior(boolean halataInterior) {
        this.halataInterior = halataInterior;
    }
    public boolean isMicDejun() {
        return micDejun;

    }
    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }
    public boolean isPatRabatabil() {
        return patRabatabil;
    }
    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }
    @Override
    public String toString(){
        return "Extraoptiuni:\n"+"mic dejun:"+micDejun+"  "+"pat Rabatabil:"+patRabatabil+"  "+"halata interior:"+halataInterior;
    }
}
