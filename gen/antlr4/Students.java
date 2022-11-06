package antlr4;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Students {
    private String age;
    private String  group;
    private String name;


    public Students(String age, String group, String name) {
        this.age = age;
        this.group = group;
        this.name = name;
    }

//    public Students(TerminalNode age_, TerminalNode group, TerminalNode student) {
//        this.age = age;
//        this.group = group;
//        this.name = name;
//    }
//
//    public TerminalNode getAge() {
//        return age;
//    }
//
//    public void setAge(TerminalNode age) {
//        this.age = age;
//    }
//
//    public TerminalNode getGroup() {
//        return group;
//    }
//
//    public void setGroup(TerminalNode group) {
//        this.group = group;
//    }
//
//    public TerminalNode getName() {
//        return name;
//    }
//
//    public void setName(TerminalNode name) {
//        this.name = name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    }
}
