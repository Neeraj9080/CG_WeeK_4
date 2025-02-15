package advanceproblems.ValidateCreditCardNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class ValidateCreditCardNumberTest to test our program
public class ValidateCreditCardNumberTest
{
    @Test
    void testValidateCreditCardNumberForVisa()
    {
        // Define the regex pattern for Visa
        String regexForVisa = "^([4][0-9]{3}\\ ){1}([0-9]{4}\\ ){2}[0-9]{4}$";
        Assertions.assertEquals("Valid Visa Credit Card Number",ValidateCreditCardNumber.validateCreditCardNumberForVisa(regexForVisa));
    }

    @Test
    void testValidateCreditCardNumberForMasterCard()
    {
        // Define the regex pattern for MasterCard
        String regexForMasterCard = "^([5][0-9]{3}\\ ){1}([0-9]{4}\\ ){2}[0-9]{4}$";
        Assertions.assertEquals("Valid MasterCard Credit Card Number",ValidateCreditCardNumber.validateCreditCardNumberForMasterCard(regexForMasterCard));
    }
}
