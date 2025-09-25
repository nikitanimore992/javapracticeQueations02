class D4ZigzagConversion{
     public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rows[currentRow] += c; // put character in the current row

            // 🔹 Move direction logic must be inside the loop
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        String result = "";
        for (String row : rows) {
            result += row;
        }

        return result;
    }
    public static void main(String[] args) {
        D4ZigzagConversion solver = new D4ZigzagConversion();

        System.out.println(solver.convert("PAYPALISHIRING", 3)); // "PAHNAPLSIIGYIR"
        System.out.println(solver.convert("PAYPALISHIRING", 4)); // "PINALSIGYAHRPI"
        System.out.println(solver.convert("A", 1));              // "A"
    }
}