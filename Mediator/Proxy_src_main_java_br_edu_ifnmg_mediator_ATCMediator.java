package br.edu.ifnmg.mediator;

import java.util.List;
import java.util.Random;

/**
 *
 * @author analu
 */
public class ATCMediator {

    public ATCMediator() {
    }

    public synchronized void setRunaway(List<Plane> contactedPlanes) throws InterruptedException {
        for (int i = 0; i < contactedPlanes.size(); i++) {
            System.out.println("ATC "
                    + contactedPlanes.get(i).getATCName()
                    + ": Avião " + contactedPlanes.get(i).getPlaneName()
                    + " autorizado a pousar.");

            // Simula o tempo de pouso (aleatório)
            Random random = new Random();
            int tempoPouso = random.nextInt(10) + 3; // Entre 1 e 10 segundos
            System.out.println("Pista ocupada");
            Thread.sleep(tempoPouso * 1000);

            notify(); // Libera a pista para o próximo avião
            System.out.println("Pista liberada.");
            System.out.println();
        }
    }
}
