//Maria Boichenko

// begin enum ShapesEnum
public enum ShapesEnum
{
	LINE      ( "Line" ), // line element
	RECTANGLE ( "Rectangle" ), // rectangle element
	OVAL      ( "Oval" ); // oval element
	
	private final String description; // string to contain a description of the shape
	
	// constructor to set the description of the shape
	ShapesEnum( String description )
	{
		this.description = description; // set the description
	}

	// override method toString() to return a description of the shape
	public String toString()
	{
		return description; // return the shape's description
	} // end method toString
	
	// constant to represent the number of elements in the list
	// constant is initialised at end of enum declaration so that all elements have been initialised
	public static final int LENGTH = ShapesEnum.values().length;

}; // end enum ShapesEnum