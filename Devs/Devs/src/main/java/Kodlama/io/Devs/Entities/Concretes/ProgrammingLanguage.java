package Kodlama.io.Devs.Entities.Concretes;

public class ProgrammingLanguage {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ProgrammingLanguage(){}
    public ProgrammingLanguage(int id, String name){
        this.id = id;
        this.name = name;
    }
}
