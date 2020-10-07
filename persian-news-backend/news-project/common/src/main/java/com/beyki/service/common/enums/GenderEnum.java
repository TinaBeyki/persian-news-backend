package com.beyki.service.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum GenderEnum {

    FEMALE("F", "FEMALE"),
    MALE("M", "MALE"),
    UNDIFIEND("U", "UNDIFIEND");

    private String value;
    private String desc;

    public static GenderEnum fromValue(String value) {

        for(final GenderEnum genderEnum: GenderEnum.values()) {
            if(genderEnum.getValue().equals(value)) {
                return genderEnum;
            }
        }
        return null;
        //Todo
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
       // return ResourceBundle.getBundle()
        return desc;
        //Todo
    }
}
