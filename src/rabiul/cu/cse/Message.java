package rabiul.cu.cse;

public class Message {
	long id;
	String address;
	long receivedAt;
	String message;

	Message(long id, String address, long receivedAt, String message) {
		this.id = id;
		this.address = address;
		this.receivedAt = receivedAt;
		this.message = message;
	}
}
