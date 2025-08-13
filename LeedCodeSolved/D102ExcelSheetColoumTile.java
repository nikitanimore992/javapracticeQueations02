

class D102ExcelSheetColoumTile {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            int mod = columnNumber % 26;
            res.append((char) (mod == 0 ? 90 : mod + 64)); // 90 = 'Z', 64 = before 'A'
            columnNumber = columnNumber / 26;
            if (mod == 0) columnNumber--; // Adjust for 'Z'
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        D102ExcelSheetColoumTile converter = new D102ExcelSheetColoumTile();
        
        System.out.println("1 - " + converter.convertToTitle(1));    // A
        System.out.println("26 - " + converter.convertToTitle(26));  // Z
        System.out.println("27 - " + converter.convertToTitle(27));  // AA
        System.out.println("28 - " + converter.convertToTitle(28));  // AB
        System.out.println("701 - " + converter.convertToTitle(701)); // ZY
        System.out.println("702 - " + converter.convertToTitle(702)); // ZZ
        System.out.println("703 - " + converter.convertToTitle(703)); // AAA
    }
}
