package varA1_builder;

public class PacientExtraoptiuniBuilder implements Builder {
    boolean micDejun;
    boolean patRabatabil;
    boolean halataInterior;

    public PacientExtraoptiuniBuilder(){
        this.micDejun = false;
        this.patRabatabil = false;
        this.halataInterior = false;
    }
  @Override
    public PacientExtraoptiuni build() {
        return new PacientExtraoptiuni(micDejun,patRabatabil,halataInterior);
  }
  public PacientExtraoptiuniBuilder setMicDejun(boolean micDejun){
        this.micDejun = micDejun;
        return this;
  }
  public PacientExtraoptiuniBuilder setPatRabatabil(boolean patRabatabil){
        this.patRabatabil = patRabatabil;
        return this;
  }
  public PacientExtraoptiuniBuilder setHalataInterior(boolean halataInterior){
        this.halataInterior = halataInterior;
        return this;
  }

}