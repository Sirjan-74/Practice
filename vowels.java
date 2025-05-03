//Finding vowels,consonants,uppercase,lowercase,Digits

import java.util.Scanner;

public class vowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int vowel_count = 0;
        int lower=0;
        int upper = 0;
        int digits=0;
        int consonant_count=0;
        int Len = str.length();
        for (int i = 0; i < Len; i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            }
            if (Character.isLowerCase(ch)) {
                lower++;
            }
            if (Character.isUpperCase(ch)) {
                upper++;
            }
            if (Character.isDigit(ch)) {
                digits++;
            }
            if(Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel_count++;
                } else {
                    consonant_count++;
                }
            }
        }
        System.out.println("vowels are: " + vowel_count);
        System.out.println("Consonants are: " + consonant_count);
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println("Digits: " + digits);

        }

    }
