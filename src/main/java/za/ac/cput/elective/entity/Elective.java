package za.ac.cput.elective.entity;

public class Elective {

    private String electName;
    private long electCode;
    private String electDesc;


    //Argument Constructor
     Elective(String electName, long electCode, String electDesc) {
        this.electName = electName;
        this.electCode = electCode;
        this.electDesc = electDesc;
    }

    @Override
    public String toString() {
        return "Elective{" +
                "electName='" + electName + '\'' +
                ", electCode=" + electCode +
                ", electDesc='" + electDesc + '\'' +'}';
    }

    //start of main method
    public static void main(String[]args){}
}



