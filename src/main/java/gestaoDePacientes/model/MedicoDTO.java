package gestaoDePacientes.model;

public class MedicoDTO {

    private Long id;
    private String nome;
    private String especialidade;
    private String registroCRM;
    private String email;
    private String telefone;

    // Construtor padrão
    public MedicoDTO() {}

    // Construtor com parâmetros
    public MedicoDTO(Long id, String nome, String especialidade, String registroCRM, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.registroCRM = registroCRM;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistroCRM() {
        return registroCRM;
    }

    public void setRegistroCRM(String registroCRM) {
        this.registroCRM = registroCRM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
