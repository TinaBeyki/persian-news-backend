package com.beyki.service.common.dynamicquery;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SearchCriteria {

    private String key;
    private Object value;
    private SearchOperation searchOperation;

    public String toString() {
        return "SearchCriteria{" +
                "key = " + key +
                ", value = " + value +
                ", searchOption = " + searchOperation
                + " }";
    }
}
