import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Post p = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia",
				"Estou indo conhecer esse país maravilhoso", 12);

		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa Noite", "Ate amanha", 5);

		Comentario c1 = new Comentario("Boa viagem!");
		Comentario c2 = new Comentario("Voce Merece!");
		Comentario c3 = new Comentario("Boa noite pra vc tbm");
		Comentario c4 = new Comentario("Bom descanso");

		p.Comentar(c1);
		p.Comentar(c2);
		p2.Comentar(c3);
		p2.Comentar(c4);

		p.ExibirPost();
		p2.ExibirPost();

	}

}
