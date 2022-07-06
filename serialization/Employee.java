package serialization;  
import java.io.Serializable;

class Employee implements Serializable{
    private static final long serialVersionUID = 1L; 
    int id;
    String name;
    Employee(int id, String name) {
          this.id = id;
          this.name = name; 
    }
}
