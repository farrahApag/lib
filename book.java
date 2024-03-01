package libmanangement;

 class book implements LibraryItem {
	 private String title;
	    private String author;
	    private int publicationYear;
	    private boolean borrowed;
	    private String borrower;

	    public book(String title, String author, int publicationYear) {
	        this.title = title;
	        this.author = author;
	        this.publicationYear = publicationYear;
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
	            System.out.println("Book '" + title + "' borrowed by " + userName + ".");
	        } else {
	            System.out.println("Book '" + title + "' is already borrowed.");
	        }
	    }

	    @Override
	    public void returnItem() {
	        if (borrowed) {
	            borrowed = false;
	            borrower = null;
	            System.out.println("Book '" + title + "' returned.");
	        } else {
	            System.out.println("Book '" + title + "' was not borrowed.");
	        }
	    }

	    @Override
	    public boolean isBorrowed() {
	        return borrowed;
	    }
	}