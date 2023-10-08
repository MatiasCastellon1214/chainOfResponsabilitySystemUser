public class Presidente extends UsuarioSistema{
    @Override
    public void leerDocumento(String contenido, int tipo) {


        if(tipo == TIPO_RESERVADO){

            System.out.println("Tipo de Documento: " + RESERVADO);
            System.out.println("Al ser Presidente, usted puede leer el contenido del Documento.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if(tipo == 2){
            System.out.println("Tipo de Documento: " + SERCRETO);
            System.out.println("Al ser Presidente, usted puede leer el contenido del Documento.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if (tipo == 3) {
            System.out.println("Tipo de Documento: " + MUY_SECRETO);
            System.out.println("Al ser Presidente, usted puede leer el contenido del Documento.");
            System.out.println("Contenido:");
            System.out.println(contenido);
        } else if (this.sigUsuarioSistema != null) {
            this.sigUsuarioSistema.leerDocumento(contenido, tipo);
        }

    }
}
