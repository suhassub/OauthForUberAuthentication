package Oauth2;

import java.util.Arrays;

import Oauth2.OAuth2Credentials.Scope;

public class Oauth2 {

	public static void main(String[] args) {
		OAuth2Credentials credentials = new OAuth2Credentials.Builder()
        .setClientSecrets("9x5d54-oGBfVr-3zC4wAnYyY9783iF9k", "-iREizzW6dqHtqdCZFIjbWTQYxTwiEUdKQxV7Hta")
        .setScopes(Arrays.asList(OAuth2Credentials.Scope.PROFILE, OAuth2Credentials.Scope.REQUEST,
                OAuth2Credentials.Scope.HISTORY))
        .setRedirectUri("https://alexauber.azurewebsites.net?userid='suhas'")
        .build();
		
		String authorizationUrl = credentials.getAuthorizationUrl();
		System.out.println(authorizationUrl);
        
	}

}
