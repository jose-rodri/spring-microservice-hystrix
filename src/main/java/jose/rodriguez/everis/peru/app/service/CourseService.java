package jose.rodriguez.everis.peru.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CourseService {

  @Autowired
  private RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "callProductApplication_Fallback")
  public String callProductApplication(){

      System.out.println("Fetching Courses Information");

      String response = restTemplate
              .exchange("http://localhost:8090/spring-courses/api/everis/courses"
                      , HttpMethod.GET
                      , null
                      , new ParameterizedTypeReference<String>() {
                      }
                      , "").getBody();

      System.out.println("Response Received from Courses Application");

      return "NORMAL CALL Successful" + "Curses Details:  " + response;

  }

  @SuppressWarnings("unused")
  private String callProductApplication_Fallback(){

      System.out.println("Courses Application is down! Fallback enabled!");

      return "CIRCUIT BREAKER ENABLED!! No response from Courses Application at this time";

  }

  

  
 //-- openning
  
  @HystrixCommand(fallbackMethod = "callOpeningApplication_Fallback")
  public String callOpeningApplication(){

      System.out.println("Fetching Opening Information");

      String response = restTemplate
              .exchange("http://localhost:8090/spring-openings/api/everis/openings"
                      , HttpMethod.GET
                      , null
                      , new ParameterizedTypeReference<String>() {
                      }
                      , "").getBody();

      System.out.println("Response Received from Openings Application");

      return "NORMAL CALL Successful" + "Opening Details:  " + response;

  }

  @SuppressWarnings("unused")
  private String callOpeningApplication_Fallback(){

      System.out.println("Opening Application is down! Fallback enabled!");

      return "CIRCUIT BREAKER ENABLED!! No response from Opening Application at this time";

  }
  
  //-- teacher
  
  @HystrixCommand(fallbackMethod = "callTeacherApplication_Fallback")
  public String callTeacherApplication(){

      System.out.println("Fetching teacher Information");

      String response = restTemplate
              .exchange("http://localhost:8090/spring-teachers/api/everis/teachers"
                      , HttpMethod.GET
                      , null
                      , new ParameterizedTypeReference<String>() {
                      }
                      , "").getBody();

      System.out.println("Response Received from Teacher Application");

      return "NORMAL CALL Successful" + "Teacher Details:  " + response;

  }

  @SuppressWarnings("unused")
  private String callTeacherApplication_Fallback(){

      System.out.println("Teacher Application is down! Fallback enabled!");

      return "CIRCUIT BREAKER ENABLED!! No response from Teacher Application at this time";

  }

  //-- parents
  
  @HystrixCommand(fallbackMethod = "callParentApplication_Fallback")
  public String callParentApplication(){

      System.out.println("Fetching parents Information");

      String response = restTemplate
              .exchange("http://localhost:8090/spring-parents/api/everis/parents"
                      , HttpMethod.GET
                      , null
                      , new ParameterizedTypeReference<String>() {
                      }
                      , "").getBody();

      System.out.println("Response Received from Parent Application");

      return "NORMAL CALL Successful" + "Parent Details:  " + response;

  }

  @SuppressWarnings("unused")
  private String callParentApplication_Fallback(){

      System.out.println("Parents Application is down! Fallback enabled!");

      return "CIRCUIT BREAKER ENABLED!! No response from Parent Application at this time";

  }

  
  // students
  
 //-- parents
  
  @HystrixCommand(fallbackMethod = "callStudentApplication_Fallback")
  public String callStudentApplication(){

      System.out.println("Fetching student Information");

      String response = restTemplate
              .exchange("http://localhost:8090/spring-students/api/everis/students"
                      , HttpMethod.GET
                      , null
                      , new ParameterizedTypeReference<String>() {
                      }
                      , "").getBody();

      System.out.println("Response Received from Student Application");

      return "NORMAL CALL Successful" + "Student Details:  " + response;

  }

  @SuppressWarnings("unused")
  private String callStudentApplication_Fallback(){

      System.out.println("Student Application is down! Fallback enabled!");

      return "CIRCUIT BREAKER ENABLED!! No response from Student Application at this time";

  }

  
  
}
