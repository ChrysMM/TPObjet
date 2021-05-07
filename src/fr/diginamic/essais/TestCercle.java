package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {
    public static void main (String[] args) {
        Cercle[]  cercles = new Cercle[2];
        cercles[0] = new Cercle(5);
         cercles[1] = new Cercle(10);

        for (Cercle o: cercles){
            System.out.println(o);
            System.out.println("peri" + o.peri());
            System.out.println("surf" + o.surface());
        }}
}
