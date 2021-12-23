package com.lp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcnlResponse {

    private String result;
    private boolean isFastFund;
    private int reasonCode;

}
