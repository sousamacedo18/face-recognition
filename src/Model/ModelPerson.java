
package Model;

public class ModelPerson {
       private int id;
  private String name;
  
    
    public ModelPerson() {

    }
    public ModelPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

  


  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
