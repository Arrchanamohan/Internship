package services;

import org.junit.Test;

/**
 * Created by VARSA on 14-11-2015.
 */
public class LoginServiceTest {

    @Test
    public void testLoginService() {
        LoginService loginService = new LoginService();
        loginService.login();
    }
}
