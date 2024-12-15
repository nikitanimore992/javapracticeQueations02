


class P_IsomorphicString{
    public static boolean areIsomorphic(String str1, String str2) {
        // If lengths of strings are not equal, they can't be isomorphic
        if (str1.length() != str2.length()) {
            return false;
        }

        // Maps to store character mappings for str1 to str2 and vice versa
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        // Initialize mappings with -1
        for (int i = 0; i < 256; i++) {
            map1[i] = -1;
            map2[i] = -1;
        }

        // Iterate over characters in both strings
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Check if current mapping is consistent
            if (map1[c1] == -1 && map2[c2] == -1) {
                // Create a new mapping
                map1[c1] = c2;
                map2[c2] = c1;
            } else if (map1[c1] != c2 || map2[c2] != c1) {
                // Mapping is inconsistent
                return false;
            }
        }

        // All characters are mapped consistently
        return true;
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        P_IsomorphicString obj = new P_IsomorphicString();
        String s1 = "egg";
        String s2 = "add";
        System.out.println(obj.areIsomorphic(s1, s2));

    }
}