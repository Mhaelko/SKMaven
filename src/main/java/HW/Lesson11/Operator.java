package HW.Lesson11;

public class Operator {
    private Long id;
    private String name;

    public Operator(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Operator() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
