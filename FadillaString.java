public class FadillaString {
    public static void main(String[] args) {
        String firstName = "Fadilla";
        System.out.println("My First Name : " + firstName);

        // ------- .length() ---------
        int firstNameLength = firstName.length();
        System.out.println("Length of My Full Name : " + firstNameLength);

        // ------- .indexOf("") ---------
        int textIndexOf = firstName.indexOf("dilla");
        System.out.println("Index Of dilla: " + textIndexOf);

        // ------- .subString(beginIndex, endIndex) ---------
        String subText = firstName.substring(2, 7);
        System.out.println("Subtext index 2-6 : " + subText);

        // ------- .toUpperCase() ---------
        String firstNameUpperCase = firstName.toUpperCase();
        System.out.println("First Name Upper Case : " + firstNameUpperCase);

        // ------- .lowerCase() ---------
        String firstNameLowerCase = firstName.toLowerCase();
        System.out.println("First Name Lower Case : " + firstNameLowerCase);
    }
}
