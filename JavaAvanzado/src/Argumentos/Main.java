package Argumentos;

public class Main {
    public static void main(String[] args){
        OptionsParser optionparser = new OptionsParser(args);
        optionparser.registerOption("minVal");
        optionparser.registerOption("maxVal");

        optionparser.parse();

        String minVal = optionparser.getOption("minVal");
        System.out.println("minVal: " + minVal);
    }
}
