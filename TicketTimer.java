import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketTimer implements ActionListener {

	Timer t;
	AQueue<String> concert;
	AQueue<String> theatre;
	AQueue<String> sports;
	int concertAmount;
	int theatreAmount;
	int sportsAmount;
	int sportButtonClickedNumber;
	int theatreButtonClickedNumber;
	int concertButtonClickedNumber;
	JTextField textStatingPositioninQueue;

	public TicketTimer(AQueue<String> c, AQueue<String> th, AQueue<String> s, int concertA, int theatreA, int sportsA, int concertClicks, int theatreClicks, int sportClicks, JTextField inputTextStatingPositioninQueue) {
		t = new Timer(2000, this::actionPerformed);
		concert = c;
		theatre = th;
		sports = s;
		concertAmount = concertA;
		theatreAmount = theatreA;
		sportsAmount = sportsA;
		sportButtonClickedNumber = sportClicks;
		concertButtonClickedNumber = concertClicks;
		theatreButtonClickedNumber = theatreClicks;
		textStatingPositioninQueue = inputTextStatingPositioninQueue;

        t.start();
	}

	public static int random(int min, int max) { // randomizing queue length
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < random(1, 5); i++) {

            if (concertButtonClickedNumber >= 2) {
                concert.dequeue();
                concertAmount--;
            }
            if (theatreButtonClickedNumber >= 2) {
                theatre.dequeue();
                theatreAmount--;

            }
            if (sportButtonClickedNumber >= 2) {
                sports.dequeue();
                sportsAmount--;
            }
        }

		JTextField textStatingPositioninQueue = new JTextField("Your Position in the Queue: " + sportsAmount);
		textStatingPositioninQueue.setBounds(100,290,600,90);
		textStatingPositioninQueue.setBorder(null);
	}
	
	public int getConcert() {
		return concertAmount;
	}
	public int getTheatre() {
		return theatreAmount;
	}
	public int getSports() {
		return sportsAmount;
	}

	public JTextField getTextStatingPositioninQueue() {
		return textStatingPositioninQueue;
	}
}