import com.example.demo.Course;
import com.example.demo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
        @Autowired
    CourseRepository repository;

        @Override
    public void run(String... strings) throws Exception{
            Course course = new Course("Grocery Shopping", "12/2/18",
                    "Medium");
            repository.save(course);

            course = new Course("Engine Repair", "12/6/18",
                    "Urgent");
            repository.save(course);

            course = new Course("Air Freshener", "12/20/18",
                    "Light");
            repository.save(course);

        }

}
