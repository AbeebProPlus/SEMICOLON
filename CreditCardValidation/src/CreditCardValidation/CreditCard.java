package CreditCardValidation;

public class CreditCard {
    public String[] doubleEvenPlacesFromRightToLeft(String cardNumber){
        String[] numArr= String.valueOf(cardNumber).split("");
        for (int i = numArr.length - 2; i >= 0; i -= 2){
            numArr[i] = String.valueOf(2 * Integer.parseInt(numArr[i]));
            if (numArr[i].length() > 1){
                numArr[i] = sumOfDoubleEvenPlacesFromRightToLeft(numArr[i]);
            }
        }
        return numArr;
    }
    public String sumOfDoubleEvenPlacesFromRightToLeft(String doubleDigits){
        return String.valueOf(Integer.parseInt(String.valueOf(doubleDigits.charAt(0))) +
                Integer.parseInt(String.valueOf(doubleDigits.charAt(1))));
    }
    public int addAllSingleDigitsInEvenPlaces(String cardNumber){
        int sumOfAllCardDigitsInEvenPlaces = 0;
        String[] numberArr = doubleEvenPlacesFromRightToLeft(cardNumber);
        for (int i = numberArr.length-2; i >= 0; i -= 2){
            sumOfAllCardDigitsInEvenPlaces += Integer.parseInt(numberArr[i]);
        }
        return sumOfAllCardDigitsInEvenPlaces;
    }
    public int addAllDigitsInOddPlacesFromRightToLeft(String cardNumber){
        int  sumOfAllDigitsInOddPlaces = 0;
        String[] numberArr = cardNumber.split("");
        for (int i = numberArr.length - 1; i >= 0; i-=2){
            sumOfAllDigitsInOddPlaces += Integer.parseInt(numberArr[i]);
        }
        return sumOfAllDigitsInOddPlaces;
    }
    public int sumOfEvenPlacesAndOddInCardNumber(String cardNumber){
        return addAllDigitsInOddPlacesFromRightToLeft(cardNumber) + addAllSingleDigitsInEvenPlaces(cardNumber);
    }
    private boolean cardNumberStartsWithValidNumber(String cardNumber){
        return cardNumber.startsWith("4") || cardNumber.startsWith("5")
                || cardNumber.startsWith("37") || cardNumber.startsWith("6");
    }
    private boolean cardLengthIsValid(String cardNumber){
        return cardNumber.length() >= 13 && cardNumber.length() <= 16;
    }
    public boolean cardNumberIsValid(String cardNumber){
        if (cardNumberStartsWithValidNumber(cardNumber) && cardLengthIsValid(cardNumber))
            return sumOfEvenPlacesAndOddInCardNumber(cardNumber) % 10 == 0;
        throw new InvalidCardNumberException("Card number must be between 13 and 16 digits");
    }
}
