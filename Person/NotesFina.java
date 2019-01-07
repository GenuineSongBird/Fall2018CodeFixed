/*final exam tuesday 9 am - 11:30 am
 * closed note
 * the solutions will be posted on blackboard
 * 
 * make s static method that takes in two integers and returns sum
 * public static int sum(int num1, int num2) {
 * 		int result = num1+num2;
 * return result;
 * }
 * 
 * call it in the main method
 * ...
 * MathSum.sum(number1, number2);
 * 
 * -------------------------------------------------------
 * 
 * create two overloaded methods that take the value of a password instance variable
 * 
 * public void assign(String pwd) {
 * 		this.password = Integer.parseInt(pwd);
 * }
 * public void assign(int pwd) {
 * 		this.password = pwd;
 * }
 * 
 * 
 * ---------------------------------------------------------------------
 * 
 * create a exception class called fatalCheeseException that has two constructors: the default that calls the parents constructor with an error message and one that takes in a message string that is passed to the parents constructor
 * 
 * public class fatalcheeseexception extends exception {
 * public fatalcheeseexceptio(){
 * 		super("Cheese gone bad!");
 * }
 * public FatalCheeseException(String msg) {
 * 		super(msg);
 * }
 * 
 * }
 * 
 * -----------------------------------------------------------
 * 
 * write a method called eatCheese in the given class cheese. this method returns no values and takes in two parametersc cocrresponding to the current month and year.
 * 
 * public class Cheese{
 * 	private string name
 * private int expmonth
 * private int expyear
 *write method here
 *public void eatCheese(int currentmonth,int currentYear)throws Fatal cheese exception { 
*	 if(currentyear < exp year) {
*			system.out.println("Cheese is edible");
*}
*	 else if(currentYear == expYear && currentMonth <= expMonth) {
*		system.out.println("Cheese is still good");
 * 
 * else {
 * throw new FatalCheeseException();
 * }
 * 
 * -------------------------------------------------
 * 
 * try 
 * {
 * 		c.eatCheese(month, year);
 * }
 * catch(fatalcheeseexception e) 
 * {
 * 		system.out.println(e.getmessage());
 * }
 * catch(exception e)
 * {
 *		 system.out.println(e.getmessage());
 * }
 * finally
 * {
 * 
 * }
 * 
 * 
 * ----------------------------------------------------------------
 * make code that reads a text file, and counts the amount of times the word "deer" is in this text file
 * 
 * public static int deetCounter(String fileName) {
 * try {
 * 		Scanner fileScanner = new Scanner(new File(fileName));
 * 		while(fileScanner.hasNext())
 * 		{
 * 		String currentWord = fileScanner.next();	
 * 		
 * 		if(currentword.toUpperCase().contains("DEER")) {
 * 			count++;
 *		 }
 * }
 * }
 * 
 * }
 * "a deer crosses the read"
 * "a 'deer"
 * 
 * 
 * ---------------------------------------------
 * 
 * public satic void  matrixWriter(int[][] matrix, String fileName) {
 * try{
 * 		printWriter fileWriter = new PrintWriter(new FileOutputStream(fileName, false));
 * 		for(int i = 0; i < marix.length; i++) {
 * 			for(int j = 0; j < matrix[i].length; j ++) {
 * 				fileWriter.print(matrix[i][j] + " ");	
 * 				
 * 				
 * 			}
 * 			fileWriter.println();
 * 		}
 * fileWriter.close(); saves the file
 * fileScanner.close();
 * } catch(IOException e) {
 * 		System.out.println(e.getMessage));
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * --------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

