package za.ac.cput.elective.entity;

public class ElectiveBuilder {
    private String electName;
    private long electCode;
    private String electDesc;

    public ElectiveBuilder setElectName(String electName) {
        this.electName = electName;
        return this;
    }

    public ElectiveBuilder setElectCode(long electCode) {
        this.electCode = electCode;
        return this;
    }

    public ElectiveBuilder setElectDesc(String electDesc) {
        this.electDesc = electDesc;
        return this;
    }

    public Elective createElective() {

        return new Elective(electName, electCode, electDesc);
    }
}