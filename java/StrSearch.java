// Задается строка (Сегодня великолепная погода):
// 1. Найти количество слов
// 2. Вывести на экран слово максимальной длины

public class StrSearch {
  public static void main(String[] args) {

    String sentence = "There is a wonderful weather today!";

    int wordsCount = 1;
    int tempLen = 0;
    int maxLen = 0;

    int wordStartTemp = 0;
    int wordEndTempp = 0;
    int maxWordStart = 0;
    int maxWordEnd = 0;
    sentence = " " + sentence;

    for (int i = 0; i < sentence.length()-1; i++) {

      if (sentence.charAt(i) == ' ' && sentence.charAt(i) + 1 != ' ') {
        wordsCount++;

        if (tempLen > maxLen) {
          maxLen = tempLen;
          tempLen = 0;
        } else {
          tempLen++;
        }

      }
    }
    System.out.println(wordsCount);
  }
}
