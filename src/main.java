/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args){
        final String regex = "((?:(?:for|if|while)))\\s*\\s*\\(.*?\\)\\s*(\\{(?:\\{[^\\{}]*\\}|.)*?\\})";
        final String string = "while(i<4){\n"
                + "	 if(){\n"
                + "	}\n"
                + "}" +
                " for (int i = 1; i <= matcher.groupCount(); i++) {\n" +
                "        System.out.println(\"Group \" + i + \": \" + matcher.group(i));\n" +
                "    }";

        final Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
                System.out.println("Group :"  + matcher.group(2));

        }

    }
}