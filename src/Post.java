import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import java.util.Date;

public class Post {
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private int likes;
	public List <Comentario> comentarios = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Post (Date momento, String titulo, String conteudo, int likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
		
	}
	
	
	void ExibirPost() {
		System.out.println(titulo);
		System.out.println(likes +" Likes - " + sdf.format(momento));
		ExibirComentarios();
		System.out.print("\n\n\n");
	}
	
	void Comentar (Comentario c) {
		comentarios.add(c);
	}
	
	void ExibirComentarios() {
		for(Comentario c : comentarios)
			System.out.println(c.getTexto());
	}
}
