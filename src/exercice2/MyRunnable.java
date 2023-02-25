package exercice2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Le thread a démarré");
    }
    
    public static void main(String[] args) {
        // Création d'un nouveau thread
        Thread thread = new Thread(new MyRunnable());

        // Démarrage du thread
        thread.start();

        // Attendre que le thread se termine
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Le thread a été interrompu");
        }

        System.out.println("Le thread a terminé");
    }
}