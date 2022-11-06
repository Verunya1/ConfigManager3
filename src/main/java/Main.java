
import antlr4.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.Assert.assertThat;

public class Main {
    public static void main(String[] args) throws IOException {
//        MyLanguageLexer myLanguageLexer = new MyLanguageLexer(CharStreams.fromString("(^ ииии-11-11 тттт-12-12 )"));

        try {
            BufferedReader bufferedReader = new BufferedReader( new FileReader("src/main/java/test.txt"));
            String line;
            while ((line=bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e);
        }



            MyLanguageLexer myLanguageLexer = new MyLanguageLexer(CharStreams.fromFileName("src/main/java/test.txt"));


//        Hellexer = new HelloLexer(CharStreams.fromString("(^ ииии-11-11 тттт-12-12 )"));
            CommonTokenStream tokens = new CommonTokenStream(myLanguageLexer);
            MyLanguageParser parser = new MyLanguageParser(tokens);
            ParseTreeWalker walker = new ParseTreeWalker();
//        MyLanguageWallker logWalker = new MyLanguageWallker();
//        walker.walk(logWalker, parser.log());

//        assertThat(logWalker.get().size(), is(2));
//        parser.addParseListener(new MyLanguageWallker());
//        parser.log();

            ParseTree tree = parser.log();
//        ParseTree parseTree = parser.group();
//        ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new MyLanguageWallker(), tree);

//        ParseTree parseTree = parser.group();
//        walker.walk(new MyLanguageWallker(), parseTree);
//    }
//    https://www.pvsm.ru/maven/267721
        }
    }

