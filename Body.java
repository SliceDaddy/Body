// Coded by Jared Smith
// Code from page 42 
// Class name Body

// Additional code from book typed in by BLC 11 Feb 2015

class Body {
	public long idNum;
	public String name;
	public Body orbits;
	
	// Static variables do NOT go with objects, but rather with classes
	public static long nextID = 0;

// Above this line is the data
/* ------------------------------------------------------------------------ */
// Below this line is the behavior

	// A method that has the same name as the class is called 
	// a constructor

	// Constructors (two of them here; there could be more)
	Body() {
	   idNum = nextID++;
	   }
	
	 Body(String bodyName, Body orbitsAround) {
	  this();
	  name = bodyName;
	  orbits = orbitsAround;
	  }

	Body(String bodyName) {
	  this();
	  orbits = null;
	  name = bodyName;
	  }

	// Most classes will need a toString() so we can visualize the object
	public String toString() {
	   String desc = idNum + " (" + name + ")";
	   if (orbits != null) 
		desc += " orbits " + orbits.toString();
	   return desc;
	   }

}

