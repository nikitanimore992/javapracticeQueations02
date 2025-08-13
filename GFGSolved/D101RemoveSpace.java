

class D101RemoveSpace{
    String Modify(String s) {
        s = s.replaceAll(" ", ""); // or s.replace(" ", "");
        return s;
    }

    public static void main(String[] args) {
        D101RemoveSpace removespace = new D101RemoveSpace();
        String str = "Geeks for geeks";
        str = removespace.Modify(str);
        System.out.println(str);
    }
}