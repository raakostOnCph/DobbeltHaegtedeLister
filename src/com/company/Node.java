package com.company;

public class Node {

    Node next = null;
    Node previous = null;

    String Kontainer;

    public Node(String kontainer) {
        Kontainer = kontainer;
    }

    public String getKontainer() {
        return Kontainer;
    }

    public void setKontainer(String kontainer) {
        Kontainer = kontainer;
    }


    // todo 11) du skal flytte din konto og personklasse fra sidte projekt over i indeværende projekt og ændre containeren så den er af typen konto. // opret klasserne og kopier indholdet over.
    // todo 12) lav nu de nødvendige der skal til for at du kan håndtere dine kontoer i din egen liste (stor opgave !)

}
