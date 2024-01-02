package desing.pattern.behavioral.swtch.test;

public class AdminintradorDiasSegunTipoUsuario {

	public static final int USUARIO_AFILIADO = 1;
	public static final int USUARIO_EMPLEADO = 2;
	public static final int USUARIO_INVITADO = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoUsuario tipousuario = new UsuarioAfiliado();
		System.out.println(optenerDiasSegunTipoUsuario(tipousuario));
	}

	public static int optenerDiasSegunTipoUsuario(TipoUsuario tipoUsuario) {
		return tipoUsuario.getDiaSegunTipoUsuario();
	}

}
