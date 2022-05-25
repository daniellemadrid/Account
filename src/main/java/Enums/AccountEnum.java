package Enums;

public enum AccountEnum {

    ACCOUNTALREADY_INITIALIZED("accountalready-initialized");


    private final String valor;

    AccountEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
