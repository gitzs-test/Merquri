package Student;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate template;
    @PostConstruct
    public void createTable() {
        template.execute("CREATE TABLE student(id bigint auto_increment primary key,
                name VARCHAR(50), gender VARCHAR(1))");
    }
    public void createStudent(String name, String gender) {
        template.update("INSERT INTO student(id, name, gender) VALUES (?,?,?)",
                null, name, gender);
    }
    public List<Student> findStudentByName(String nameStartsWith) {
        // Write your code here
        String query = "SELECT * student WHERE name like '?%'";
        List<Student> students = template.query(query, nameStartsWith);
    }
