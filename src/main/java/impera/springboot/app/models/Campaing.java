package impera.springboot.app.models;

public class Campaing implements Cloneable{
    
    private Long id;
    private String name;

    public Campaing() {
    }

    public Campaing(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Campaing(this.getId(), this.getName());
        }
    }
}
