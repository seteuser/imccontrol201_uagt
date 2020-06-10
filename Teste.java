class Teste {

  public void executar() {

    Aluno a = new Aluno("Dolores");
		Aluno b = new Aluno("Belmiro Silva");
		
    Avaliacao amatricula = new Avaliacao(90,2);
    Avaliacao acontrole1 = new Avaliacao(70,1);

    a.setAvaliacao(amatricula);
    b.setAvaliacao(acontrole1);
    
   






    //Relatorio saida
    System.out.println("Listagem de alunos:");
    mostraAluno(a);
    mostraAluno(b);


  }
   

  public void mostraAluno(Aluno aluno) {
    
    System.out.println("\n" + aluno.getNome());

    Avaliacao avaliacao = aluno.getAvaliacao();
   
    System.out.println("Indice = " + avaliacao.indice());   
    System.out.println("Categoria = " + avaliacao.classificacao());

 

  }








}
