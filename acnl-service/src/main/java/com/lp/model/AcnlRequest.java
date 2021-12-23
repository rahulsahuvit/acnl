package com.lp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/
public class AcnlRequest {

    private String clientId;
    private String accountNumber;
    private String tokenId;

    @JsonProperty
    boolean isDomestic;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public boolean getDomestic(){
        return isDomestic;
    }

    @Override
    public String toString() {
        return "AcnlRequest{" +
                "clientId='" + clientId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", isDomestic=" + isDomestic +
                '}';
    }
}
