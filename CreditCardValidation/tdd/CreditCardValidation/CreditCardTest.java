package CreditCardValidation;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CreditCardTest {
    private CreditCard creditCard;

    @BeforeEach
    public void setUp(){
        creditCard = new CreditCard();
    }
    @Test
    public void testDoubleEvenPlacesFromRightToLeft(){
        String[] numArr = creditCard.doubleEvenPlacesFromRightToLeft("4388576018410707");
        String[] numArr2 = {"8", "3", "7", "8", "1", "7", "3", "0", "2", "8", "8", "1", "0", "7", "0", "7"};
        assertArrayEquals(numArr2, numArr);
    }
    @Test
    public void testSumOfDoubleEvenPlacesFromRightToLeft(){
        int sum = Integer.parseInt(creditCard.sumOfDoubleEvenPlacesFromRightToLeft("15"));
        assertEquals(6, sum);
    }
    @Test
    public void testAddAllSingleDigitsInEvenPlaces(){
        int sum = creditCard.addAllSingleDigitsInEvenPlaces("4388576018402626");
        assertEquals(37, sum);
    }
    @Test
    public void testAddAllDigitsInOddPlacesFromRightToLeft(){
        int sum = creditCard.addAllDigitsInOddPlacesFromRightToLeft("4388576018402626");
        assertEquals(38, sum);
    }
    @Test
    public void testThatCardNumberIsValid(){
        boolean isValid = creditCard.cardNumberIsValid("4388576018410707");
        assertTrue(isValid);
    }
    @Test
    public void testThatExceptionIsThrownForInvalidCardNumber(){
        assertThrows(InvalidCardNumberException.class, () -> creditCard.cardNumberIsValid("1234"));
    }
}
