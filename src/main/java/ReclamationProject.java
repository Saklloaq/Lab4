/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * This is a comment.
 */
public class ReclamationProject {
    /**
     *
     * @param a final string a
     * @param b final string b
     * @return r
     */
    static String doit(final String a, final String b) {
        String r = "";
        String newA = a;
        String newB = b;
        if (a.length() > b.length()) {
            String c = a;
            newA = b;
            newB = c;
            }
        if (a.equals(b)) {
            r = "";
        } else {
            r = "";
        }
        for (int i = 0; i < newA.length(); i++) {
            for (int j = newA.length() - i; j > 0; j--) {
                for (int k = 0; k < newB.length() - j; k++) {
                   //r= (a.regionMatches(i, b, k, j) && j > r.length()) ? a.substring(i, i + j) : r;
                    if (newA.regionMatches(i, b, k, j) && j > r.length()) {
                        r = newA.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
