package io.github.myckamorais.service_desk.domain.enums;

public enum TicketStatus {

    OPEN(1),
    IN_PROGRESS(2),
    WAITING_FOR_REQUESTER(3),
    RESOLVED(4),
    CLOSED(5);

    private int code;

    private TicketStatus (int code)
        {this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static TicketStatus valueOf (int code){
        for (TicketStatus value : TicketStatus.values()){
            if (code == value.getCode()){
                return value;
            }
        }throw new IllegalArgumentException("Invalid TicketStatus code");
    }

}
