package io.github.myckamorais.service_desk.domain.enums;

public enum UserRole {

    REQUESTER(1),
    AGENT(2),
    ADMIN(3);

    private int code;

    private UserRole (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserRole valueOf (int code){
        for (UserRole value : UserRole.values()){
            if (value.getCode() == code){
                return value;
            }
        }throw new IllegalArgumentException("Invalid UserRole code");
    }
}
