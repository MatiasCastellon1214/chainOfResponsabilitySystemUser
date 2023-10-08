public class Diputado extends UsuarioSistema{

    @Override
    public void leerDocumento(String contenido, int tipo) {
        String tipoDocumento = "";
        if(tipo == TIPO_RESERVADO){

            System.out.println("Tipo de Documento: " + RESERVADO);
            System.out.println("Al ser Diputado, usted puede leer el contenido del Documento. Además, el mismo será enviado a Ministros y Presidente.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if(tipo == TIPO_SECRETO){

            System.out.println("Tipo de Documento: " + SERCRETO);
            System.out.println("Al ser Diputado, usted NO puede leer el contenido del Documento. El mismo será enviado a Ministros y Presidente.");
        } else if (tipo == TIPO_MUY_SECRETO) {

            System.out.println("Tipo de Documento: " + MUY_SECRETO);
            System.out.println("Al ser Diputado, usted NO puede leer el contenido del Documento. El mismo será enviado al Presidente.");
        } else if (this.sigUsuarioSistema != null) {
            this.sigUsuarioSistema.leerDocumento(contenido, tipo);
        }
    }
}
