import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Vowels {
    private String text;
    private List<String> textSplit;

    public Vowels(String text) throws Exception {
        if(text.equals(""))
            throw new Exception("The string is empty.");
        this.text = text;
        textSplit = new ArrayList<>();
    }

    public List<String> getTextSplit(){
        return textSplit;
    }

    public void splittingText() throws Exception {
        Pattern pattern = Pattern.compile("[,.]|\\s");
        String[] tmp = pattern.split(text, 0);

        for (String s : tmp)
            if (s.matches("^(?i:[aeiouy][a-z,A-Z]).*"))
                textSplit.add(s);

        if(textSplit.size() == 0){
            throw new Exception("There`re no one word which pass the pattern.");
        }

        SortManager.Inner_class1 temp = new SortManager.Inner_class1();
        textSplit.sort(temp);

        output();
    }

    public void output(){
        for(var item: textSplit)
            System.out.println(item);
    }

}
