package javacore;

public class LocalClassExample {
    static String regulerExpression = "[^0-9]";
    public static void validatedPhoneNumber(String phoneNumber) {
        final int numberLength = 12;
        class PhoneNumber {
            String formattedPhoneNumber = null;
            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regulerExpression, "");
                if(currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                }else{
                    formattedPhoneNumber = null;
                }
            }
            public String getNumber (){
                return formattedPhoneNumber;
            }
        }
        PhoneNumber number = new PhoneNumber(phoneNumber);
        if(number.formattedPhoneNumber != null) {
            System.out.println(number.formattedPhoneNumber);
        }else{
            System.out.println("Invalid phone number");
        }
    }

    public static void main(String[] args) {
        validatedPhoneNumber("+62-890-555-557");
    }
}
