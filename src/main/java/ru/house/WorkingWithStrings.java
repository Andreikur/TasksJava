package ru.house;

public class WorkingWithStrings {
    private String str;

    public WorkingWithStrings() {
    }

    public WorkingWithStrings(String str) {
        this.str = str;
    }

    public void stringParameters (String str) {
        System.out.println("Имеет длину " + str.length() + " символов.");
        System.out.println("Последний символ в строке: " + str.charAt(str.length()-1));
    }

    //Переворачивает введенную строку
    public String flipTheLine (String str) {
        char[] ch = new char[str.length()];
        int k = 0;
        for (int i = str.length()-1; i >= 0; i-- ) {
            ch[k] = str.charAt(i);
            k++;
        }
        String strOut = new String(ch);
        return strOut;
    }

}
