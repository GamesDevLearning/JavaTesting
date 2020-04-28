
package StringReverse;

/**
 *
 * @author coding_java
 */
public class ReverseString {
    public String reverseit(String s){
        var StrArray = s.toCharArray();
    String result = "";
    for (int i = s.length() -1; i >= 0; i--){
         result += s.charAt(i);
    }
    return (result);
    }
    
}
