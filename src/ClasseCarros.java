
public class ClasseCarros extends ClasseAutomotores{
int quantidadePortasAt;

//supper
public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, int quantidadePortasPar) {
	super(corPar, marcaPar, modeloPar, tipoPar);
	
	this.quantidadePortasAt = quantidadePortasPar;
}

public int pegarPortas(){
	return quantidadePortasAt;
}


public void AlterarPortas(int quantidadePortasPar){
	this.quantidadePortasAt = quantidadePortasPar;
}
}
