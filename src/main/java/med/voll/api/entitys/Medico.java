package med.voll.api.entitys;

import jakarta.persistence.*;
import med.voll.api.DTO.DadosCadastroMedicosDTO;
import med.voll.api.DTO.EspecialidadeDTO;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private EspecialidadeDTO especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedicosDTO json) {
        this.nome = json.nome();
        this.email=json.email();
        this.telefone = json.telefone();
        this.crm = json.crm();
        this.especialidade=json.especialidade();
        this.endereco = new Endereco(json.endereco());
    }
}
