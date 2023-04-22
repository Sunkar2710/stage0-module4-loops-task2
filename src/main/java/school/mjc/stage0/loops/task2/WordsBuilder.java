package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int letter = 0;
        while (letter < chars.length) {
            System.out.print(chars[letter++]);
        }
    }
}
