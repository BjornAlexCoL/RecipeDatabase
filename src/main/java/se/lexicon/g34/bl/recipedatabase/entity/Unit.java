package se.lexicon.g34.bl.recipedatabase.entity;

public enum Unit {
    TSP("tsp"),
    DSP("dsp"),
    TBLSP("tblsp"),
    L("l"),
    DL("dl"),
    CL("cl"),
    ML("ml"),
    GR("gr"),
    MG("mg"),
    HG("hg"),
    KG("kg");


    private String unit;

    // define a variable like string measurment
    Unit(String unit){
        this.unit=unit;
    }

   public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

