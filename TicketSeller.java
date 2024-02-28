public class TicketSeller {

    public static int getRandomInt(int min, int max) { // randomizing queue length
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static class getConcertTickets {
        int longQueue = getRandomInt(250, 350);
        AQueue<String> concert = new AQueue<String>(longQueue);

        public getConcertTickets(String ticketType, String savedUsername) {
            if (ticketType.equals("concert")) {
                for (int i = 0; i < longQueue; i++) {
                    concert.enqueue("a");
                }
                concert.enqueue(savedUsername);
            }
        }
    }
}