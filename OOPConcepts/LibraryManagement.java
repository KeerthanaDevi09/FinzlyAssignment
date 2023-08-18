package OopConcepts;

public class LibraryManagement {

	public static void main(String[] args) {
		Book b=new Book("J.K.Rowling","Harry Potter",101);
		DVD d=new DVD(30,"Motivation song",102);
		b.displayInfo();
		d.displayInfo();
		LibraryMembers s=new StudentMember(10,"Keerthi");
		LibraryMembers f=new FacultyMember(11,"Aruna");
		s.borrowItem(b);
		f.borrowItem(d);
		
		Reservable reservableStudent = (Reservable) s;
        Reservable reservableFaculty = (Reservable) f;

        reservableStudent.reserveItem(b);
        reservableFaculty.reserveItem(d);

	}

}
