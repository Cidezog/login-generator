package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginGeneratorTest {

    LoginGenerator loginGenerator;
    @Before
    public void setUp() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        Assert.assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
        Assert.assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"));
        Assert.assertEquals("PDUR1", loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul"));
        Assert.assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling","John"));
    }
}