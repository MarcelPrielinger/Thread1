public class Main {
    public static void main(String[] args)
    {
        System.out.println("Start");

        DatePrinter dp1 = new DatePrinter();
        Thread th1 = new Thread(dp1);

        CountPrinter cp1 = new CountPrinter();
        Thread th2= new Thread(cp1);

        th1.start();
        th2.start();

        //Frage 1: Obwohl ich den Thread für das Datum zuerst starte laufen die Threads nicht parallel und das Datum wird erst Ausgegeben, wenn der counter fertig ist.
        //Frage 2: Zuerst wird der Counter komplett ausgegeben weil der Thread mit dem Datum länger braucht.
        //Frage 3: Ab dem der Counter bis 4000 zählt wird der Thread Datum und Counter am Ende gleichzeitig ausgegeben.
    }
}
