package br.com.thiago.springboot.endpoint;

import br.com.thiago.springboot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndPoint {
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll(){
    return asList(new Student("Thiago Alves"), new Student("Henrique Alves"));
    }
}
