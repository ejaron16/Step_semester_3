package week_1_practise_problems;

public class CustomerIdentity {
    public static void main(String[] args) {
        String customerName = "Sunil";
        String reversed = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversed);
    }

    public static String reverseCustomerName(String customerName) {
        String reversedName = "";
        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversedName += customerName.charAt(i);
        }
        return reversedName;
    }
}