package Exercices2;

public class WordCounter {
    public static void main(String[] args) {
        String str = "Hello World just for testing";

        System.out.println("Count :" +countWord(str));
        System.out.println("Count2 :" +countWord2(str));
    }

    public static int countWord(String str) {
        int count =0;
        if(str == null || str.isEmpty()){
            return 0;
        }
       String []word = str.split("\\s");
        count = word.length;
        return count;
    }
    public static int countWord2(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        int wordCount =0;
        boolean isWord = false;
        int endOfLine = str.length()-1;
        char[] characters = str.toCharArray();
        for(int i=0; i<characters.length;i++){
            //if the char is a Letter , word =true
            if(Character.isLetter(characters[i])&& i !=endOfLine){
                isWord = true;

            }else if(!Character.isLetter(characters[i])&&isWord){
                wordCount++;
                isWord = false;
            }else if(Character.isLetter(characters[i])&&i==endOfLine){
                wordCount++;
            }

        }
        return wordCount;
    }

}
