package goldsl.generator

import goldsl.tasksDSL.Cell
import goldsl.tasksDSL.Direction
import goldsl.tasksDSL.FillCell
import goldsl.tasksDSL.GameOfLife
import goldsl.tasksDSL.NormalCell
import goldsl.tasksDSL.Rule
import java.util.ArrayList
import java.util.List

class TempCell {
	int x;
	int y;

	new(int a, int b) {
		x = a;
		y = b;
	}

	def getX() {
		return x;
	}

	def getY() {
		return y;
	}
}

class Auxiliary {
// generate a list of individual cells
//	def static List<NormalCell> getCells(GameOfLife root) {
//		var List<FillCell> cellsList2 = new ArrayList<FillCell>();
//		var List<Cell> h = new ArrayList<Cell>();
//
////		cellsList = h.nCells;
////		for (var i = 0; i < root.cells.length(); i++) {
////			// create normal cells from fillCells
////			for(hoi:root.cells.get(i).fillCells){
////				cellsList2.add(hoi);				
////			} 			
////		}
//		return h;
//
//	}
	def static List<NormalCell> getNormalCells(GameOfLife root) {
		var List<NormalCell> nCellsList = new ArrayList<NormalCell>();

		for (cells : root.cells) {
			nCellsList.addAll(cells.NCells);
		}
		return nCellsList;
	}

	def static List<FillCell> getFillCells(GameOfLife root) {
		var List<FillCell> fCellsList = new ArrayList<FillCell>();

		for (cells : root.cells) {
			fCellsList.addAll(cells.fillCells);
		}
		return fCellsList;
	}

	def static List<TempCell> getTransformedFillCells(List<FillCell> fCells) {
		var List<TempCell> nCellsList = new ArrayList<TempCell>();

		for (fCell : fCells) {
			var tempX = fCell.x;
			var tempY = fCell.y;

			for (var i = 0; i < fCell.repAmount; i++) {
				switch (fCell.dir) {
					case (Direction::NORTH): {
						nCellsList.add(new TempCell(fCell.x, tempY++));
					}
					case (Direction::EAST): {
						nCellsList.add(new TempCell(tempX++, fCell.y));
					}
					case (Direction::SOUTH): {
						nCellsList.add(new TempCell(fCell.x, tempY--));
					}
					case (Direction::WEST): {
						nCellsList.add(new TempCell(tempX--, fCell.y));
					}
				}
			}
		}

		return nCellsList;
	}

//	def static List<Cells> getMultiCells(Gameoflife root) {
//		var List<Cells> cellsList = new ArrayList<Cells>();
//		cellsList = root.multiCells;
//
//		var List<Cell> transformedCells = new ArrayList<Cell>();
//		for (mc : cellsList) {
//			switch (mc.dir) {
//				case (Direction::NORTH): {
////					transformedCells.add();
//				}
//				case (Direction::EAST): {
//				}
//				case (Direction::SOUTH): {
//				}
//				case (Direction::WEST): {
//				}
//			}
//		}
//
//		return cellsList;
//	}
//
//	def static List<FillCell> getFillCells(Gameoflife root) {
//		var List<FillCell> cellsList = new ArrayList<FillCell>();
//		cellsList = root.fillCells;
//
//		return cellsList;
//	}
	def static List<Rule> getRules(GameOfLife root) {
		var List<Rule> rulesList = new ArrayList<Rule>();
		rulesList = root.rules;
		return rulesList;
	}
}
