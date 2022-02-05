package br.com.tcaproducao.app.endpoint;

import br.com.tcaproducao.app.model.Estudante;
import br.com.tcaproducao.app.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("estudante")
public class EstudanteEndPoint {
    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Estudante> listAll() {
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Estudante("Thiago Alves"), new Estudante("Ana Paula"));
    }

}
