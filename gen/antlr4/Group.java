package antlr4;

import java.util.List;

public class Group {
    private List<String> group;
    private String gr;

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public Group(String gr) {
        this.gr = gr;
    }

    public Group(List<String> group) {
        this.group = group;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }
}
