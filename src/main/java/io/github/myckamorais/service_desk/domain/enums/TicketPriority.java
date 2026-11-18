package io.github.myckamorais.service_desk.domain.enums;

public enum TicketPriority {

    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);

    private int code;

    private TicketPriority (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TicketPriority valueOf (int code){
        for(TicketPriority value : TicketPriority.values()){
            if (value.getCode() == code){
                return value;
            }
        }throw new IllegalArgumentException("Invalid TicketPriority code");
    }
}
