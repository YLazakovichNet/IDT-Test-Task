package asserts;

import model.Company;
import org.testng.Assert;

public class CustomAssert extends Assert {

    //TODO need to fix ajax request (POST https://companies.dev.by/recaptcha) waitAjax doesn't help
    public static void verifyCompanyAdditionalInfo(Company company) {
        System.out.println(company);
        String email = company.getEmail();
        String phone = company.getPhone();
        String website = company.getWebsite();

        assertNotNull(email);
        assertNotNull(phone);
        assertNotNull(website);
    }
}
