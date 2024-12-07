public class StringComparisonEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("java");

        // Comparing "references" memory address
        System.out.println("Comparing str1 and str2 using == "+(str1==str2));
        System.out.println("Comparing str1 and str3 using == "+(str1==str3));
                
        // Comparing the value of variables
        System.out.println("Comparing str1 and str2 using equals() "+str1.equals(str2));        
        System.out.println("Comparing str1 and str3 using equals() "+str1.equals(str3));        
        
        // Comparing the value of variables while ignoring case sensitivity
        System.out.println("Comparing str1 and str2 using equalsIgnoresCase() "+str1.equalsIgnoreCase(str2));        
        System.out.println("Comparing str1 and str3 using equalsIgnoresCase() "+str1.equalsIgnoreCase(str3));        
    
    }
}