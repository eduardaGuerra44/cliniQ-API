package API.cliniQ.controller;

import API.cliniQ.medicos.DadosCadastroMedico;
import API.cliniQ.medicos.DadosListagemMedico;
import API.cliniQ.medicos.Medico;
import API.cliniQ.medicos.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



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
    public Page<DadosListagemMedico> listarMedico(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}