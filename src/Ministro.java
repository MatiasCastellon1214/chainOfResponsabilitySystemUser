public class Ministro extends  UsuarioSistema{
    @Override
    public void leerDocumento(String contenido, int tipo) {


        if(tipo == TIPO_RESERVADO){

            System.out.println("Tipo de Documento: " + RESERVADO);
            System.out.println("Al ser Ministro, usted puede leer el contenido del Documento. Además, el mismo será enviado al Presidente.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if(tipo == TIPO_SECRETO){

            System.out.println("Tipo de Documento: " + SERCRETO);
            System.out.println("Al ser Ministro, usted puede leer el contenido del Documento. Además, el mismo será enviado al Presidente.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if (tipo == TIPO_MUY_SECRETO) {

            System.out.println("Tipo de Documento: " + MUY_SECRETO);
            System.out.println("Al ser Ministro, usted NO puede leer el contenido del Documento. Sólo el Presidente tiene la capacidad de hacerlo. El Documento será enviado a su correspondiente autorizado de leerlo.");
        } else if (this.sigUsuarioSistema != null) {
            this.sigUsuarioSistema.leerDocumento(contenido, tipo);
        }
    }
}
