package API.cliniQ.controller;

import API.cliniQ.medicos.DadosCadastroMedico;
import API.cliniQ.medicos.DadosListagemMedico;
import API.cliniQ.medicos.Medico;
import API.cliniQ.medicos.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));

    }

    @GetMapping
    public List<DadosListagemMedico> listarMedico(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}