package CustomeException;

public class VoteAge extends Exception{

	private static final long serialVersionUID = 1L;

	public VoteAge(String messagge) {
		super(messagge);
	}
}
