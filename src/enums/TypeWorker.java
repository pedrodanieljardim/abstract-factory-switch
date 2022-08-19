package enums;

public enum TypeWorker {

    COMISSIONED("comissioned"),
    HOURLY("hourly"),
    SALARIED("salaried");

    final String value;

     TypeWorker(String value) {
        this.value = value;
    }

}
