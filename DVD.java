package libmanangement;

class DVD implements LibraryItem {
	 private String title;
	    private String director;
	    private int runningTime;
	    private boolean borrowed;
	    private String borrower;

	    public DVD(String title, String director, int runningTime) {
	        this.title = title;
	        this.director = director;
	        this.runningTime = runningTime;
	        this.borrowed = false;
	        this.borrower = null;
	    }

	    // Getter method for title
	    public String getTitle() {
	        return title;
	    }

	    @Override
	    public void borrowItem(String userName) {
	        if (!borrowed) {
	            borrowed = true;
	            borrower = userName;
	            System.out.println("DVD '" + title + "' borrowed by " + userName + ".");
	        } else {
	            System.out.println("DVD '" + title + "' is already borrowed.");
	        }
	    }

	    @Override
	    public void returnItem() {
	        if (borrowed) {
	            borrowed = false;
	            borrower = null;
	            System.out.println("DVD '" + title + "' returned.");
	        } else {
	            System.out.println("DVD '" + title + "' was not borrowed.");
	        }
	    }

	    @Override
	    public boolean isBorrowed() {
	        return borrowed;
	    }
	}
