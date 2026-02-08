package br.com.gerencia_projetos.domain;

public enum Status {
    EM_ANDAMENTO(1),
    CONCLUIDO(2),
    NAO_INICIADO(3),
    ATRASADO(4);

    private Integer codigo;

    Status(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    } 

    public static Status fromCode(Integer codigo) {
        for (Status status : Status.values()) {
            if (status.getCodigo().equals(codigo)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código de Status inválido: " + codigo);
    }
}
