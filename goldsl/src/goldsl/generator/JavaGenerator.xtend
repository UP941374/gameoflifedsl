package goldsl.generator

import goldsl.tasksDSL.GameOfLife

class JavaGenerator {
	
	def static toJava(GameOfLife root)'''
		package GameOfLife;
		
		import java.awt.Point;
		import java.util.ArrayList;
		
		public class RulesOfLife {
			public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
				System.out.println("HOOOOOOOOOOOOOOOOOI");
				«FOR cell : Auxiliary.getNormalCells(root)»
				survivingCells.add(new Point(«cell.x»,«cell.y»));
				«ENDFOR»
				// NABER
				«FOR cell : Auxiliary.getTransformedFillCells(Auxiliary.getFillCells(root))»
				survivingCells.add(new Point(«cell.x»,«cell.y»));
				«ENDFOR»
				
«««				for(int i = 0; i < «Auxiliary.getFillCells(root).length()»; i++) {
«««					
«««				}
				
«««				«FOR c : Auxiliary.getCells(root)»survivingCells.add(new Point(«c.x»,«c.y»));«"\n"»«ENDFOR»
				
«««				«FOR c : Auxiliary.getMultiCells(root)»System.out.println("\t «c»");«"\n"»
«««					«IF (c.dir == Direction::NORTH)»
««««««						«FOR (int i = 1; i < c.no; i++)»
«««					«ENDIF»
«««				«ENDFOR»
«««				
«««				
«««				«FOR c : Auxiliary.getFillCells(root)»System.out.println("\t «c»");«"\n"»«ENDFOR»
«««				
«««				
«««				«FOR c : Auxiliary.getRules(root)»System.out.println("\t «c»");«"\n"»«ENDFOR»
				
«««				System.out.println(«Auxiliary.getCells(root)»);
				for (int i=1; i<gameBoard.length-1; i++) {
					for (int j=1; j<gameBoard[0].length-1; j++) {
						int surrounding = 0;
					    if (gameBoard[i-1][j-1]) { surrounding++; }
					    if (gameBoard[i-1][j])   { surrounding++; }
					    if (gameBoard[i-1][j+1]) { surrounding++; }
					    if (gameBoard[i][j-1])   { surrounding++; }
					    if (gameBoard[i][j+1])   { surrounding++; }
					    if (gameBoard[i+1][j-1]) { surrounding++; }
					    if (gameBoard[i+1][j])   { surrounding++; }
					    if (gameBoard[i+1][j+1]) { surrounding++; }
					    /* only code for surving cells, so no rule if result is dead cell */
					    /* rule B3 */
					    
«««					    if ((!gameBoard[i][j]) && (surrounding == 3)){
«««					    	survivingCells.add(new Point(i-1,j-1));
«««					    } 
«««					    /* rule B6 */
«««					    if ((!gameBoard[i][j]) && (surrounding == 6)){
«««					    	survivingCells.add(new Point(i-1,j-1));
«««					    } 
«««					    /* rule S2 */
«««					    if ((gameBoard[i][j]) && (surrounding == 2)){
«««					    	survivingCells.add(new Point(i-1,j-1));
«««					    }
					}
				}
			}
		} 
	'''
}
