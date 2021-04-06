public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return a.trim().concat(b.trim());
    }

    public Integer getIndexOrNull(String a, char c) {
        if (a.indexOf(c) == -1) {
            return null;
        } else {
            return a.indexOf(c);
        }
    }

    public Integer getIndexOrNull(String a, String b) {
        if (a.indexOf(b) == -1) {
            return null;
        } else {
            return a.indexOf(b);
        }
    }

    public String concatSubstring(String a, int z, int y, String b) {
        return a.substring(z,y).concat(b);
    }
}