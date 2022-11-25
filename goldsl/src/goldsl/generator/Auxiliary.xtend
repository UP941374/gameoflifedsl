package goldsl.generator

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

	def static List<TempCell> getTransformedFillCells(GameOfLife root) {
		var List<TempCell> nCellsList = new ArrayList<TempCell>();

		for (cell : root.cells) {
			for (fCell : root.fillCells) {
				var tempX = fCell.x;
				var tempY = fCell.y; // -1
				for (var i = 0; i < fCell.repAmount; i++) { // rep: 4
					if (!(tempX < 0 || tempX > root.grid.width || tempY < 0 || tempY > root.grid.height)) { // -1 < 0
						switch (fCell.dir) {
							case (Direction::NORTH): {
								nCellsList.add(new TempCell(fCell.x, tempY--));
							}
							case (Direction::EAST): {
								nCellsList.add(new TempCell(tempX++, fCell.y));
							}
							case (Direction::SOUTH): {
								nCellsList.add(new TempCell(fCell.x, tempY++));
							}
							case (Direction::WEST): {
								nCellsList.add(new TempCell(tempX--, fCell.y));
							}
						}
					}
				}
			}
		}

		return nCellsList;
	}

	def static List<Rule> getRules(GameOfLife root) {
		var List<Rule> rulesList = new ArrayList<Rule>();
		rulesList = root.rules;
		return rulesList;
	}
}
