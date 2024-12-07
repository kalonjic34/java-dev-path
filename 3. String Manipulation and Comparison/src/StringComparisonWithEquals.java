public class StringComparisonWithEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        // Comparing "references"
        System.out.println("Comparing "+str1+ " and "+str2+" using == "+(str1==str2));
        
        System.out.println("Comparing "+str1+ " and "+str3+" using == "+(str1==str3));        
    }
}