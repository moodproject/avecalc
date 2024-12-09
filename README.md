# avecalc
_avecalc_ è un'applicazione desktop Java per aiutare studenti universitari a gestire la propria carriera universitaria.

## Descrizione
In _avecalc_, uno studente può aggiungere un nuovo esame, modificare o rimuovere un esame precedentemente inserito, o rimuovere tutti gli esami precedentemente inseriti. _avecalc_ calcola alcune statistiche: voto medio degli esami superati, numero complessivo di CFU, numero degli esami superati e voto di laurea (ipotetico).

## Istruzioni per gli sviluppatori
Il progetto è basato su *Maven*. Seguono alcune istruzioni utili per gli sviluppatori.

| Per fare qusto | Fai questo |
| -----------|-----------|
| Per ripulire il progetto | Digita `mvn clean` |
| Per modificare il codice sorgente | Modifica un file, o più file, in `src/main/java`.<br> Il main file, *Main.java*, si trova nel package di *calculator* |
| Per compilare il progetto | Digita `mvn compile` |
| Per eseguire il progetto | Digita `mvn compile exec:java` |
