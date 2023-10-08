public abstract class UsuarioSistema {
    public static final int TIPO_RESERVADO = 1;
    public static final int TIPO_SECRETO = 2;
    public static final int TIPO_MUY_SECRETO = 3;

    public static final String RESERVADO = "RESERVADO";
    public static final String SERCRETO = "SECRETO";
    public static final String MUY_SECRETO = "MUY SECRETO";
    protected UsuarioSistema sigUsuarioSistema;
    public abstract void leerDocumento(String contenido, int tipo);

    public UsuarioSistema setUsuarioSistema(UsuarioSistema sigUsuarioSistema) {
        this.sigUsuarioSistema = sigUsuarioSistema;
        return this;
    }

    public UsuarioSistema getSigUsuarioSistema() {
        return sigUsuarioSistema;
    }

    public UsuarioSistema setSigUsuarioSistema(UsuarioSistema sigUsuarioSistema) {
        this.sigUsuarioSistema = sigUsuarioSistema;
        return this;
    }
}
