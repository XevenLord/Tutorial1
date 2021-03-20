package Tutorial1;

public class Telephone {
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, String number){
        numberOfTelephoneObject++;
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String makeFullNumber(){
        String str = areaCode + "-" + number;
        return str;
    }
}
