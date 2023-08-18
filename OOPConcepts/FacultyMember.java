package OopConcepts;

public class FacultyMember extends LibraryMembers{

	public FacultyMember(int memberId, String name) {
		super(memberId, name);
	}

	@Override
	public void borrowItem(LibraryItem i) {
		System.out.println(getName() + " Faculty is borrowing " + i.getTitle()+" "+ "and the member id is: "+ getMemberId());
	}

}
