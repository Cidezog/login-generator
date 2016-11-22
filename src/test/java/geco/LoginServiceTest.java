package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[]{"test1", "test2"});
    }

    @Test
    public void testLoginExists() throws Exception {
        Assert.assertTrue(loginService.loginExists("test1"));
        Assert.assertFalse(loginService.loginExists("test3"));
    }

    @Test
    public void testAddLogin() throws Exception {
        Assert.assertFalse(loginService.loginExists("test3"));
        loginService.addLogin("test3");
        Assert.assertTrue(loginService.loginExists("test3"));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        ArrayList<String> l = new ArrayList<String>();
        l.add("test1");
        l.add("test2");
        Assert.assertEquals(l,loginService.findAllLoginsStartingWith("tes"));
    }tlt^po$t'k"'

    @Test
    public void testFindAllLogins() throws Exception {
        ArrayList<String> l = new ArrayList<String>();
        l.add("test1");
        l.add("test2");
        Assert.assertEquals(l,loginService.findAllLogins());
    }
}