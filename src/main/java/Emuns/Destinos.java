package Emuns;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringá"),
    GOAIS("Góais"),
    RECIFE("Recife"),

    MANUS("Manus"),
    MIAMI("Miami"),
    CHICAGO("Chicago ");

    private String cidade  ;

   public String getCidade() {
       return this.cidade;
   }
    Destinos(String cidade) {
        this.cidade = cidade ;
    }

}
