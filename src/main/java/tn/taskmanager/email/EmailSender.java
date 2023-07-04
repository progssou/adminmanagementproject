package tn.taskmanager.email;

public interface EmailSender {
	abstract void send(String to, String email);
}
