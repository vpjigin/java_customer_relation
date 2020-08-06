package entity;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Category {
    private int id;
    private String name;

    public Category() {
    }
    
    public Category(int id, String name) {
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
    
    public static Type getCategoryType(){
        return new TypeToken<List<Category>>(){}.getType();
    }
}
