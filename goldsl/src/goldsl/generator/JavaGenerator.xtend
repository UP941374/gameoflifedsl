package goldsl.generator

import goldsl.tasksDSL.GameOfLife
import goldsl.tasksDSL.RuleType

class JavaGenerator {

	def static toJava(GameOfLife root) '''
			package GameOfLife;
			
			import java.awt.Point;
			import java.util.ArrayList;
			
			public class RulesOfLife {
			public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
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
					   
					   //RULES:
					   «IF Auxiliary.getRules(root).isEmpty()»
					   	if ((!gameBoard[i][j]) && (surrounding == 3)){
					   		survivingCells.add(new Point(i-1,j-1));
					   	} 
					   	/* rule B6 */
					   	if ((!gameBoard[i][j]) && (surrounding == 6)){
					   		survivingCells.add(new Point(i-1,j-1));
					   	} 
					   	/* rule S2 */
					   	if ((gameBoard[i][j]) && (surrounding == 2)){
					   		survivingCells.add(new Point(i-1,j-1));
					   	}
					   «ENDIF»
					   
					   «IF !Auxiliary.getRules(root).isEmpty()»
					   	«FOR rule : Auxiliary.getRules(root)»
					   		«IF rule.type === RuleType::STAY»
					   			if ((gameBoard[i][j]) && (surrounding «rule.sign» «rule.n»)){
					   				survivingCells.add(new Point(i-1,j-1));
					   			}
					   		«ENDIF»
					   		
					   		«IF rule.type === RuleType::COME_ALIVE»
					   			if ((!gameBoard[i][j]) && (surrounding «rule.sign» «rule.n»)){
					   				survivingCells.add(new Point(i-1,j-1));
					   			} 
					   		«ENDIF»
					   		
					   		«IF rule.type === RuleType::DIE»
					   			if ((gameBoard[i][j]) && (surrounding «rule.sign» «rule.n»)){
					   				/* only code for surviving cells, so do nothing if result is dead cell */
					   			}
					   		«ENDIF»
					   	«ENDFOR»
					   «ENDIF»
			}
			}	
			}
			
			public static void fillInitialGridFromDSL(ArrayList<Point> survivingCells) {
				«FOR cell : Auxiliary.getNormalCells(root)»
					survivingCells.add(new Point(«cell.x»,«cell.y»));
				«ENDFOR»
				// NABER
				«FOR cell : Auxiliary.getTransformedFillCells(root)»
					survivingCells.add(new Point(«cell.x»,«cell.y»));
				«ENDFOR»
			}
			

			public static int[] getGridSize() {
				int[] gridSize = new int[2];
				«IF root.grid !== null»
				gridSize[0] = «root.grid.height»;
				gridSize[1] = «root.grid.width»;
				«ELSE»
				gridSize[0] = 320;
				gridSize[1] = 320;
				«ENDIF»
				return gridSize;
			}
		}
	'''
}
