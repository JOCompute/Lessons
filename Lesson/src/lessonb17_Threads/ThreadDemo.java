package lessonb17_Threads;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread getTime = new GetTimeThread();
		Runnable getMail = new GetTheMail(10);
		Runnable getMailAgain = new GetTheMail(20);
		
		getTime.start();
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
		
	}
}
