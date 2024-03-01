package libmanangement;

import java.util.List;

abstract class LibraryUser {
	 private String name;

	    public LibraryUser(String name) {
	        this.name = name;
	    }

	    public abstract void performAction(List<LibraryItem> items);

	    public String getName() {
	        return name;
	    }
	}


