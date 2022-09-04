package codeforces_800;

import java.util.Scanner;

public class Word {
    private String st;


    public static void main(String[] args) {

        Word word= new Word();
        word.inputData();
        System.out.println(word.logic());

    }

    private void inputData() {
        Scanner in = new Scanner(System.in);
        st = in.nextLine();
    }

    private String logic() {
        String result;
        if (Character.isLowerCase(st.charAt(0))) {
            result = Character.toString(Character.toUpperCase(st.charAt(0))) + st.substring(1);
        } else result = st;
        return result;

    }

}
/*
A. Капитализация слова
ограничение по времени на тест2 секунды
ограничение по памяти на тест256 мегабайт
вводстандартный ввод
выводстандартный вывод
Капитализация — это запись слова, в которой первая буква слова записывается как прописная буква. Ваша задача, вывести капитализацию заданного слова.

Обратите внимание, что в капитализации все буквы слова кроме первой остаются не измененными.

Входные данные
В первой строке записано непустое слово. Слово состоит из строчных и прописных букв латинского алфавита. Длина заданного слова не превосходит 103 букв.

Выходные данные
Выведите капитализацию слова.
 */
