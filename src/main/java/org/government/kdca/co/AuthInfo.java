package org.government.kdca.co;

import java.io.Serializable;

public class AuthInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String authKey;
    private String authStatus;

    public AuthInfo() {
    }

    public AuthInfo(String authKey, String authStatus) {
        this.authKey = authKey;
        this.authStatus = authStatus;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getAuthStatus() {
        return this.authStatus;
    }
}
