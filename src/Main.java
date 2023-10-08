// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UsuarioSistema usuarioDiputado = new Diputado().setSigUsuarioSistema(new Ministro().setUsuarioSistema(new Presidente()));
        UsuarioSistema usuarioMinistro = new Ministro().setSigUsuarioSistema(new Presidente());
        UsuarioSistema usuarioPresidente = new Presidente();

        System.out.println("-------------------------");
        usuarioDiputado.leerDocumento("Que hace hermano", 3);
        usuarioDiputado.leerDocumento("Que hace hermano", 2);
        usuarioDiputado.leerDocumento("Que hace hermano", 1);


        System.out.println("-------------------------");
        usuarioMinistro.leerDocumento("Heeeee loco", 3);
        usuarioMinistro.leerDocumento("Heeeee loco", 2);
        usuarioMinistro.leerDocumento("Heeeee loco", 1);


        System.out.println("-------------------------");
        usuarioPresidente.leerDocumento("Que hacelga", 3);
        usuarioPresidente.leerDocumento("Que hacelga", 2);
        usuarioPresidente.leerDocumento("Que hacelga", 1);

    }
}