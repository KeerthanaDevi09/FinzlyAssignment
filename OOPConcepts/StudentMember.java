package OopConcepts;

public class StudentMember extends LibraryMembers{

	public StudentMember(int memberId, String name) {
		super(memberId, name);
	}

	@Override
	public void borrowItem(LibraryItem i) {
		System.out.println(getName() + " Student is borrowing " + i.getTitle()+" "+ " and the member id is: "+ getMemberId());
		
	}

}
