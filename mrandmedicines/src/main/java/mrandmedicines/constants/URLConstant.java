package mrandmedicines.constants;

public final class URLConstant {
	public static final String GET_BY_ID="/representative/{id}";
	public static final String GET_ALL_REPRESENTATIVE="/representative";
	public static final String UPDATE_REPRESENTATIVE="/representative/{id}";
	public static final String CREATE_REPRESENTATIVE="/representative";
	public static final String DELETE_REPRESENTATIVE_BY_ID="/representative/{id}";
	
	private static URLConstant urlConstant=null;
	
	private URLConstant() {
		super();
	}
	
	public static URLConstant getURLConstantInstance() {
		if(urlConstant==null) {
			synchronized(URLConstant.class) {
				if(urlConstant==null) {
					urlConstant=new URLConstant();
				}
			}
		}
		return urlConstant;
	}
}
