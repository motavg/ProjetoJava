package model;
/**
 * Classe para representar o cliente
 * @author Vinícius Mota
 * */
public class CadastroCliente {
    private String cpf;
    private String nome;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String telefone;

    // Construtor
    
    /**
     * @param cpf que indentifica o cliente
     * @param nome cliente
     * @param logradouro do cliente
     * @param numero casa/apt do cliente
     * @param cidade do cliente
     * @param estado do cliente 
     * @param telefone do cliente
     * 
     * */
    public CadastroCliente(String cpf, String nome, String logradouro, String numero, String cidade, String estado, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }

    // Getters e Setters
    /**
     * obter o cpf do cleinte
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * Metodo para configurar o cpf do cliente
     * @param cpf do cliente
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * obter o nome do cliente
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo para configurar o nome do cliente
     * @param nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     *  obter o logradouro do cliente
     * @return logradouro do cliente
     */
    public String getLogradouro() {
        return logradouro;
    }
    /**
     * Metodo para configurar o logradouro do cliente
     * @param logradouro do cliente
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    /**
     * obter o numero do cliente
     * @return numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Metodo para configurar o numero do cliente
     * @param numero do cliente
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * obter o cidade do cliente
     * @return cidade
     */
    public String getCidade() {
        return cidade;
    }
    /**
     * Metodo para configurar o cidade do cliente
     * @param cidade do cliente
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * obter o estado do cliente
     * @return estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Metodo para configurar o estado do cliente
     * @param estado do cliente
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * obter o telefone do cliente
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Metodo para configurar o telefone do cliente
     * @param telefone do cliente
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}

