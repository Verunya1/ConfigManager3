package antlr4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class MyLanguageWallker extends MyLanguageBaseListener{
    private List<LogEntry> entries = new ArrayList<>();
    private LogEntry current;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public List<String> gr = new ArrayList<>();
    String str;


    @Override
    public void enterEntry(MyLanguageParser.EntryContext ctx) {
        this.current = new LogEntry();
    }

    @Override
    public void enterSubject(MyLanguageParser.SubjectContext ctx) {
//        this.current.setSubject(ctx.getText());
            System.out.println(GSON.toJson(new Subject(ctx.SUBJECT().getText())));
    }

    @Override
    public void enterGroup(MyLanguageParser.GroupContext ctx) {
        for(int i = 0; i < ctx.GROUP().size();i++) {
            str=ctx.GROUP(i).getText();
            gr.add(str);
        }
        System.out.println(GSON.toJson(new Group(gr)));
    }

    @Override
    public void enterStudent(MyLanguageParser.StudentContext ctx) {
        for(int i = 0; i < ctx.AGE().size();i++){
        System.out.println(GSON.toJson(new Students(ctx.AGE().get(i).getText(),ctx.GROUP(i).getText(),ctx.STUDENT(i).getText())));
        }

    }

    @Override
    public void exitEntry(MyLanguageParser.EntryContext ctx) {
        this.entries.add(this.current);
    }
}
