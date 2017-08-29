package practice10;

public class Ass3 {
	public static void main(String[] args) {

		while (true) {
			long milli = System.currentTimeMillis();
			long seconds = milli / 1000;
			long currentSecond = seconds % 60;
			long minutes = seconds / 60;
			long currentMin = minutes % 60;
			long hours = currentMin / 60;
			long currentHours = hours % 24;

			System.out.println(currentHours + "Ω√ " + currentMin + "∫– "
					+ currentSecond + "√ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
