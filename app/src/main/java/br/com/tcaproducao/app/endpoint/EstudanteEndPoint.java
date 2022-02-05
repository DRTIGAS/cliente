package br.com.tcaproducao.app.endpoint;

import br.com.tcaproducao.app.model.Estudante;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("estudante")
public class EstudanteEndPoint {

@RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Estudante> listAll(){
        return asList(new Estudante("Thiago Alves"), new Estudante("Ana Paula"));
    }

}
