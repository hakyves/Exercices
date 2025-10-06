package Java8Ex;

public class Employee {
    private int id;
    private String name;
    private String title;
    public Employee(){

    }


    public Employee(int id,String name, String title) {
        this.id = id;
        this.name = name;
        this.title =title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\n';
    }
}
