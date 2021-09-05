package practice.project;

public class Test {
    private String str;

    public Test(String str) {
        this.str = str;
    }

    public void print() {
        System.out.println(str + " : " + str.hashCode());
    }
}
