package Practice13;


import java.io.*;

import java.util.*;


public class Task6 {
    public static ArrayList <String> res = new ArrayList<>();
    public static boolean isYes(ArrayList<String> wordsList) {
        if (wordsList.size() == 0) return true;
        String lastWord = res.get(res.size()-1);
        for (int i = 0; i < wordsList.size(); i++){
            if (wordsList.get(i).toLowerCase().charAt(0) == lastWord.toLowerCase().charAt(lastWord.length()-1)) {
                res.add(wordsList.get(i));
                ArrayList<String> temp = new ArrayList<String>(wordsList);
                temp.remove(i);
                if (isYes(temp) == true) return true;
            }
        }
        return false;
    }
    public static StringBuilder getLine(String[] words ){
        StringBuilder result = new StringBuilder();
        if (words.length == 0) return result;
        ArrayList<String> wordsList = new ArrayList<>(); // arraylist со словами
        wordsList.addAll(Arrays.asList(words));
        for (int i = 0; i < wordsList.size(); i++){
            res = new ArrayList<>(); // хранит слова в правильном порядке
            ArrayList<String> temp = new ArrayList<String>(wordsList); //копия массива со словами, из которой удалются использованные
            res.add(wordsList.get(i));
            temp.remove(i);
            if (isYes(temp)) break; // если подходящая комбинация найдена
        }
        for (String word: res){
            result.append(word).append(" "); // строим новую строку
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Введите имя файла");
        String fileName;
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        FileReader text = new FileReader(fileName);
        Scanner file = new Scanner(text);
        String[] line = file.nextLine().split(" ");
        System.out.println(getLine(line));
    }
}