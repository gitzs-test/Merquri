package Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

class Student{
    public String name;
    public String gender;
    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

