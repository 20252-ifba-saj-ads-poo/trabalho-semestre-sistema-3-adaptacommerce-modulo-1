package br.edu.ifba.saj.fwads.model;
public class FuncaoAC {
    int id;
    String name;
    protected String FuncaoAC;

    public FuncaoAC(int id, String name, String nomedafuncao) {
        this.id = id;
        this.name = name;
        this.FuncaoAC = nomedafuncao;
    }

    public class administrador extends FuncaoAC {
        public administrador(int id, String name) {
            super(id, name, "administrador");
        }
            
       
FuncaoAC funcao = new FuncaoACBuilder()
                .setId(1)
                .setName("Administrador")
                .build();

                FuncaoAC funcao2 = new FuncaoACBuilder()
                .setId(2)
                .setName("Financeiro")
                .build();

                FuncaoAC funcao3 = new FuncaoACBuilder()
                .setId(3)
                .setName("Vendedor")
                .build();

                FuncaoAC funcao4 = new FuncaoACBuilder()
                .setId(4)
                .setName("Estoquista")
                .build();}
 }


//  administrador, financeiro, vendedor, estoquista,
        //this.id = id;
       //this.name = name;  