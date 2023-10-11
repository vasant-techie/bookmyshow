package com.bookmyshow.consumer.api.constants;

public interface ConsApiConstants {
    String usersByUsernameQuery = "select username, password, enabled from bms.users where username = ?";
    String authsByUserQuery = "select username, authority from bms.authorities where username = ?";

    String AJP_VERSION = "AJP/1.3";
    int REDIRECT_PORT = 8443;
    String CONNECTOR_SCHEME = "https";

}
