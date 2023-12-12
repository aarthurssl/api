package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.DTO.DadosCadastroMedicosDTO;
import med.voll.api.entitys.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class medicos {
    @Autowired
    MedicoRepository medico;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicosDTO json){
        medico.save(new Medico(json));
        System.out.println(json);
    }
}
