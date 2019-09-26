package jose.rodriguez.everis.peru.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jose.rodriguez.everis.peru.app.service.CourseService;


@RestController
public class CourseController {


  @Autowired
  CourseService courseService;

  @GetMapping(value = "/getCourses")
  public String getProducts(){
      System.out.println("Making a call to the course application");
      return courseService.callProductApplication();
  }
  
  @GetMapping(value = "/getOpenings")
  public String getOpenings(){
      System.out.println("Making a call to the opening application");
      return courseService.callOpeningApplication();
  }
  
  @GetMapping(value = "/getTeachers")
  public String getTeachers(){
      System.out.println("Making a call to the teacher application");
      return courseService.callTeacherApplication();
  }
  @GetMapping(value = "/getParents")
  public String getParents(){
      System.out.println("Making a call to the parents application");
      return courseService.callParentApplication();
  }
  @GetMapping(value = "/getStudents")
  public String getStudents(){
      System.out.println("Making a call to the student application");
      return courseService.callStudentApplication();
  }
  
}
